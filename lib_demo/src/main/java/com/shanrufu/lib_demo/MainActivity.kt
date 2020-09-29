package com.shanrufu.lib_demo

import android.Manifest
import com.shanrufu.lib_base.base.BaseActivity
import com.shanrufu.lib_common.livepermissions.LivePermissions
import com.shanrufu.lib_common.livepermissions.PermissionResult
import com.shanrufu.lib_demo.databinding.DemoActivityMainBinding

class MainActivity : BaseActivity<DemoActivityMainBinding>() {

    override fun getLayoutID() = R.layout.demo_activity_main

    override fun initData() {

    }

    override fun initView() {
        LivePermissions(this).request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
            .observe(this, {
                when (it) {
                    is PermissionResult.Grant -> {

                    }
                    is PermissionResult.Deny -> {
                        it.permissions.forEach {

                        }
                    }
                }
            })
    }
}