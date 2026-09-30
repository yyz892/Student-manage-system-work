import java.util.Scanner;

public class Student {
    private long studentcode;
    private String studentname;
    private int age;
    private double score;
    public Student(){
    }
    public Student(long studentcode,String studentname,int age,double score){
        this.studentcode=studentcode;
        this.studentname=studentname;
        this.age=age;
        this.score=score;
    }
    public long getStudentcode() {return studentcode;}
    public void setStudentcode(long studentcode) {this.studentcode = studentcode;}
    public String getStudentname() {return studentname;}
    public void setStudentname(String studentname) {this.studentname = studentname;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public double getScore() {return score;}
    public void setScore(double score) {this.score = score;}
    @Override
    public String toString() {
        return"学号"+studentcode+"姓名"+studentname+"年龄"+age+"成绩"+score;
    }
    Scanner sc=new Scanner(System.in);
}
