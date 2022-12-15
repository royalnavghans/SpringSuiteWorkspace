import { configureStore } from "@reduxjs/toolkit";
import userReducer from "../ReduxLogin/useSlice"

export default configureStore({
reducer:{
    user:userReducer
},

});