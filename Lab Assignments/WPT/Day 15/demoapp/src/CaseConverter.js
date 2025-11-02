import { Component } from "react";
export default class CaseConverter extends Component{
constructor(props) {
    super(props);
    this.state = {
      inputText: "",
      outputText: "",
    };
    this.myeventHandler = this.myeventHandler.bind(this);
    this.handleInputChange = this.handleInputChange.bind(this);
  }

  handleInputChange(e) {
    this.setState({
      inputText: e.target.value,
    });
  }

  myeventHandler(e) {
    let text = this.state.inputText;
    let buttonVal = e.target.value;
    let output = "";

    if (buttonVal === "Upper") {
      output = text.toUpperCase();
      console.log("Uppercase:", output);
    } else if (buttonVal === "Lower") {
      output = text.toLowerCase();
      console.log("Lowercase:", output);
    }

    this.setState({
      outputText: output,
    });
  }

 render() {
    return (
      <>
        <h2>CaseConverter</h2>
        <div>
          Enter Text{" "}
          <input
            type="text"
            id="t1"
            value={this.state.inputText}
            onChange={this.handleInputChange}
          ></input>
          <br />
          <br />
          <button value="Upper" onClick={this.myeventHandler}>
            Uppercase
          </button>
          <br />
          <br />
          <button value="Lower" onClick={this.myeventHandler}>
            Lowercase
          </button>
          <br />
          <br />
          <p>
            Converted Text: {this.state.outputText}
          </p>
        </div>
      </>
    );
  }
}
   
