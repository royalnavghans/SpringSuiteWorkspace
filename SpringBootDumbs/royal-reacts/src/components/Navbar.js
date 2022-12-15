import React from 'react'
import { NavLink } from 'react-router-dom';

const Navbar = () => {
  return (
    <div>
        <ul>

            <NavLink to="/"><li>Home</li></NavLink>
            <NavLink to="/career"><li>Career</li></NavLink>
            <NavLink to="/resources"><li>Resources</li></NavLink>
            <NavLink to="/about"><li>About</li></NavLink>
           
          
        
      


        </ul>
    </div>
  )
}

export default Navbar;
