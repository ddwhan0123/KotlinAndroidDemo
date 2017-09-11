package demo.wjj.com.kotlinandroiddemo.bean.school

/**
 * Created by wangjiajie on 2017/9/11.
 */
open class Student(var name: String) {
    init {
        if (name.equals("wjj")) {
            name = "王亟亟"
        }
        println("----> Student 构造函数 name " + name)
    }

    var age: Int = 0
    var sex: Boolean = true
        get() {
            return !name.equals("王亟亟")
        }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, sex: Boolean) : this(name) {
        this.age = age
        this.sex = sex
    }

}