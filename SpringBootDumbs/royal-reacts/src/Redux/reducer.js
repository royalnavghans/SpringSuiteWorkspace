import { initializeConnect } from 'react-redux/es/components/connect'
import * as actionTypes from './action-types'

const initialState={
    count:0
}
export const reducer=(state=initialState,action)=>{
switch(action.type){
    case actionTypes.Increment:
        return{
            ...state,
            count:state.count+1
        }
    case actionTypes.Decrement:
        return{
            ...state,
            count:state.count-1
        }
        default:
            return state
}}




