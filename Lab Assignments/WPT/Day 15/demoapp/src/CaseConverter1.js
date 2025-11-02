import { Component } from "react";

export default class CaseConverter1 extends Component {
  constructor(props) {
    super(props);
    this.state = {
      inputText: "",
      outputText: "",
      caseType: "none",
    };
    this.handleCaseChange = this.handleCaseChange.bind(this);
    this.handleInputChange = this.handleInputChange.bind(this);
  }

  toTitleCase(text) {
    if (!text) return "";
    return text.toLowerCase().split(' ').map((word) => {
      return word.charAt(0).toUpperCase() + word.slice(1);
    }).join(' ');
  }

  handleInputChange(e) {
    const newText = e.target.value;
    this.setState({
      inputText: newText,
    }, () => {
      this.updateOutput(this.state.caseType, newText);
    });
  }

  handleCaseChange(e) {
    const newCaseType = e.target.value;

    this.setState({
      caseType: newCaseType,
    }, () => {
      this.updateOutput(newCaseType, this.state.inputText);
    });
  }

  updateOutput(caseType, text) {
    let output = text;

    switch (caseType) {
      case 'uppercase':
        output = text.toUpperCase();
        break;
      case 'lowercase':
        output = text.toLowerCase();
        break;
      case 'titlecase':
        output = this.toTitleCase(text);
        break;
      default:
        output = text;
        break;
    }

    this.setState({
      outputText: output,
    });
  }

  render() {
    return (
      <div>
        <h2>Text Case Converter</h2>
        
        <div>
          <label htmlFor="text-input">Enter Text: </label>
          <input
            type="text"
            id="text-input"
            value={this.state.inputText}
            onChange={this.handleInputChange}
          />
        </div>

        <div>
          <span>Select Case:</span>
          
          <label>
            <input
              type="radio"
              name="caseSelector"
              value="uppercase"
              checked={this.state.caseType === 'uppercase'}
              onChange={this.handleCaseChange}
            />
            Uppercase
          </label>
          
          <label>
            <input
              type="radio"
              name="caseSelector"
              value="lowercase"
              checked={this.state.caseType === 'lowercase'}
              onChange={this.handleCaseChange}
            />
            Lowercase
          </label>
          
          <label>
            <input
              type="radio"
              name="caseSelector"
              value="titlecase"
              checked={this.state.caseType === 'titlecase'}
              onChange={this.handleCaseChange}
            />
            Title Case
          </label>
        </div>

        <div>
         <p>Converted Text:  {this.state.outputText}</p>
        </div>
      </div>
    );
  }
}