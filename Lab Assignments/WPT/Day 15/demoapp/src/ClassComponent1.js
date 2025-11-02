import React, { Component } from 'react';

// Predefined Methods And Lifecycle
export default class ClassComponent1 extends Component {
    constructor(props) {
        super(props);
        // 1. Initializing State and Binding Methods (Mounting Phase)
        this.state = {
            count: 0,
            data: 'initial data',
            // Initializing externalValue to prevent issues with getDerivedStateFromProps on first render
            externalValue: props.externalValue 
        };
        // FIX: The incrementCount method is now defined as an arrow function, 
        // so the explicit binding below is not strictly needed but kept for context 
        // if using traditional function syntax. (We'll use arrow function below)
        // this.incrementCount = this.incrementCount.bind(this); // REMOVED/AVOIDED
        console.log('1. Constructor: State initialized.');
    }

    // --- Mounting Phase ---

    static getDerivedStateFromProps(props, state) {
        // 2. Sync State from Props (Mounting & Updating Phase)
        // This ensures the internal state tracks the prop change.
        if (props.externalValue !== state.externalValue) {
            console.log('2. getDerivedStateFromProps: Syncing externalValue from props.');
            return { externalValue: props.externalValue };
        }
        return null;
    }

    componentDidMount() {
        // 4. Side Effects and Data Fetching (Mounting Phase)
        this.timer = setInterval(() => {
            console.log('    [LOG] Timer is running (simulating background task)');
        }, 5000);
        
        // Simulate an API call
        setTimeout(() => {
            console.log('4. componentDidMount: Simulated API call complete.');
            this.setState({ data: 'Data from API' });
        }, 1500);

        console.log('4. componentDidMount: Timer and API call initiated.');
    }

    // --- Updating Phase ---

    shouldComponentUpdate(nextProps, nextState) {
        // 5. Performance Check (Updating Phase)
        if (nextState.count % 2 === 0) {
            console.log(`5. shouldComponentUpdate: Count is even (${nextState.count}). Allowing update.`);
            return true;
        } else {
            console.log(`5. shouldComponentUpdate: Count is odd (${nextState.count}). Preventing update.`);
            return false;
        }
    }

    getSnapshotBeforeUpdate(prevProps, prevState) {
        // 7. Capture Pre-DOM-Update Data (Updating Phase)
        const snapshot = document.getElementById('output-div')?.scrollHeight;
        console.log('7. getSnapshotBeforeUpdate: Captured scroll height:', snapshot);
        return snapshot;
    }

    componentDidUpdate(prevProps, prevState, snapshot) {
        // 8. Post-Update Side Effects (Updating Phase)
        if (this.state.count !== prevState.count) {
            console.log(`8. componentDidUpdate: State updated. Previous count: ${prevState.count}`);
        }
        if (this.props.externalValue !== prevProps.externalValue) {
            console.log(`8. componentDidUpdate: Props updated. New externalValue: ${this.props.externalValue}`);
        }
        console.log('8. componentDidUpdate: Snapshot value received:', snapshot);
    }

    // --- Unmounting Phase ---

    componentWillUnmount() {
        // 9. Cleanup (Unmounting Phase)
        clearInterval(this.timer);
        console.log('9. componentWillUnmount: Cleanup complete. Timer cancelled.');
    }
    
    // --- Custom Methods (FIXED: Added the missing method using arrow syntax) ---
    incrementCount = () => {
        this.setState(prevState => ({
            count: prevState.count + 1
        }));
    }

    // --- Rendering ---

    render() {
        // 3/6. Render (Mounting & Updating Phase)
        const { count, data, externalValue } = this.state;
      
        console.log('3/6. Render: Component rendering...');

        return (
            <div id="output-div" >
                <h2>Class Component Methods And Lifecycle </h2> 
                
                <p>Internal State Count: {count} (Updates only on even numbers)</p>
                <p>External Prop Value: {externalValue}</p>
                <p>Data Status: {data}</p>
                
                <button onClick={this.incrementCount}>
                    Increment Internal Count (Triggers Update)
                </button>
            </div>
        );
    }
}