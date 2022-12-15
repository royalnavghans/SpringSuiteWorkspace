import React, { useState } from 'react'
import MOCK_DATAS from './Form/MOCK_DATAS.json';

const SearchFilter = () => {
  const[searchTerm,setSearch]=useState("");
  return (
    <div >
      <div className='full'>
      <label className='inp'>Search</label><br></br>
    <input type={"text"} placeholder="search..." className='search' onChange={event =>{setSearch(event.target.value)}}/></div>
    {MOCK_DATAS.filter((val)=>{
      if(searchTerm===""){
        return val;
      }else if(val.first_name.toLowerCase().includes(searchTerm.toLowerCase())){
        return val;
      }
    }).map((val,key)=>{

      return <div className='form' key={key}>
        <p>{val.first_name}</p>
        </div>

    })}



    </div>
  );
}

export default SearchFilter