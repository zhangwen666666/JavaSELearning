//2、请定义一个交通工具(Vehicle)的类
//        其中有属性：
//        速度(speed)
//        体积(size)等等
//        方法移动(move())
//        设置速度(setSpeed(int speed))
//        加速speedUp(),
//        减速speedDown()等等.
//
//        最后在测试类Vehicle中的main()中实例化一个交通工具对象
//        并通过方法给它初始化speed,size的值并且打印出来。
//        另外调用加速减速的方法对速度进行改变。

class Vehicle{
    private double speed;   //速度
    private int size;   //体积

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setSpeed(30.0);
        v.setSize(66);
        System.out.println("speed = " + v.getSpeed() + "\tsize = " + v.getSize());
        v.move();
        v.speedUp();
        System.out.println("speed = " + v.getSpeed());
        v.speedDown();
        System.out.println("speed = " + v.getSpeed());
    }

    //方法移动
    public void move(){
        System.out.println("交通工具正在移动，速度是" + this.speed);
    }

    //setter and getter
    public double getSpeed() {
        return speed;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }

    //加速
    public void speedUp(){
        this.speed += 10;
    }
    //减速
    public void speedDown(){
        if(this.speed - 10 >= 0){
            this.speed -= 10;
        }
        else
            this.speed = 0;
    }

}