//定义名为MyTime的类其中应有三个整型成员时hour分minute秒second,为了保证数据的安全性这三个成员变量应声明为私有。
//为MyTime类定义构造方法以方便创建对象时初始化成员变量。再定义diaplay方法用于将时间信息打印出来。
//为MyTime类添加以下方法 addSecond(int sec) addMinute(int min) addHour(int hou) subSecond(int sec) subMinute(int min) subHour(int hou)
// 分别对时、分、秒进行加减运算。
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public static void main(String[] args){
        MyTime time = new MyTime(23,35,59);
        time.display();
        time.addHour(3);
        time.display();
        time.subHour(26);
        time.display();
        time.addMinute(100);
        time.display();
        time.subMinute(100);
        time.display();
        time.addSecond(3601);
        time.display();
        time.subSecond(7201);
        time.display();
    }

    //构造器
    public MyTime(){this(6,0,0);}
    public MyTime(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //对时进行加减计算
    public void addHour(int hour){
        this.hour += hour;
        this.hour %= 24;
    }
    public void subHour(int hour){
        this.hour -= hour;
        while(this.hour<0){
            this.hour += 24;
        }
    }

    //对分进行加减操作
    public void addMinute(int minute){
        this.minute += minute;
        int hour = this.minute / 60;
        this.minute %= 60;
        this.addHour(hour);
    }
    public void subMinute(int minute){
        this.minute -= minute;
        int hour = 0;
        while(this.minute < 0){
            hour += 1;
            this.minute += 60;
        }
        this.subHour(hour);
    }

    //对秒进行加减操作
    public void addSecond(int second){
        this.second += second;
        int minute = this.second / 60;
        this.second %= 60;
        this.addMinute(minute);
    }
    public void subSecond(int second){
        this.second -= second;
        int minute = 0;
        while(this.second < 0){
            this.second += 60;
            minute += 1;
        }
        this.subMinute(minute);
    }

    //setter and getter
    public void setHour(int hour){this.hour = hour;}
    public int getHour(){return hour;}
    public void setMinute(int minute){this.minute = minute;}
    public int getMinute(){return minute;}
    public void setSecond(int second){this.second = second;}
    public int getSecond(){return second;}

    //打印时间
    public void display(){
        System.out.println(this.hour + "." + this.minute + "." + this.second);
    }
}
