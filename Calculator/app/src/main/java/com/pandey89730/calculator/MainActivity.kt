package com.pandey89730.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        key_0.setOnClickListener { output_layout.run { addItem("0") } }
        key_1.setOnClickListener { output_layout.run { addItem("1") } }
        key_2.setOnClickListener { output_layout.run { addItem("2") } }
        key_3.setOnClickListener { output_layout.run { addItem("3") } }
        key_4.setOnClickListener { output_layout.run { addItem("4") } }
        key_5.setOnClickListener { output_layout.run { addItem("5") } }
        key_6.setOnClickListener { output_layout.run { addItem("6") } }
        key_7.setOnClickListener { output_layout.run { addItem("7") } }
        key_8.setOnClickListener { output_layout.run { addItem("8") } }
        key_9.setOnClickListener { output_layout.run { addItem("9") } }

        id_cancel.setOnClickListener { output_layout.run { remove() } }
        id_trash.setOnClickListener { output_layout.run { clear() }}
        id_equal.setOnClickListener { output_layout.run { solve() } }

        id_Div.setOnClickListener { output_layout.run { addItem("/") } }
        id_multi.setOnClickListener { output_layout.run{ addItem("*")} }
        id_plus.setOnClickListener { output_layout.run { addItem("+") } }
        id_minus.setOnClickListener { output_layout.run { addItem("-") } }
        key_percent.setOnClickListener{output_layout.run{ addItem("%") } }





    }
}


