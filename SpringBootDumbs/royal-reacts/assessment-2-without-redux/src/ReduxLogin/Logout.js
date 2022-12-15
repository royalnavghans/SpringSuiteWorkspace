import React from 'react'
import { useDispatch, useSelector } from 'react-redux';
import './logout.css';
import { logout, selectUser } from './useSlice';

const Logout = () => {
    const user=useSelector(selectUser)
    const dispatch=useDispatch();
    const handleLogout=(e)=>{
        e.preventDefault();
        
        dispatch(logout());
    }
  return (
    <div>
        <h1 className='logOut'>

        Welcome<span className='spanLogout'>{user.name}<br/><span className='afterText'>You're Sucessfully Logged In!! </span></span>
        <button className='logoutBut' onClick={(e)=>handleLogout(e)}>Logout</button>

        </h1>

    </div>
  )
}

export default Logout