package demo.wjj.com.kotlinandroiddemo.bean

import android.content.Context
import android.widget.Toast

/**
 * Created by wangjiajie on 2017/8/7.
 */
class Person {
    //入参1 入餐2 返回类型
    fun addPerson(one: Int, two: Int): Int {
        return one + two
    }

    //修改返回类型
    fun addPersonToString(one: Int, two: Int): String {
        return (one + two).toString()
    }

    fun printResult(one: Int, two: Int, context: Context): Unit {
        Toast.makeText(context, (one + two).toString(), Toast.LENGTH_SHORT).show()
    }

    fun printInt(context: Context): Unit {
        val a: Int = 10086
        val b = 1024
        val c: Int
        c = 10
        Toast.makeText(context, (a + b + (c)).toString(), Toast.LENGTH_SHORT).show()
    }

}