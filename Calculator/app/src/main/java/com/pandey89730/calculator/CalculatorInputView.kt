package com.pandey89730.calculator

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.view_calculator_inpiut.view.*

class CalculatorInputView (context: Context, attributeSet: AttributeSet?): RelativeLayout(context,attributeSet) {

    init {
        // inflate Layout
        LayoutInflater.from(context).inflate(R.layout.view_calculator_inpiut, this, true)
        //Read attribute set


          attributeSet?.run {
            val typedArray =
                context.obtainStyledAttributes(attributeSet, R.styleable.CalculatorInputView)
            val textResources = typedArray.getString(R.styleable.CalculatorInputView_item_text)
            val iconResources =
                typedArray.getResourceId(R.styleable.CalculatorInputView_item_icon, -1)
            when {
                iconResources != -1 -> {

                    input_element_text.visibility = View.GONE
                    input_element_image.apply {
                        visibility = View.VISIBLE
                        setImageResource(iconResources)
                    }

                }
                !textResources.isNullOrEmpty() -> {
                    input_element_image.visibility = View.GONE
                    input_element_text.apply {
                        visibility = View.VISIBLE
                        text = textResources
                    }
                }
                else -> {
                    input_element_image.visibility = View.GONE
                    input_element_text.visibility = View.GONE
                }
            }
            typedArray.recycle()
        }
    }

    override fun setOnClickListener(l: OnClickListener?) {
        input_element_click.setOnClickListener(l)
    }





    }
