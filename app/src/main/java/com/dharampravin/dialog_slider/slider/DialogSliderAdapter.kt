package com.dharampravin.dialog_slider.slider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import coil.api.load
import com.dharampravin.dialog_slider.R
import kotlinx.android.synthetic.main.item_dialog.view.*

class DialogSliderAdapter(var list: MutableList<Model>, var context: Context) : PagerAdapter() {

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view = LayoutInflater.from(context).inflate(R.layout.item_dialog, container, false)
        var holder = DialogSliderViewHolder(view)
        holder.bind(list[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }


    class DialogSliderViewHolder(var view: View) {
        fun bind(model: Model) {
            view.tv_title.text = model.title
            view.tv_description.text = model.description
            view.iv_image.load(model.imageUrl) {
                placeholder(R.drawable.loading)
            }
        }

    }
}