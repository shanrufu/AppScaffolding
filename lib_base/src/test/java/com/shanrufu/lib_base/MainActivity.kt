package com.shanrufu.lib_base

import android.os.Bundle
import com.shanrufu.lib_base.base.BaseActivity
import com.shanrufu.lib_base.databinding.ActivityMainBinding

/**
 * Created by ShanRuFu on 2020/9/3.
 * FileVersion : 1.0
 * Des :
 */
class MainActivity : BaseActivity() {

    private val mBinding by binding<ActivityMainBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutID(): Int = R.layout.activity_main
}