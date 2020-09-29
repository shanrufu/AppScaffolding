package com.shanrufu.lib_common.livepermissions

/**
 * Created by ShanRuFu on 2020/9/22.
 * FileVersion : 1.0
 * Des :
 */
sealed class PermissionResult {

    object Grant : PermissionResult()

    class Deny(val permissions: Array<String>) : PermissionResult()

    class Rationale(val permissions: Array<String>) : PermissionResult()
}