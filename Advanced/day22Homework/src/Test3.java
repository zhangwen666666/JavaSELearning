/*第三题：
        按要求编写一个Java应用程序程序：
        （1）定义一个接口CanFly，描述会飞的方法public void fly();
        （2）分别定义类飞机和鸟，实现CanFly接口。
        （3）定义一个测试类，测试飞机和鸟，在main方法中创建飞机对象和鸟对象，

        再定义一个makeFly()方法，其中让会飞的事物飞。并在main方法中调用该方法，让飞机和鸟起飞。*/
public class Test3 {
    public void makeFly(CanFly c){
        c.fly();
    }

    public static void main(String[] args) {
        Test3 t= new Test3();
        Airplane a = new Airplane();
        Bird b = new Bird();
        t.makeFly(a);
        t.makeFly(b);
    }
}

interface CanFly{
    public void fly();
}

class Airplane implements CanFly{
    public void fly(){
        System.out.println("飞机会飞");
    }
}

class Bird implements CanFly{
    public void fly(){
        System.out.println("鸟儿会飞");
    }
}
