export default function Calculator(props) {
    
    let n1 = parseFloat(props.num1);
    let n2 = parseFloat(props.num2);

    function Addition(){
        return n1+n2;
    }
    function Subtraction(){
        return n1-n2;
    }
    function Multiplication(){
        return n1*n2;
    }
    function Division(){
        return n1/n2;
    }

    return(
        <>
        <h2>Calculator</h2>
        <p>Addition : {Addition()}</p>
        <p>Subtraction : {Subtraction()}</p>
        <p>Multiplication : {Multiplication()}</p>
        <p>Division : {Division()}</p>
        
        </>
    )
}
