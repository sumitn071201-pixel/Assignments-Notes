import React, { useState, useEffect } from "react";

function Counter() {
    const [count, setCount] = useState(0);
    const [history, setHistory] = useState([]);

    useEffect(() => {
        if (count > 0) {
            const newCountValue = count;

            setHistory(prevHistory => {
                const logEntry = {
                    id: prevHistory.length + 1,
                    value: newCountValue,
                    time: new Date().toLocaleTimeString(),
                };
                return [...prevHistory, logEntry];
            });
        }
    }, [count]);

    const increment = () => {
        setCount(prevCount => prevCount + 1);
    };

    const decrement = () => {
        if (count > 0) {
            setCount(prevCount => prevCount - 1);
        }
    };

    const reset = () => {
        setCount(0);
        setHistory([]);
    };

    return (
        <div>
            <h1>Counter Application</h1>
            
            <p>{count}</p>
            
            <div>
                <button onClick={increment}>Increment (+1)</button>
                <button onClick={decrement} disabled={count === 0}>Decrement (-1)</button>
                <button onClick={reset}>Reset (0)</button>
            </div>

            {history.length > 0 && (
                <div style={{ marginTop: '20px' }}>
                    <h2>Count History Log</h2>
                    <table border="1" style={{ borderCollapse: 'collapse', width: '300px' }}>
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Count Value</th>
                                <th>Time Logged</th>
                            </tr>
                        </thead>
                        <tbody>
                            {history.map((entry) => (
                                <tr key={entry.id}>
                                    <td>{entry.id}</td>
                                    <td>{entry.value}</td>
                                    <td>{entry.time}</td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                </div>
            )}
        </div>
    );
}

export default Counter;