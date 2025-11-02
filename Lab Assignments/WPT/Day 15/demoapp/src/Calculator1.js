import React, { useState, useEffect } from 'react';

export default function Calculator(props) {
    let n1 = parseFloat(props.num1);
    let n2 = parseFloat(props.num2);

    const [results, setResults] = useState({});

    useEffect(() => {
        const Addition = n1 + n2;
        const Subtraction = n1 - n2;
        const Multiplication = n1 * n2;
        const Division = n2 !== 0 ? n1 / n2 : 'Cannot divide by zero';

        setResults({
            addition: Addition,
            subtraction: Subtraction,
            multiplication: Multiplication,
            division: Division,
        });
    }, [n1, n2]);

    return (
        <>
        <h2>Calculator</h2>
        <p>Numbers: {n1} and {n2}</p>
        <p>Addition : {results.addition}</p>
        <p>Subtraction : {results.subtraction}</p>
        <p>Multiplication : {results.multiplication}</p>
        <p>Division : {results.division}</p>
        </>
    );
}