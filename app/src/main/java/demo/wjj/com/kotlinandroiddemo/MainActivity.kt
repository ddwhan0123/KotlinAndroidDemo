package demo.wjj.com.kotlinandroiddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import demo.wjj.com.kotlinandroiddemo.bean.People
import demo.wjj.com.kotlinandroiddemo.bean.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("--->", "MainActivity onCreate")
        setContentView(R.layout.activity_main)
        button.text = "我是被改之后的按钮"
        button.setOnClickListener { Toast.makeText(this, "MainActivity setOnClickListener", Toast.LENGTH_SHORT).show() }

        printObj.text = "打印特殊内容"
        printObj.setOnClickListener {
            //            val people = People("WangJJ")
//            Toast.makeText(this, people.name, Toast.LENGTH_SHORT).show()
            val person = Person()
            person.printInt(this)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("--->", "MainActivity onDestroy")
    }

}
