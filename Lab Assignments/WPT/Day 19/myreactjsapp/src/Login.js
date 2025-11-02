import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";


export default function LoginDemo() {
    let n1 = useNavigate();

    const [uname, setUname] = useState('default');
    const [pass, setPass] = useState('');
    const [msg, setMsg] = useState('');





    function check(e) {

        e.preventDefault();
        if (validate()) {
            setMsg('Valid User');
            // Redirect PROG
            // hOME PAGE 
            n1.push('/home');

        }

    }
    useEffect(() => {
        console.log("use Effect ")
        // Load Data   JSON 

    }, []);

    function validate() {
        //docune  API BASE 
        // Database // Json Data  1000{u , p}
        return (uname == 'a' && pass == 'a')
    }





    return (

        <>
       
            <div>
                 
            <h1 style={{marginTop:0, textAlign: "center" ,color:"blueviolet"}}>Login Form</h1>
           
            <div style={{ padding: 200, backgroundColor: 'violet' ,color:"white"}}>
                 

                <form onSubmit={check}>
                    Enter UserName :
                    <input style={{backgroundColor: 'violet' ,color:"white",borderColor:"cyan"}} type="text" value={uname}
                        onChange={
                            (e) => { setUname(e.target.value) }} />
                    <br />
                    Enter Password  : <input style={{backgroundColor: 'violet' ,color:"white",borderColor:"cyan"}} type="password" id="pass1" value={pass}
                        onChange={(e) => { setPass(e.target.value) }} />
                    <br />
                    <input style={{backgroundColor: 'violet' ,color:"white",borderColor:"cyan"}} type="submit" value={'submit'} />


                </form>


            </div>
            </div>
        </>


    )






}