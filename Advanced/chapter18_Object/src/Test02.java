public class Test02{
    public static void main(String[] args){
        // 调用MyMath中的mySum方法。
        MyMath mm = new MyMath();
        mm.mySum(new ComputeImpl(), 100, 200); // 100+200=300

        mm.mySum(new Compute(){
            public int sum(int a, int b){return a + b;}
        },200,300);     //200+300=500
    }

}

// 负责计算的接口
interface Compute{
    // 抽象方法
    int sum(int a, int b);
}


// 数学类
class MyMath{
    // 数学求和方法
    public void mySum(Compute c, int x, int y){
        int retValue = c.sum(x, y);
        System.out.println(x + "+" + y + "=" + retValue);
    }
}


class ComputeImpl implements Compute{
    // 对方法的实现
    public int sum(int a, int b){
        return a + b;
    }
}
