/*
3、在程序中经常要对时间进行操作但是并没有时间类型的数据。
        那么我们可以自己实现一个时间类来满足程序中的需要。
        定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
        为了保证数据的安全性这三个成员变量应声明为私有。
        为MyTime类定义构造方法以方便创建对象时初始化成员变量。
        再定义diaplay方法用于将时间信息打印出来。
        为MyTime类添加以下方法
        addSecond(int sec)
        addMinute(int min)
        addHour(int hou)
        subSecond(int sec)
        subMinute(int min)
        subHour(int hou)
        分别对时、分、秒进行加减运算。
*/
public class Homework03 {
    public static void main(String[] args) {
        MyTime time = new MyTime(20,40,59);
        time.display();
        time.addSecond(3600);
        time.display();
        time.addMinute(28);
        time.display();
        time.addHour(3);
        time.display();
        time.subHour(26);
        time.display();
        time.subMinute(9+60);
        time.display();
        time.subSecond(60*60);
        time.display();
    }
}

//时间类
class MyTime{
    private int hour;
    private int minute;
    private int second;

    //构造函数
    public MyTime(){}
    public MyTime(int hour,int minute,int second){
        this.hour = hour % 24;
        this.minute = minute % 60;
        this.second = second % 60;
    }

    //打印时间
    public void display(){
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }

    //分别对时、分、秒进行加减运算。
    public void addSecond(int second){
        if(((this.second + second) / 60) != 0)
            this.addMinute((this.second + second) / 60);
        this.second = (this.second + second) % 60;
    }
    public void addMinute(int minute){
        if(((this.minute + minute) / 60) != 0)
            this.addHour((this.minute + minute) / 60);
        this.minute = (this.minute + minute) % 60;
    }
    public void addHour(int hour){
        this.hour = (this.hour + hour) % 24;
    }
    public void subSecond(int second){
        this.second -= second;
        int minute = 0;
        while(this.second < 0){
            this.second += 60;
            minute++;
        }
        if(minute != 0)
            this.subMinute(minute);
    }
    public void subMinute(int minute){
        this.minute -= minute;
        while(this.minute < 0){
            this.minute += 60;
            this.subHour(1);
        }
    }
    public void subHour(int hour){
        this.hour -= hour;
        while(this.hour < 0)
            this.hour += 24;
    }
}
