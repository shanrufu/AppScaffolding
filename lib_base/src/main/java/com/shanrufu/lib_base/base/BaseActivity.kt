package com.shanrufu.lib_base.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.shanrufu.lib_base.util.StatusBarKt
import org.greenrobot.eventbus.EventBus

/**
 * Created by ShanRuFu on 2020/9/2.
 * FileVersion : 1.0
 * Des :
 */
abstract class BaseActivity<DB : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var mBinding: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, getLayoutID())
        mBinding.lifecycleOwner = this
        initData()
        initView()
    }

    abstract fun getLayoutID(): Int

    abstract fun initData()

    abstract fun initView()

    protected fun registerBus() {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unRegisterBus()
    }

    private fun unRegisterBus() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this)
        }
    }
}