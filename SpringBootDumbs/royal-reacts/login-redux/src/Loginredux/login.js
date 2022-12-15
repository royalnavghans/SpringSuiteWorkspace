import React, { useState } from 'react';
import './login.css';
const Login = () => {
    const[name,setName]=useState("");
    const[gmail,setGmail]=useState("");
    const[contact,setContact]=useState("");
    const[password,setPassword]=useState("");
  return (
<div className='App'>
      <form className='loginform'>
      <h1 className='title'>Welcome to Royal Login Page!!</h1>
      <label className='name'>Enter Your Name: </label>
      <input type="text" value={name} onChange={(e)=>setName(e.target.value)}></input><br></br><br></br>
      <label className='gmail'>Enter Your Gmail: </label>
      <input type={"gmail"}  value={gmail} onChange={(e)=>setGmail(e.target.value)}></input><br></br><br></br>
      <label className='Contact'>Enter Your Contact Number: </label>
      <input type={"number"}  value={contact} onChange={(e)=>setContact(e.target.value)}></input><br></br><br></br>
      <label className='Password'>Enter Your Password: </label>
      <input type={"password"}  value={password} onChange={(e)=>setPassword(e.target.value)}></input><br></br><br></br>
      <button className='but'>Submit</button>
  
      </form>

    </div>
  )
}

export default Login