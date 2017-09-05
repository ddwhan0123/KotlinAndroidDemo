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
        printValue()
    }

    fun printValue() {
        var a: Int = 10
        var b: Long = 10
        var c: Short = 10
        var d: Byte = 10
        var e: Double = 10.0
        var f: Float = 10.0f
        var g: Int = f.toInt()
        var h: Boolean = true
        var i: Char = '1'
        var j = Array(10, { i1 -> i1 * i1 })
        var k = emptyArray<Int>().distinct()
        var l: String = "1086"
        var m = l.length
//        var n = """
//           if(a){}
//        """
        var o: String = f.toString() + "1234"
        var p = 1024
        if (i.toInt() > a) p = a
        var q = if (100 < a) 100 else a
        println("---> a " + a + " b " + b + " c " + c + " d " + d + " e " + e + " f " + f +
                " g " + g + " h " + h + " i " + i + " j " + j.size + " k " + k + " l " + l + " m " + m +
                " o " + o + " p " + p + " q " + q)
    }

    fun testWhen(people: People) {
        when (people.name) {
            "", "10086" -> println("name是空的或者10086")
            "wjj" -> println("name 是 wjj")
            else -> {
                println("名字是 " + people.name)
            }
        }
        val a = 8
        when {
            a > 0 -> println("a > 0")
            a < 5 -> println("a < 10")
            else -> println("其他")
        }

        var list = arrayOf(1, 2, 3)
        for (i in list.indices)
            println("下标 " + i + " 内容 " + list[i])

        for ((index, value) in list.withIndex()) {
            println("下标是 $index 内容是 $value")
        }
    }

}