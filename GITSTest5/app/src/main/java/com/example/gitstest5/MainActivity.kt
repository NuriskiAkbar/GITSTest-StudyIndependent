package com.example.gitstest5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun isPalindromeString(inputStr: String): Boolean {
        val sb = StringBuilder(inputStr)
        val reverseStr = sb.reverse().toString()
        return inputStr.equals(reverseStr, ignoreCase = true)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_push.setOnClickListener {
            var getstring = et_string.text.toString()
            if(getstring?.let { isPalindromeString(it) } == true){
                tv_result.setText("True")
            }else{
                tv_result.setText("False")
            }
        }
    }
}