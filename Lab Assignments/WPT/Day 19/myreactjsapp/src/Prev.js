const { useState, useCallback } = require("react");

const funcSet = new Set();

const DemoCallBack = () => {
    const [cnt,setCnt] = useState(0);
    const [num,setNum] = useState(0);

    const incCnt = useCallback(
        () => setCnt((prevcnt) => prevcnt + 1),
        []);

    const inccnt1 = useCallback(
        () => setCnt(cnt + 1),
        [cnt]);

    const decCnt = useCallback(()=> setCnt(cnt - 1),
        []);

    const incNum = useCallback(() => setNum(num + 1),
        [num]);

    funcSet.add(incCnt);
    funcSet.add(decCnt);
    funcSet.add(incNum);


    return(
        <div>
            <h1>prev object in useCallback </h1>
            <button onClick={incCnt}>Increase Counter</button>
            <button onClick={decCnt}>Decrease Counter</button>
            <button onClick={incNum}>Increase Number</button>

            <h1>Count : {cnt}</h1>
            <h1>Number : {num}</h1>
            <h2>Set Size : {funcSet.size} </h2>
        </div>
    );

};

export default DemoCallBack;