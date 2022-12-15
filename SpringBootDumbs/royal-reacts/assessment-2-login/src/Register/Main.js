import React, { useState } from 'react'
import './Main.css';

const Main = () => {


 
function submit(){
    var nam=document.getElementById("nam");
    var ema=document.getElementById("ema");
    var cno=document.getElementById("cno");
    var pass=document.getElementById("pass");


    let mobile=/[0-9]/;
    let pass1=/([a-z])([A-Z])/;
   let gmail= /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

if(reg.Name===""){
nam.innerHTML="*Please Enter Your Username."
}

else if(reg.Name.split(' ').length>3 || reg.Name.split(' ').length<2 ){
    nam.innerHTML="*Please Enter Your Correct Username."
}else{
    nam.innerHTML=""
}
if(reg.email===""){
    ema.innerHTML="*Please Enter Your email-ID"
    }else if(!gmail.test(reg.email)){
        ema.innerHTML="*Please Enter correct email-ID."  
    }
    
    else{
        ema.innerHTML=""
    }
    if(reg.contact===""){
        cno.innerHTML="*Please Enter your mobile no."
        }else if(!mobile.test(reg.contact) || reg.contact.length<10){
            cno.innerHTML="*Please Enter Correct mobile no."
        }
        else{
            cno.innerHTML=""
        }
        
 if(reg.pass===""){ 
          pass.innerHTML="*Please Enter Your Password"
            }else if(!pass1.test(reg.pass) || reg.pass.length<8){
                pass.innerHTML="*Please enter your Correct password."
            }else{
                pass.innerHTML=""
            }
           
            
}
    const [reg ,setReg]=useState({

     Name:"",
     email:"",
     contact:"",
     pass:"",

    }
    )

   console.log(reg)
  return (
    <center>
<div className='App1'>
    <h2>Registration Page</h2>
    <label className='inp'>Name:</label><br></br>
    <input type={"text"} placeholder="Enter Your Name here"  className="NameIN" name={"Name"} value={reg.Name} onChange={(e)=>setReg({...reg,[e.target.name]:e.target.value})} /><br></br>
    <label id='nam' className='red'></label><br></br>
    <label  className='inp'>Email ID:</label><br></br>
    <input type={"email"} placeholder="Enter Your email here" className="NameIN" name={"email"}  value={reg.email} onChange={(e)=>setReg({...reg,[e.target.name]:e.target.value})} /><br></br>
    <label id='ema' className='red'></label><br></br>
    <label  className='inp'>Mobile No:</label><br></br>
    <input type={"number"}  placeholder="Enter Your contact no here" className="NameIN"  name={"contact"} value={reg.contact} onChange={(e)=>setReg({...reg,[e.target.name]:e.target.value})} /><br></br>
    <label id='cno' className='red'></label><br></br>
    <label  className='inp'>Password:</label><br></br>
    <input type={"password"} placeholder="Enter Your password here" className="NameIN" name={"pass"} value={reg.pass} onChange={(e)=>setReg({...reg,[e.target.name]:e.target.value})} /><br></br>
    <label id='pass' className='red'></label><br></br>
    <button className='But' onClick={submit}>Register</button>
    </div>
    </center>
  )
}

export default Main