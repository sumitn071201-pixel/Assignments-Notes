import React, { useState, useEffect, useCallback } from 'react';

export default function CalculatorOperations(props) {
    let n1 = parseFloat(props.num1);
    let n2 = parseFloat(props.num2);
    let operation = props.operation;

    const [result, setResult] = useState(null);

    const calculateOperation = useCallback((op) => {
        switch (op.toLowerCase()) {
            case 'addition':
                return n1 + n2;
            case 'subtraction':
                return n1 - n2;
            case 'multiplication':
                return n1 * n2;
            case 'division':
                return n2 !== 0 ? n1 / n2 : 'Cannot divide by zero';
            default:
                return "Error: Invalid Operation";
        }
    }, [n1, n2]);

    useEffect(() => {
        const calculatedValue = calculateOperation(operation);
        setResult(calculatedValue);
    }, [operation, calculateOperation]);

    return (
        <div>
            <h2>Single Calculation</h2>
            <p>Numbers: {n1} and {n2}</p>
            <p>Operation requested: {operation}</p>
            <p>Result: {result}</p>
        </div>
    );
}