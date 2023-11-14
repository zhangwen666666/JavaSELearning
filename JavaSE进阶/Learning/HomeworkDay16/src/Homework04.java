/*
4、编写Java程序模拟简单的计算器。
定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值
再为该类定义加addition()、减subtration()、乘multiplication()、除division()等公有实例方法
分别对两个成员变量执行加、减、乘、除的运算。

在main方法中创建Number类的对象调用各个方法并显示计算结果
 */
public class Homework04 {
    public static void main(String[] args) {
        Number num = new Number(30,20);
        num.add();
        num.sub();
        num.mul();
        num.div();
    }
}

class Number{
    private int n1;
    private int n2;

    //构造方法
    public Number() {}
    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //加法
    public void add(){
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }
    //减法
    public void sub(){
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
    }
    //乘法
    public void mul(){
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
    }
    //除法
    public void div(){
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    }
}