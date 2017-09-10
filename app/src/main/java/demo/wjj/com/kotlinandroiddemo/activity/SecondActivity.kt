package demo.wjj.com.kotlinandroiddemo.activity

import android.content.Context
import android.util.Log

import demo.wjj.com.kotlinandroiddemo.R
import demo.wjj.com.kotlinandroiddemo.base.BaseActivity

class SecondActivity : BaseActivity() {
    override fun getLayoutID(): Int {
        return R.layout.activity_second
    }

    override fun init() {
        Log.d("--->","SecondActivity init")
    }

    override fun setListener() {
        Log.d("--->","SecondActivity setListener")
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

    override fun showToast(context: Context, msg: String, time: Int) {
        Log.d("--->", "SecondActivity showToast 被重写 ")
        Log.d("--->", " VersionName " + showAppVersionName(this))
    }

}
