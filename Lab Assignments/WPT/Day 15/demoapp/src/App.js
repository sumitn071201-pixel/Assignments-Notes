//import logo from './logo.svg';
//import './App.css';
import Calculator1 from './Calculator1';
import CalculatorOperations1 from './CalculatorOperations1';
import CaseConverter1 from './CaseConverter1';
import ClassComponent1 from './ClassComponent1';
import Factorial1 from './Factorial1';
import UserDetails from './UserDetails';
function App() {
  return (
    <div className="App">
    <Factorial1 number ={5}></Factorial1>
    <Calculator1 num1="90" num2="87"></Calculator1>
    <CalculatorOperations1 num1="100"num2="88" operation="Multiplication"></CalculatorOperations1>
    <ClassComponent1></ClassComponent1>
    <CaseConverter1></CaseConverter1>
    <UserDetails></UserDetails>
    </div>
  );
}
export default App;
