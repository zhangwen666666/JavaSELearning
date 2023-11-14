public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.guessNum(a);
    }
}

class A{
    int v;

    public A() {
        System.out.println("请输入答案：");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        v = scanner.nextInt();
    }
}

class B{
    public void guessNum(A a){
        while(true){
            System.out.println("请输入你的答案：");
            java.util.Scanner scanner= new java.util.Scanner(System.in);
            int num = scanner.nextInt();
            if(num == a.v){
                System.out.println("猜对了");
                break;
            }
            else if (num > a.v)
                System.out.println("猜大了");
            else
                System.out.println("猜小了");
        }
    }
}