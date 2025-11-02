import { useState } from "react";

function TextList(){
    const [inputValue,setInputValue] = useState('');
    const [dataList,setDataList] = useState([]);

    const handleInputChange = (event) =>{
        setInputValue(event.target.value);
    };

    const handleInputBlur = () => {
        const trimmedValue = inputValue.trim();

        if(trimmedValue){
            setDataList(prevList => [...prevList,trimmedValue]);
            setInputValue('');
        }
    };

    return(
        <div>
            <h1>Data Entry And List Display</h1>
            <input type="text" 
            value={inputValue} 
            onChange={handleInputChange}
            onBlur={handleInputBlur}
            placeholder="Enter an item & click outside...."
            />

            <h2>Collected Items:</h2>
            {dataList.length === 0 ? (
                <p>no items collected yet . Enter data and tab out or click away.</p>
                ): (
                    <ol>
                        {dataList.map((item,index) =>(
                            <li key={index}>{item}</li>
                        ))}
                    </ol>
                )}
        </div>
    );
}
export default TextList;