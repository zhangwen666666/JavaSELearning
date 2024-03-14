//编写Java程序模拟简单的计算器。定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。编写构造方法赋予n1和n2初始值
//再为该类定义加addition()、减subtraction()、乘multiplication()、除division()等公有实例方法分别对两个成员变量执行加、减、乘、除的运算。
public class Number {
    private int n1;
    private int n2;

    public Number(){}
    public Number(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public void setN1(int n1){this.n1 = n1;}
    public int getN1(){return n1;}
    public void setN2(int n2){this.n2 = n2;}
    public int getN2(){return n2;}

    public int addition(){
        return n1 + n2;
    }
    public int subtraction(){
        return n1 - n2;
    }
    public int division(){
        if(n2 == 0){
            System.out.println("除数不能为0,程序结束");
            System.exit(-1);
        }
        return n1 / n2;
    }
    public int multiplication(){
        return n1 * n2;
    }

    public static void main(String[] args){
        Number num = new Number(10,0);
        System.out.println(num.getN1() + " + " + num.getN2() + " = " + num.addition());
        System.out.println(num.getN1() + " - " + num.getN2() + " = " + num.subtraction());
        System.out.println(num.getN1() + " * " + num.getN2() + " = " + num.multiplication());
        System.out.println(num.getN1() + " / " + num.getN2() + " = " + num.division());
    }
}
