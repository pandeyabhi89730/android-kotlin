package com.pandey89730.calculator.calculator

import bsh.Interpreter
import java.lang.Exception

object CalculatorOutputPresenter{
    private var mView: CalculatorOutputInterfaceView?=null

    // current equation
    private var mCurrentEquation: String=""

    // Current outcome
    private var mCurrentOutcome: String=""

    //Interpreter
    private val mInterpreter=Interpreter()

        fun attach(view: CalculatorOutputInterfaceView){
        mView=view
            updateEquation()
            updateOutcome()

    }

    fun detach(){
        mView=null
    }
    fun addItem(Item: String){
        mCurrentEquation= mCurrentEquation.plus(Item)
        updateEquation()
        calculateOutcome()
        updateOutcome()

    }
    fun remove(){
      mCurrentEquation= if (mCurrentEquation.length > 1){
          mCurrentEquation.substring(0, mCurrentEquation.length -1)
      }else{
          ""
      }
        updateEquation()
        calculateOutcome()
        updateOutcome()

    }

    fun solve(){
        if (mCurrentOutcome.isNotEmpty()){
            mCurrentEquation= mCurrentOutcome
            mCurrentOutcome=""
        }
        updateEquation()
        updateOutcome()

    }
    fun clear(){
        mCurrentEquation=""
        mCurrentOutcome=""
        updateEquation()
        updateOutcome()

    }
     private fun calculateOutcome(){
         if (mCurrentEquation.isNotEmpty()){
            try {
                mInterpreter.eval("result = $mCurrentEquation")
                val result: Any = mInterpreter.get("result")

                if(result != null && result is Int){
                    mCurrentOutcome=result.toString()
                }
            }catch (e: Exception){
                mCurrentOutcome=""

            }
         }else{
             mCurrentOutcome=""
         }

    }
    private fun updateEquation(){
      mView?.setEquation(mCurrentEquation)
    }
    private fun updateOutcome(){
        mView?.setOutcome(mCurrentOutcome)

    }


}