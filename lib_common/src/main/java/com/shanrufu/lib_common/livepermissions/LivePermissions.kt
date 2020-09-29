package com.shanrufu.lib_common.livepermissions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LiveData

/**
 * Created by ShanRuFu on 2020/9/22.
 * FileVersion : 1.0
 * Des :
 */
class LivePermissions {
    companion object {
        const val TAG = "LivePermissions"
    }

    constructor(activity: AppCompatActivity) {
        liveFragment = getInstance(activity.supportFragmentManager)
    }

    constructor(fragment: Fragment) {
        liveFragment = getInstance(fragment.childFragmentManager)
    }

    @Volatile
    private var liveFragment: LiveFragment? = null

    private fun getInstance(fragmentManager: FragmentManager): LiveFragment {
        return liveFragment ?: synchronized(this) {
            liveFragment ?: if (fragmentManager.findFragmentByTag(TAG) == null) LiveFragment().run {
                fragmentManager.beginTransaction().add(this, TAG).commitNow()
                this
            } else fragmentManager.findFragmentByTag(TAG) as LiveFragment
        }
    }

    fun request(vararg permissions: String): LiveData<PermissionResult> {
        return this.requestArray(permissions)
    }

    fun requestArray(permissions: Array<out String>): LiveData<PermissionResult> {
        liveFragment!!.requestPermissions(permissions)
        return liveFragment!!.liveData
    }
}