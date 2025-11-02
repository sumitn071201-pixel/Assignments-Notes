export default function CalculatorOperations(props) {
    
    let n1 = parseFloat(props.num1);
    let n2 = parseFloat(props.num2);
    let operation = props.operation;

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
    function Operations(op) {
        switch (op) {
            case 'Addition':
                return Addition();
            case 'Subtraction':
                return Subtraction();
            case 'Multiplication':
                return Multiplication();
            case 'Division':
                return Division();
            default:
                return "Error";
        }
    }

    
let result = Operations(operation);
        
 return (
    <>
  <div>
    <h2>Single Calculation </h2>
    <p>Operation requested: {operation}</p>
     <p>Result:{result}</p>
    </div>
  </>
);

}


    
