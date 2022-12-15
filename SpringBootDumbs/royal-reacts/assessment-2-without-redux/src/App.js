
import { useSelector } from 'react-redux';
import './App.css';
import Login from './ReduxLogin/Login';
import Logout from './ReduxLogin/Logout';
import { selectUser } from './ReduxLogin/useSlice';

function App() {

  const user=useSelector(selectUser);
  return (
    <div className="App">
      {user ? <Logout/> : <Login/>}
      </div>
  );
}

export default App;
