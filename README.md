# -实验四接口及异常处理

一、实验目的

1、掌握Java中抽象类和抽象方法的定义;
2、掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法;
3、了解异常的使用方法，并在程序中根据输入情况做异常处理;

二、实验内容

某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。

设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。

设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。

编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。

三、实验要求

在博士研究生类中实现各个接口定义的抽象方法;
对年学费和年收入进行统计，用收入减去学费，求得纳税额；
国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。
实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
根据输入情况，要在程序中做异常处理。

四、流程图
![image](https://github.com/xufeng11842/-/blob/main/3.png)

五、实验步骤

1.先用interface来定义student和teacher这两个接口接口

2.然后在Graduate里面用implements来实现这两个接口

3.在Graduate里面把学费，收入，纳税的算法写出来

4.用输出函数把姓名，性别，年龄，月收入，学费写出来

5.用for循环来把这些变量循环，一直到有两个研究生后退出程序

6.加入try-catch函数做异常处理，不能输入与收入无关的东西

六、核心代码

这些代码是从输入姓名到最后的纳税，中间有try-catch做异常处理
{
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
七、实验结果
![image](https://github.com/xufeng11842/-/blob/main/2.png)

八、实验感想
对于这次实验，对于scanner输出函数和for循环函数加深了了解程度，对于try-catch异常处理有了初步了解
知道了interface定义接口，implement实现接口，还有重写接口的方法在实验中有所体会，抽象类既可以重写接口中的方法，也能直接拥有接口中的方法我了解了异常处理机制，异常Exception是Java中非常常用的功能，它可以简化代码，并且增强代码的安全性。会简单处理一些异常，明白异常处理机制可以保证代码的稳健性，在编程中发挥着重要作用。同时通过实验理解了inferface定义接口的应用还有接口中不能含有静态代码块以及静态方法(用 static 修饰的方法)，而抽象类是可以有静态代码块和静态方法；接口可以多继承。



