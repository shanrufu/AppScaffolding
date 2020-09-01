/**
 * Created by ShanRuFu on 2020/9/1.
 * FileVersion : 1.0
 * Des :
 */
object Versions {
    const val appcompat = "1.2.0"
    const val coreKtx = "1.3.1"
    const val constraintlayout = "2.0.1"
    const val hilt = "2.28-alpha"
    const val runtime = "0.11.0"
    const val material = "1.2.0-alpha06"
    const val hiltViewModule = "1.0.0-alpha01"
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
}

object Android {
    const val meteria = "com.google.android.material:material:${Versions.material}"
}

object Hilt {
    val daggerRuntime = "com.google.dagger:hilt-android:${Versions.hilt}"
    val daggerCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    val viewModule = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModule}"
    val compiler = "androidx.hilt:hilt-compiler:${Versions.hiltViewModule}"
}

object Coil {
    val runtime = "io.coil-kt:coil:${Versions.runtime}"
}

object Retrofit {

}

object OkHttp {

}

object Gson {

}

object Test {

}