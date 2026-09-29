import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" 欢迎进入学生管理系统");
        Scanner sc =new Scanner(System.in);
        List<Student> list=new ArrayList<>();
        while (true){System.out.println("======================== 学生信息管理系统 ======================== \n" +
                "1. 添加学生 \n" +
                "2. 查看所有学生 \n" +
                " 3. 查询学生 \n" +
                "4. 修改学生 \n" +
                "5. 删除学生 \n" +
                "0. 退出系统 ======================== \n" +
                "请选择：");
            int a = sc.nextInt();
            switch (a){
                case 1: System.out.println("添加学生");
                    System.out.println("请输入学生学号");
                    long scode = sc.nextLong();
                    System.out.println("请输入姓名");
                    String sname =sc.next();
                    System.out.println("请输入年龄");
                    int sage=sc.nextInt();
                    System.out.println("请输入成绩");
                    double sscore = sc.nextDouble();
                    Student s1 =new Student(scode,sname,sage,sscore);
                    list.add(s1);
                break;
                case 2: System.out.println("查看所有学生");
                for (Student student:list){
                    System.out.println(student);
                }break;
                case 3: System.out.println("查询学生");
                    System.out.println("请输入查询学生的学号");
                    long detectnumber = sc.nextLong();
                    int count= 0;
                    for(Student student:list){
                        if(student.getStudentcode()==detectnumber){
                            System.out.println(student);
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("请输入正确的学号");
                    }
                    break;
                case 4: System.out.println("修改学生");
                    System.out.println("请输入要修改学生的学号");
                    long alternumber = sc.nextLong();
                break;
                case 5: System.out.println("删除学生");
                    System.out.println("请输入要删除学生的学号");
                    long removenumber = sc.nextLong();
                    /*for (Student student:list){
                        if(student.getStudentcode()==removenumber){
                            list.remove(student);
                        }
                    }*/
                    for (int d=0;d<list.size();d++){
                        if (list.get(d).getStudentcode()==removenumber){
                            list.remove(d);
                            break;
                        }
                    }
                case 0: System.exit(0); break;
                default: System.out.println("请重新输入"); break;
            }
        }
    }
}
