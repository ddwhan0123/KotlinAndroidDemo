package demo.wjj.com.kotlinandroiddemo.base

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

/**
 * Created by wangjiajie on 2017/9/11.
 */
abstract class BaseActivity() : AppCompatActivity() {
    init {
        Log.d("--->", "BaseActivity init block")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutID())
        init()
        setListener()
        Log.d("--->", "BaseActivity onCreate")
    }

    //父类的抽象方法，给子类去实现
    abstract fun getLayoutID(): Int

    abstract fun init()

    abstract fun setListener()

    override fun onResume() {
        super.onResume()
        Log.d("--->", "BaseActivity onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("--->", "BaseActivity onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("--->", "BaseActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        testPrivate()
        Log.d("--->", "BaseActivity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("--->", "BaseActivity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("--->", "BaseActivity onDestroy")
    }

    //方法默认是final的，不可被子类重载，若需要被重载，使用关键词 open 进行修饰
    open fun showToast(context: Context, msg: String, time: Int) {
        Toast.makeText(context, msg, time).show()
        Log.d("--->", "BaseActivity showToast")
    }

    //获取appVersionName,子类无法调用
    protected fun showAppVersionName(cotext: Context): String {
        var versionName = ""
        try {
            val pm: PackageManager = cotext.packageManager
            val pi: PackageInfo = pm.getPackageInfo(cotext.packageName, 0)
            versionName = pi.versionName
            if (versionName == null) {
                return ""
            }
        } catch (e: Exception) {
            Log.e("VersionInfo", "Exception", e)
        }
        return versionName
    }

    //子类无法调用
    private fun testPrivate() {
        Log.d("--->", "testPrivate")
    }

    //子类可以使用
    public fun getMyPackageName(context: Context): String {
        return context.packageName
    }
}