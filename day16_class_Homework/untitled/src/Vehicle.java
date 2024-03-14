//2、请定义一个交通工具(Vehicle)的类
//        其中有属性： 速度(speed) 体积(size)等等
//        方法 移动(move())     设置速度(setSpeed(int speed))      加速speedUp(),      减速speedDown()等等.
//        最后在测试类Vehicle中的main()中实例化一个交通工具对象 并通过方法给它初始化speed,size的值并且打印出来。另外调用加速减速的方法对速度进行改变。
public class Vehicle{
    private int speed;
    private int size;

    public Vehicle(){}
    public Vehicle(int speed,int size){
        this.speed = speed;
        this.size = size;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }

    public void detail(){
        System.out.println("速度：" + speed + ",体积：" + size);
    }

    public void move(){
        System.out.println("Vehicle正在以" + speed + "的速度移动");
    }

    public void speedUp(int num){
        this.speed += num;
    }

    public void speedDown(int num){
       speed =  (speed >= num)?(speed - num):(speed = 0);
    }
    public static void main(String[] args){
        Vehicle v = new Vehicle(60,80);
        v.detail();
        v.speedUp(20);
        v.detail();
        v.speedDown(50);
        v.detail();
    }
}