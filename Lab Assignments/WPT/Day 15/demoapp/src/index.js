import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import App from './App';
//import Custom from './Custom';
//import MyFunction from './myFunction'
//import Factorial from './Factorial';
//import Calculator from './Calculator';
//import CalculatorOperations from './CalculatorOperations';
//import CaseConverter from './CaseConverter';


const root = ReactDOM.createRoot(document.getElementById('root'));
 root.render(
  
  <React.StrictMode>
     {/*<Custom/>
      <MyFunction/>  
    <Factorial number={5}/>
    <Calculator num1="28" num2="70"/>
    <CalculatorOperations num1 ="45" num2="63" operation ="Multiplication"/>
    <CaseConverter/>*/}
    <App></App>
  </React.StrictMode>
); 

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
