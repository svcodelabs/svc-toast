package com.svcodelabs.svctoast

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.StringRes
import com.google.android.material.card.MaterialCardView

class SvcToast(private val context: Context, private val activity: Activity) {

    fun errorToast() {
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_SHORT

        //inflate view
        val custom_view = activity.layoutInflater.inflate(R.layout.toast_icon_text, null)
        (custom_view.findViewById(R.id.message) as TextView).text = "This is Error Message"
        (custom_view.findViewById(R.id.icon) as ImageView).setImageResource(R.drawable.ic_close)
        (custom_view.findViewById(R.id.parent_view) as MaterialCardView)
            .setCardBackgroundColor(activity.resources.getColor(R.color.red_600, activity.theme))

        toast.view = custom_view
        toast.show()
    }

    fun errorToastCustom(message: String, length: ToastLength) {
        val toast = Toast(context)
        if (length == ToastLength.SHORT) {
            toast.duration = Toast.LENGTH_SHORT
        } else {
            toast.duration = Toast.LENGTH_LONG
        }

        //inflate view
        val custom_view = activity.layoutInflater.inflate(R.layout.toast_cust_icon_text, null)
        (custom_view.findViewById(R.id.message) as TextView).text = message
        (custom_view.findViewById(R.id.icon) as ImageView).setImageResource(R.drawable.ic_close)
        (custom_view.findViewById(R.id.parent_view) as MaterialCardView)
            .setCardBackgroundColor(activity.resources.getColor(R.color.red_600, activity.theme))

        toast.view = custom_view
        toast.show()
    }

    fun successToast() {
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_LONG

        //inflate view
        val custom_view = activity.layoutInflater.inflate(R.layout.toast_icon_text, null)
        (custom_view.findViewById(R.id.message) as TextView).text = "Success!"
        (custom_view.findViewById(R.id.icon) as ImageView).setImageResource(R.drawable.ic_done)
        (custom_view.findViewById(R.id.parent_view) as MaterialCardView)
            .setCardBackgroundColor(activity.resources.getColor(R.color.green_500, activity.theme))

        toast.view = custom_view
        toast.show()
    }

    fun successToastCustom(message: String, length: ToastLength) {
        val toast = Toast(context)
        if (length == ToastLength.SHORT) {
            toast.duration = Toast.LENGTH_SHORT
        } else {
            toast.duration = Toast.LENGTH_LONG
        }

        //inflate view
        val custom_view = activity.layoutInflater.inflate(R.layout.toast_cust_icon_text, null)
        (custom_view.findViewById(R.id.message) as TextView).text = message
        (custom_view.findViewById(R.id.icon) as ImageView).setImageResource(R.drawable.ic_done)
        (custom_view.findViewById(R.id.parent_view) as MaterialCardView)
            .setCardBackgroundColor(activity.resources.getColor(R.color.green_500, activity.theme))

        toast.view = custom_view
        toast.show()
    }

    fun infoToastCustom(message: String, length: ToastLength) {
        val toast = Toast(context)
        if (length == ToastLength.SHORT) {
            toast.duration = Toast.LENGTH_SHORT
        } else {
            toast.duration = Toast.LENGTH_LONG
        }

        //inflate view
        val custom_view = activity.layoutInflater.inflate(R.layout.toast_cust_icon_text, null)
        (custom_view.findViewById(R.id.message) as TextView).text = message
        (custom_view.findViewById(R.id.icon) as ImageView).setImageResource(R.drawable.ic_error_outline)
        (custom_view.findViewById(R.id.parent_view) as MaterialCardView)
            .setCardBackgroundColor(activity.resources.getColor(R.color.blue_500, activity.theme))

        toast.view = custom_view
        toast.show()
    }

    fun basicToast(message: String, length: ToastLength) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        if (length == ToastLength.SHORT) {
            toast.duration = Toast.LENGTH_SHORT
        }
        if (length == ToastLength.LONG) {
            toast.duration = Toast.LENGTH_LONG
        }
        toast.show()
    }


}