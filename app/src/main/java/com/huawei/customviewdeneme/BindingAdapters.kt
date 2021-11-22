package com.huawei.customviewdeneme

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import coil.transform.CircleCropTransformation

/**
 * Created by Oguz Sahin on 11/22/2021.
 */


@BindingAdapter("loadUrl")
fun ImageView.loadUrl(
    url: String
) {
    load(url) {
        transformations(CircleCropTransformation())
    }
}