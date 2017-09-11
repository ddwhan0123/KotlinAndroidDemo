package demo.wjj.com.kotlinandroiddemo.bean.school;

/**
 * Created by wangjiajie on 2017/9/11.
 */

public class Classes extends Student {

    //学生人数
    private int StudentNumber;
    //班名
    private String ClassName;
    //年级
    private int GradeNumber;
    //年级中文名
    private String GradeStr;

    public Classes(String name) {
        super(name);
        this.ClassName = name;
    }

    public Classes(String name, int age) {
        super(name, age);
    }

    public Classes(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getGradeNumber() {
        return GradeNumber;
    }

    public void setGradeNumber(int gradeNumber) {
        GradeNumber = gradeNumber;
    }

    public String getGradeStr() {
        return GradeStr;
    }

    public void setGradeStr(String gradeStr) {
        GradeStr = gradeStr;
    }
}
