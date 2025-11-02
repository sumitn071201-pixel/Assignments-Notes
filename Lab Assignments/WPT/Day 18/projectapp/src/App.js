//import logo from './logo.svg';
//import './App.css';

import Counter from "./Counter";
import ErrorBoundary from "./ErrorBoundry";
import PasswordGenerator from "./Password";

function App() {
  return (
    <div className="App">
     <PasswordGenerator/>
     <ErrorBoundary>
      <Counter/>
     </ErrorBoundary>
    </div>
  );
}

export default App;
