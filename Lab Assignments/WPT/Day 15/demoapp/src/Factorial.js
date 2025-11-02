import { Component } from "react";
export default class Factorial extends Component {
    
    calculateFactorial(number) {
        if (number < 0) {
            return 1;
        }
        
        let n = parseInt(number); 
        
        let result = 1;
        
        for (let i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    render() {
        let number = this.props.number;
        
        let result = this.calculateFactorial(number);

        return (
            <div>
                <h2>Factorial Calculation</h2>
                <p>The Number is :{number}</p>
                <p>The factorial of {number} is: {result}</p>
            </div>
        );
    }
}