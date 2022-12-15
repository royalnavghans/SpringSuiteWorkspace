import React, { useState } from 'react'

const FormValidation = () => {
  
  const[name,Username]=useState("");
  const[pass,Password]=useState("");
  const[email,Email]=useState("");
  const[nameErr,NameError]=useState(false);
  const[passErr,PassError]=useState(false);
  const[emailErr,emailError]=useState(false);

  function FormLogin(e){
if(name.length<8 || pass.length<8 || email.length<8 ){
  alert("Please enter Valid details")
}else{
  alert("Heyy Its a valid Details!!")
  console.log("Your Details are: \n",name,"\n",pass,"\n",email)
}
e.preventDefault()

  }

  function nameChange(e){
    let item=e.target.value;
    if(item.length<8){
      NameError(true)

    }else{
      NameError(false)
    }
    Username(item);
  }
  function passChange(e){
    let item=e.target.value;
    if(item.length<8){
      PassError(true)
    }else{
      PassError(false)
    }Password(item);
  }
  function emailChange(e){
    let item=e.target.value;
    if(item.length<5){
      emailError(true)
    }else{
      emailError(false)
    }Email(item);
  }
  return (
    <div>
      <form onSubmit={FormLogin}>
      <label>Enter your Name:</label>
    <input type={"text"} placeholder="Name" onChange={nameChange} />{nameErr?<span>user Name Must Contain Uppercase and 8 character</span>:""}<br></br>
    <label>Enter your Email:</label>
    <input type={"Email"} placeholder="email" onChange={emailChange} />{emailErr?<span>email not valid</span>:""}<br></br>
    <label>Enter your password:</label>
    <input type={"password"} placeholder="Password"onChange={passChange} />{passErr?<span>Password should contain 8 character with spl character</span>:""}<br></br>
    <button type='Submit'>Submit</button><br></br><br></br>
    </form>
    </div>
  )
}

export default FormValidation