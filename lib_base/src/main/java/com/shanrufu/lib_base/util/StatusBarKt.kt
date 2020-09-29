package com.shanrufu.lib_base.util

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.view.View
import android.view.WindowManager

/**
 * Created by ShanRuFu on 2020/9/2.
 * FileVersion : 1.0
 * Des :
 */
object StatusBarKt {

    /**
     * 沉浸式状态栏
     */
    fun fitStatusBar(activity: Activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
            return

        val window = activity.window
        val decorView = window.decorView
        decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = Color.TRANSPARENT
    }

    /**
     * 调整状态栏文字、图标颜色 > 6.0
     * true:白底黑字
     * false:黑底白字
     */
    fun lightStatusBar(activity: Activity, light: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
            return
        val window = activity.window
        val decorView = window.decorView
        var visibility = decorView.systemUiVisibility

        visibility = if (light) {
            visibility or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        } else {
            visibility and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
        }
        decorView.systemUiVisibility = visibility
    }
}