import { Component } from "react";

export default class Factorial1 extends Component {
    
    constructor(props) {
        super(props);
        this.state = {
            number: this.props.number,
            result: this.calculateFactorial(this.props.number)
        };
    }

    calculateFactorial(number) {
        let n = parseInt(number); 
        
        if ( n < 0) {
            return 1;
        }
        
        let result = 1;
        for (let i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    componentDidUpdate(prevProps) {
        if (this.props.number !== prevProps.number) {
            const newResult = this.calculateFactorial(this.props.number);
            
            this.setState({
                number: this.props.number,
                result: newResult
            });
        }
    }

    render() {
        let number = this.state.number;
        let result = this.state.result;

        return (
            <div>
                <h2>Factorial </h2>
                <p>The Number is: {number}</p>
                <p>The factorial of {number} is: {result}</p>
            </div>
        );
    }
}