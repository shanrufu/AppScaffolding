package com.shanrufu.lib_base.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * Created by ShanRuFu on 2020/9/3.
 * FileVersion : 1.0
 * Des :
 */
abstract class BaseFragment<DB : ViewDataBinding> : Fragment() {

    protected lateinit var mBinding: DB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, getLayoutID(), container, false)
        return mBinding.root
    }

    abstract fun getLayoutID(): Int
}