/*第二题：
        利用接口做参数，写个计算器，能完成加减乘除运算。
        （1）定义一个接口Compute含有一个方法int computer(int n, int m)。
        （2）设计四个类分别实现此接口，完成加、减、乘、除运算。
        （3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
        （4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。*/
public class Test2 {
    public static void main(String[] args) {
        Compute com1 = new Add();
        Compute com2 = new Sub();
        Compute com3 = new Mul();
        Compute com4 = new Div();
        UseComputer u = new UseComputer();
        int num1 = 20;
        int num2 = 10;
        u.useCom(com1, num1, num2);
        u.useCom(com2, num1, num2);
        u.useCom(com3, num1, num2);
        u.useCom(com4, num1, num2);
    }
}

class UseComputer {
    public void useCom(Compute com, int num1, int num2) {
        System.out.println(com.computer(num1, num2));
    }
}

interface Compute {
    public abstract int computer(int n, int m);
}

class Add implements Compute {
    public int computer(int a, int b) {
        return a + b;
    }
}

class Sub implements Compute {
    public int computer(int a, int b) {
        return a - b;
    }
}

class Mul implements Compute {
    public int computer(int a, int b) {
        return a * b;
    }
}

class Div implements Compute {
    public int computer(int a, int b) {
        return a / b;
    }
}