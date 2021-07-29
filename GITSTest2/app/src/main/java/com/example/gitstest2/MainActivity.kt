package com.example.gitstest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailRegex = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[.id]{0,7}" +
                    "[.co.id]{0,7}" +
                    ")+"
        )

        btn_push.setOnClickListener {
            var getemail = et_email.text.toString()
            if(emailRegex.matcher(getemail).matches()){
                tv_result.setText("bener")
            }else{
                tv_result.setText("salah")
            }
        }

    }
}