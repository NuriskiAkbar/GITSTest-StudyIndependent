package com.example.gitstest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_push.setOnClickListener{
            var gethour = et_time.text.toString()
            var hour = gethour.toInt()
            var getmin = et_time2.text.toString()
            var min = getmin.toInt()
            var spin = spinner.selectedItem

            if(hour.equals(12) && spin.equals("AM")){
                tv_result.setText("00"+":"+getmin)
            } else if(hour.equals(12) && spin.equals("PM")){
                tv_result.setText("12"+":"+getmin)
            } else{
                tv_result.setText(""+hour+":"+min)
            }
        }
    }
}