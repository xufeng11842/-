package shiyan3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<2;i++) {
            Graduate graduate1 = new Graduate();
            Graduate graduate2 = new Graduate();
            System.out.println("输入姓名，性别，年龄");
            Scanner y = new Scanner(System.in);
            String name = y.nextLine();
            String sex = y.nextLine();
            int age = y.nextInt();
            graduate1.setGraduate(name, sex, age);
            try {
                Scanner in = new Scanner(System.in);
                System.out.println(graduate1);
                System.out.println("请输入你的月工资：");
                double pay = in.nextDouble();
                graduate1.setPay(pay);
                System.out.println("请输入你的学费：");
                double fee = in.nextDouble();
                graduate1.setFee(fee);
                graduate1.setRatal();
                System.out.println("\t");
                graduate2.setGraduate(name, sex, age);
            }catch (Exception in){
                System.out.println("输入有问题，再次输入");
                i--;
            }
        }
    }
}


