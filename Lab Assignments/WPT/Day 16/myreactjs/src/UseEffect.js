import { useEffect,useState } from "react";

function UseEffect(){
    const [count,setCount] =useState(0);
    useEffect(()=>{
        console.log('Mounted:Component has been rendered for the first time : ')
    },[]);

    useEffect(()=>{
        console.log(`Updated:count changed to ${count}. updating document title`)
        document.title = `count: ${count}`;


    return () => {
        console.log(`Cleanup:Preparing for update (count was ${count}) or unmount.`);
    };
}, [count]);

return(
    <div>
        <h3>UseEffect Lifecycle </h3>
        <p>Current Count: {count}</p>
        <button onClick={()=> setCount(c=>c+1)}>Increment Count</button>
    </div>
);
}
export default UseEffect;