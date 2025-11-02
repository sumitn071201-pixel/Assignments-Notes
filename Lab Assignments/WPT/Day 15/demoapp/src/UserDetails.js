import React, { Component } from 'react';

const GraduateComponent = ({ onChange, values }) => (
  <div>
    <h4>Graduate Details</h4>
    <label>
      Degree:
      <input
        type="text"
        name="degree"
        value={values.degree || ''}
        onChange={onChange}
      />
    </label>
    <label>
      Year:
      <input
        type="number"
        name="year"
        value={values.year || ''}
        onChange={onChange}
      />
    </label>
    <label>
      Final Year Score:
      <input
        type="text"
        name="finalYearScore"
        value={values.finalYearScore || ''}
        onChange={onChange}
      />
    </label>
    <label>
      University:
      <input
        type="text"
        name="university"
        value={values.university || ''}
        onChange={onChange}
      />
    </label>
  </div>
);

const PGComponent = ({ onChange, values }) => (
  <div>
    <h4>Post Graduate Details</h4>
    <label>
      Year:
      <input
        type="number"
        name="year"
        value={values.year || ''}
        onChange={onChange}
      />
    </label>
    <label>
      Thesis Subject:
      <input
        type="text"
        name="thesisSubject"
        value={values.thesisSubject || ''}
        onChange={onChange}
      />
    </label>
  </div>
);

const UnderGradComponent = ({ onChange, values }) => (
  <div>
    <h4>Under Graduate (High School) Details</h4>
    <label>
      SSC Score/Grade:
      <input
        type="text"
        name="ssc"
        value={values.ssc || ''}
        onChange={onChange}
      />
    </label>
    <label>
      HSC Score/Grade:
      <input
        type="text"
        name="hsc"
        value={values.hsc || ''}
        onChange={onChange}
      />
    </label>
  </div>
);

const initialFormData = {
  name: '',
  email: '',
  educationLevel: '',
};

class UserDetails extends Component {
  constructor(props) {
    super(props);
    this.state = {
      formData: initialFormData,
    };
    
    this.handleChange = this.handleChange.bind(this);
    this.handleLevelChange = this.handleLevelChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.renderEducationalDetails = this.renderEducationalDetails.bind(this);
  }

  handleChange(e) {
    const { name, value } = e.target;
    this.setState((prevState) => ({
      formData: {
        ...prevState.formData,
        [name]: value,
      },
    }));
  }

  handleLevelChange(e) {
    const newLevel = e.target.value;
    const { name, email } = this.state.formData;
    
    this.setState({
      formData: {
        ...initialFormData,
        name: name,
        email: email,
        educationLevel: newLevel,
      },
    });
  }

  renderEducationalDetails() {
    const { formData } = this.state;
    const props = {
      onChange: this.handleChange,
      values: formData,
    };

    switch (formData.educationLevel) {
      case 'Graduate':
        return <GraduateComponent {...props} />;
      case 'PG':
        return <PGComponent {...props} />;
      case 'UnderGrad':
        return <UnderGradComponent {...props} />;
      default:
        return <p>Select an Education Level to continue.</p>;
    }
  }

  handleSubmit(e) {
    e.preventDefault();
    console.log('Final Form Data:', this.state.formData);
    alert(`Form Submitted! Check console for full data. Level: ${this.state.formData.educationLevel}`);
  }

  render() {
    const { formData } = this.state;

    return (
      <form onSubmit={this.handleSubmit}>
        <h3>User Details Form</h3>

        <label>
          Name:
          <input
            type="text"
            name="name"
            value={formData.name}
            onChange={this.handleChange}
            required
          />
        </label>
        <br />

        <label>
          Email:
          <input
            type="email"
            name="email"
            value={formData.email}
            onChange={this.handleChange}
            required
          />
        </label>
        <br />

        <label>
          Education Level:
          <select
            name="educationLevel"
            value={formData.educationLevel}
            onChange={this.handleLevelChange}
            required
          >
            <option value="">-- Select Level --</option>
            <option value="Graduate">Graduate</option>
            <option value="PG">PG</option>
            <option value="UnderGrad">UnderGrad</option>
          </select>
        </label>
        <br />

        {this.renderEducationalDetails()}

        <button type="submit" disabled={!formData.educationLevel}>
          Submit Details
        </button>
        
        <p>
          Current Selection: <strong>{formData.educationLevel || 'None'}</strong>
        </p>
      </form>
    );
  }
}

export default UserDetails;