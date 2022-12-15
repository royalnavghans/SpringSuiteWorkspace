
import React from 'react';
import './App.css';
import Navbar from './components/Navbar';
import {Switch,Route} from 'react-router-dom';
import career from './components/career';
import resources from './components/resources';
import about from './components/about';
import home from './components/home';
import FormValidation from './FormValidation';
import SearchFilter from './SearchFilter';
import Reduxx from './Reduxx';

function App() {
  return (
    <div>
     <FormValidation/>
     <SearchFilter/>
     <Reduxx/>
 <Navbar/>
<Switch>
<Route exact path='/' component={home}></Route>
<Route  path="/career" component={career}></Route>
<Route  path="/resources" component={resources}></Route>
<Route  path="/about" component={about}></Route>
</Switch>

    </div>
  );
}

export default App;
