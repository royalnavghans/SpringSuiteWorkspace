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

        Welcome to <span className='spanLogout'>{user.name}</span>
        <button className='logoutBut' onClick={(e)=>handleLogout(e)}>Go Back</button>

        </h1>

    </div>
  )
}

export default Logout