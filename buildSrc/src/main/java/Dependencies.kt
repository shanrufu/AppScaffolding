/**
 * Created by ShanRuFu on 2020/9/1.
 * FileVersion : 1.0
 * Des : 所有依赖库统一管理
 */
object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    const val swiperefreshlayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshlayout}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
}

object Android {
    const val meteria = "com.google.android.material:material:${Versions.material}"
}

/**
 * Jetpack组件
 */
object Jetpack {
    //初始化组件
    const val appStartup = "androidx.startup:startup-runtime:${Versions.appStartup}"
    //数据库组件
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    //分页列表组件
    const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"
    //导航组件
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    //依赖注入组件
    const val hiltDaggerRuntime = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltDaggerCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltViewModule = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModule}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltViewModule}"
    //后台作业调度组件
    const val workManagerKtx = "androidx.work:work-runtime-ktx:${Versions.workManager}"
}

/**
 * kotlin相关
 */
object Kt {
    const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

/**
 * 协程
 */
object Coroutines {
    const val android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    const val viewModelScope =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.coroutinesScope}"
    const val lifecycleScope =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.coroutinesScope}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.coroutinesScope}"
}

/**
 * 网络框架 Retrofit + OkHttp + Gson
 */
object Net {
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
}

/**
 * 第三方开源库依赖
 */
object OtherDepend {
    //图片加载
    const val coil = "io.coil-kt:coil:${Versions.runtime}"

    //阿里路由
    const val arouter = "com.alibaba:arouter-api:${Versions.arouter}"
    const val arouterCompiler = "com.alibaba:arouter-compiler:${Versions.arouterCompiler}"

    //EventBus事件总线
    const val eventBus = "org.greenrobot:eventbus:${Versions.eventBus}"

    //腾讯MMKV
    const val mmkv = "com.tencent:mmkv-static:${Versions.mmkv}"

    //lottie动画
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

    //RecycleView万能适配器
    const val baseAdapter =
        "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Versions.baseAdapter}"

    //测试相关
    const val junit = "junit:junit:${Versions.junit}"
    const val androidTestJunit = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}