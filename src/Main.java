import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static void Main() {
        System.out.println(" 欢迎进入学生管理系统");
        Scanner sc =new Scanner(System.in);
        List<Student> list=new ArrayList<>();
        while (true){System.out.println("======================== 学生信息管理系统 ======================== \n" +
                "1. 添加 \n" +
                "2. 查看所有学生 \n" +
                " 3. 查询学生 \n" +
                "4. 修改学生 \n" +
                "5. 删除学生 \n" +
                "0. 退出系统 ======================== \n" +
                "请选择：");
            int a = sc.nextInt();
            switch (a){
                case 1: System.out.println("添加学生");break;
                case 2: System.out.println("查看所有学生");break;
                case 3: System.out.println("查询学生");break;
                case 4: System.out.println("修改学生");break;
                case 5: System.out.println("删除学生");break;
                case 0: System.exit(0); break;
                default: System.out.println("请重新输入"); break;
            }
        }
    }
}