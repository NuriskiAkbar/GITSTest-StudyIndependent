package com.example.gitstest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_proses.setOnClickListener{
            var getnumber = et_number.text.toString()
            var realnumber = getnumber.toInt()

            if (realnumber % 3 == 0 && realnumber % 5 == 0){
                tv_result.text = "Hello World !!"
            } else if(realnumber % 3 == 0){
                tv_result.text = "Hello"
            } else if(realnumber % 5 == 0){
                tv_result.text = "World"
            } else{
                tv_result.text = "bukan kelipatan 3 atau 5"
            }

        }
    }
}