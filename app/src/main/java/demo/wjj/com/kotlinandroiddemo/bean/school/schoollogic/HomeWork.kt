package demo.wjj.com.kotlinandroiddemo.bean.school.schoollogic

/**
 * Created by wangjiajie on 2017/9/27.
 */
interface HomeWork {
    //学生作业-背书
    fun readBook()

    //学生作业-做数学题
    fun doMathQuestion() {
        println("----->算数学题")
    }
}