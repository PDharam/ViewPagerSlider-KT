package com.dharampravin.dialog_slider.slider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dharampravin.dialog_slider.R
import kotlinx.android.synthetic.main.activity_dialog_slider.*

class DialogSliderActivity : AppCompatActivity() {
    private lateinit var list: MutableList<Model>
    private lateinit var adapter: DialogSliderAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_slider)
        init()
        setListener()
    }

    private fun setListener() {
        btnClose.setOnClickListener {
            onBackPressed()
        }
    }


    private fun init() {
        list = getDummyList()
        adapter = DialogSliderAdapter(list, this)
        vpDialogSlider.adapter = adapter
        vpDialogSlider.setPadding(120, 0, 120, 0)
    }

    private fun getDummyList(): MutableList<Model> {
        var list = mutableListOf<Model>()

        list.add(
            Model(
                "Mackbook Pro",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,",
                "https://i.picsum.photos/id/0/5616/3744.jpg"
            )
        )
        list.add(
            Model(
                "Vodafone Dog",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,",
                "https://i.picsum.photos/id/1025/4951/3301.jpg"
            )
        )
        list.add(
            Model(
                "Clock",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,",
                "https://i.picsum.photos/id/175/2896/1944.jpg"
            )
        )
        list.add(
            Model(
                "Footprint",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,",
                "https://i.picsum.photos/id/156/2177/3264.jpg"
            )
        )
        return list;
    }
}
