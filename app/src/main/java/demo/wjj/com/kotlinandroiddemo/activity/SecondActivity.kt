package demo.wjj.com.kotlinandroiddemo.activity

import android.content.Context
import android.util.Log

import demo.wjj.com.kotlinandroiddemo.R
import demo.wjj.com.kotlinandroiddemo.base.BaseActivity

//这里只是随便写了个构造函数
class SecondActivity : BaseActivity("") {
    //对onCreate方法进行了拆分，这里会返回布局ID
    override fun getLayoutID(): Int {
        return R.layout.activity_second
    }

    //对onCreate方法进行了拆分，这里可以做简单对初始化操作
    override fun init() {
        Log.d("--->", "SecondActivity init")
        Log.d("--->", "getMyPackageName " + getMyPackageName(this))
    }

    //对onCreate方法进行了拆分，这里可以设置各种监听
    override fun setListener() {
        Log.d("--->", "SecondActivity setListener")
    }

    override fun onResume() {
        super.onResume()
        Log.d("--->", "SecondActivity onResume")
        showToast(this, "我是第二页的 Toast", 1)
    }

    override fun onPause() {
        super.onPause()
        Log.d("--->", "SecondActivity onPause")
    }

    //重载了父类的showToast方法
    //子类重载方法使用 override 关键词
    override fun showToast(context: Context, msg: String, time: Int) {
        Log.d("--->", "SecondActivity showToast 被重写 ")
        Log.d("--->", " VersionName " + showAppVersionName(this))
    }
}
