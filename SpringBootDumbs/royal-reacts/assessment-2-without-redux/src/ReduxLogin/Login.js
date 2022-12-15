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
    var nam=document.getElementById("nam");
    var ema=document.getElementById("ema");
    var cno=document.getElementById("cno");
    var pass2=document.getElementById("pass");
      
 
     
    const handleSubmit=(e)=>{
      let mobile=/[0-9]/;
      let pass1=/([a-z])([A-Z])/;
     let gmail1= /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
      e.preventDefault();
      if(name<1 || name.split(' ').length>3 || name.split(' ').length<2 || !mobile.test(number) || number.length<10 || !mobile.test(number) || number.length<10 || !pass1.test(pass) || pass.length<8  ){
  
    
        if(name===""){
        nam.innerHTML="*Please Enter Your Username."
        }
        
         else if(name.split(' ').length>3 || name.split(' ').length<2 ){
           nam.innerHTML="*Please Enter Your Correct Username."
         }else{
           nam.innerHTML=""
         }
        if(gmail===""){
          ema.innerHTML="*Please Enter Your email-ID"
          }else if(!gmail1.test(gmail)){
              ema.innerHTML="*Please Enter correct email-ID."  
          }
          
          else{
              ema.innerHTML=""
          }
          if(number===""){
              cno.innerHTML="*Please Enter your mobile no."
              }else if(!mobile.test(number) || number.length<10){
                  cno.innerHTML="*Please Enter Correct mobile no."
              }
              else{
                  cno.innerHTML=""
              }
              
        if(pass===""){ 
                pass2.innerHTML="*Please Enter Your Password"
                  }else if(!pass1.test(pass) || pass.length<8){
                      pass2.innerHTML="*Please enter your Correct password."
                  }else{
       
                  pass2.innerHTML=""  
       }
      }
        else{
          dispatch(login({
            name:name,
            gmail:gmail,
            number:number,
            pass:pass,
            loggedIn:true,
  
  }))
        }
           
    }


  return (
    <center>
    <div className='App1'>
             <form onSubmit={(e)=>handleSubmit(e)}>
        <h2>Registration Page</h2>
   
<label className='inp'>Enter your name:</label><br/>
<input className="NameIN" type={"name"} value={name} onChange={(e)=>setName(e.target.value)}></input><br></br>
<label id='nam' className='red'></label><br></br>
<label className='inp'>Enter your Gmail:</label><br/>
<input className="NameIN" type={"gmail"} value={gmail} onChange={(e)=>setGmail(e.target.value)}></input><br></br>
<label id='ema' className='red'></label><br></br>
<label className='inp'>Enter your Contact Number:</label><br/>
<input  className="NameIN" type={"number"} value={number} onChange={(e)=>setNumber(e.target.value)}></input><br></br>
<label id='cno' className='red'></label><br></br>
<label className='inp'>Enter your Password:</label><br/>
<input className="NameIN" type={"password"} value={pass} onChange={(e)=>setPass(e.target.value)}></input><br></br>
<label id='pass' className='red'></label><br></br>
<button  type="submit" className='But' > Register</button>
</form>




    </div>
    </center>
  )
}

export default Login