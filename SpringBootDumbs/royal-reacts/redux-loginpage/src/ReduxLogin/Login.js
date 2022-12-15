import React, { useState } from 'react'
import { useDispatch } from 'react-redux';
import './login.css';
import { login } from './useSlice';

const Login = () => {
    const[name,setName]=useState("");
    const[gmail,setGmail]=useState("");
    const[number,setNumber]=useState("");
    const[pass,setPass]=useState("");
    const dispatch=useDispatch();
    const handleSubmit=(e)=>{
        e.preventDefault();
        dispatch(login({
            name:name,
            gmail:gmail,
            number:number,
            pass:pass,
            loggedIn:true,

        }))
    }
  return (
    <div className='login'>
             <form className='loginForm' onSubmit={(e)=>handleSubmit(e)}>
        <h1 className='H2'>Hello Welcome to Royalnavghan Login</h1>
   
<label className='label'>Enter your name:</label>
<input type={"name"} value={name} onChange={(e)=>setName(e.target.value)}></input><br></br><br></br>
<label className='label'>Enter your Gmail:</label>
<input type={"gmail"} value={gmail} onChange={(e)=>setGmail(e.target.value)}></input><br></br><br></br>
<label className='label'>Enter your Contact Number:</label>
<input type={"number"} value={number} onChange={(e)=>setNumber(e.target.value)}></input><br></br><br></br>
<label className='label'>Enter your Password:</label>
<input type={"password"} value={pass} onChange={(e)=>setPass(e.target.value)}></input><br></br><br></br>
<button  type="submit" className='loginBut'> Login</button>
</form>




    </div>
  )
}

export default Login