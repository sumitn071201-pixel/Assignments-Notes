import { useState } from "react";

function Counter(){
    const[count,setCount] = useState(0);

    const increment = () =>{
        setCount(prevCount => prevCount+1);
    };
     const decrement = () => {
    if (count > 0) {
      setCount(prevCount => prevCount - 1);
    }
  };

    const reset = () =>{
        setCount(0);
    };
    return(
        <div>
            <h1>Counter Application</h1>
            <p>{count}</p>
        
        <div>
            <button onClick={increment}>Increment(+1)</button>
            <button onClick={decrement}disabled={count === 0}>Decrement (-1)</button>
            <button onClick={reset}>Reset(0)</button>
        </div>
        </div>
    );
}
export default Counter;