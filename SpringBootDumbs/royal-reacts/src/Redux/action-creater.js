import * as actionTypes from './action-types'

export const increaseValue=()=>{
    return{
    type:actionTypes.Increment
}}
export const decreaseValue=()=>{
    return{
    type:actionTypes.Decrement
}}