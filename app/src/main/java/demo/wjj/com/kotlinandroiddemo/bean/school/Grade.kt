package demo.wjj.com.kotlinandroiddemo.bean.school

/**
 * Created by wangjiajie on 2017/9/11.
 */
open class Grade(var GradeStr: String = "没名字") {
    var flag = false
    var GradeNumber: Int = 0
        get() {
            return if (flag) {
                9
            } else {
                10
            }
        }

    init {
        println("----> Grade 构造函数 GradeStr " + GradeStr)
    }

    constructor(GradeStr: String, GradeNumber: Int = 7) : this(GradeStr) {
        this.GradeNumber = GradeNumber
        println("----> Grade 次构造函数 GradeNumber " + GradeNumber)
    }
}