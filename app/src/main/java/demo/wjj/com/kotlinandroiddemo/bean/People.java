package demo.wjj.com.kotlinandroiddemo.bean;

/**
 * Created by wangjiajie on 2017/8/7.
 */

public class People {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People(String s) {
        name = s;
    }
}
