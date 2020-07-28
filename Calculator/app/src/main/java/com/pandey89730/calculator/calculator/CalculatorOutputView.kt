package com.pandey89730.calculator.calculator

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater

import android.widget.LinearLayout
import com.pandey89730.calculator.R
import kotlinx.android.synthetic.main.view_calculator_output.view.*


class CalculatorOutputView (context: Context, attributeSet: AttributeSet? ): LinearLayout(context,attributeSet),CalculatorOutputInterfaceView{

    init {
        // set orientation
        orientation= VERTICAL

        //Set Gravity

        gravity=Gravity.CENTER_VERTICAL

        // inflate Layout
        LayoutInflater.from(context).inflate(R.layout.view_calculator_output,this,true)
    }
    fun addItem(Item: String){
        CalculatorOutputPresenter.addItem(Item)
    }
   fun remove(){
        CalculatorOutputPresenter.remove()
    }
    fun solve(){
        CalculatorOutputPresenter.solve()
    }
    fun clear(){
        CalculatorOutputPresenter.clear()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        CalculatorOutputPresenter.attach(this)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        CalculatorOutputPresenter.detach()
    }

    override fun setEquation(equation: String) {
        Calcute_view_equation.text=equation
    }

    override fun setOutcome(outcome: String) {
        Calcute_view_output.text=outcome

         }
}
