package com.dharampravin.dialog_slider.slider

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Model(var title: String, var description: String, var imageUrl: String) : Parcelable