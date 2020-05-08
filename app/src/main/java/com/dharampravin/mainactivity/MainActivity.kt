package com.dharampravin.mainactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dharampravin.mainactivity.slider.DialogSliderActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_launch_dialog_slider.setOnClickListener {
            startActivity(Intent(this, DialogSliderActivity::class.java))
        }
    }


}
