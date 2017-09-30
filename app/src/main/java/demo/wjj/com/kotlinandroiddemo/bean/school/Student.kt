package demo.wjj.com.kotlinandroiddemo.bean.school

import demo.wjj.com.kotlinandroiddemo.bean.school.schoollogic.HomeWork
import demo.wjj.com.kotlinandroiddemo.bean.school.schoollogic.WeekendWork

/**
 * Created by wangjiajie on 2017/9/11.
 */
open class Student(var name: String) : HomeWork, WeekendWork {
    override fun doMathQuestion() {
        println("----->学生周末做题了")
        super<HomeWork>.doMathQuestion()
    }

    override fun readBook() {
        println("----->学生读书了")
    }

    //初始化方法
    init {
        if (name.equals("wjj")) {
            name = "王亟亟"
        }
        println("----> Student 构造函数 name " + name)
    }

    var age: Int = 0
    var sex: Boolean = true//修改引用的值
        get() {
            return name != "王亟亟"
        }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, sex: Boolean) : this(name) {
        this.age = age
        this.sex = sex
    }
}