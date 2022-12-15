import { reducer } from "./reducer";
import { combineReducers } from "redux";
import { reducer } from "./reducer";
export const rootReducer= combineReducers({
    ourState:reducer
})