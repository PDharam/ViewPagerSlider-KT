package com.dharampravin.dialog_slider

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dharampravin.dialog_slider.slider.DialogSliderActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLaunchDialogSlider.setOnClickListener {
            startActivity(Intent(this, DialogSliderActivity::class.java))
        }
    }


}
