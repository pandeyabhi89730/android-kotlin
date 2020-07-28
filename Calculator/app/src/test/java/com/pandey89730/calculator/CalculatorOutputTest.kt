package com.pandey89730.calculator

import com.pandey89730.calculator.calculator.CalculatorOutputInterfaceView
import com.pandey89730.calculator.calculator.CalculatorOutputPresenter
import org.junit.Test
import org.mockito.BDDMockito.then
import org.mockito.Mockito


class CalculatorOutputTest{
    private val mPresenter:CalculatorOutputPresenter =CalculatorOutputPresenter
    private val mMockView:CalculatorOutputInterfaceView = Mockito.mock(CalculatorOutputInterfaceView::class.java)

        @Test
        fun ADDITEM (){

            mPresenter.attach(mMockView)

            mPresenter.addItem("1")

            then(mMockView).should().setEquation("1")

            mPresenter.addItem("+")

            then(mMockView).should().setEquation("1+")

            mPresenter.addItem("1")

            then(mMockView).should().setEquation("1+1")


            then(mMockView).should().setOutcome("2")

            mPresenter.clear()

        }


    fun subtract (){

        mPresenter.attach(mMockView)

        mPresenter.addItem("1")

        then(mMockView).should().setEquation("1")

        mPresenter.addItem("-")

        then(mMockView).should().setEquation("1-")

        mPresenter.addItem("1")

        then(mMockView).should().setEquation("1-1")


        then(mMockView).should().setOutcome("0")

        mPresenter.clear()

    }


}



