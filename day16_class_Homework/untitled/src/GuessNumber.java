public class GuessNumber{
    public static void main(String[] args){
        System.out.print("请输入初始值：");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num = scanner.nextInt();
        A a = new A(num);
        B.guess(a);
    }

}

//1、猜数字游戏
//        一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
//        另外再定义一个类B，对A类的实例变量v进行猜测。
//        如果大了则提示大了
//        小了则提示小了
//        等于则提示猜测成功

class A{
    private int value;

    public A(){}
    public A(int value){
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}

class B{
    public static void guess(A a){
        while(true){
            System.out.print("请输入你猜测的值：");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int num = scanner.nextInt();
            if(a.getValue() == num){
                System.out.println("猜测成功");
                return;
            }
            else if(a.getValue() > num)
                System.out.println("猜小了");
            else
                System.out.println("猜大了");
        }
    }
}
