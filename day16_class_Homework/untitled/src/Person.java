//编写Java程序用于显示人的姓名和年龄。定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
//定义构造方法用来初始化数据成员。再定义显示display方法将姓名和年龄打印出来。在main方法中创建人类的实例然后将信息显示
public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}
    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void display(){
        System.out.println("name:" + name + ",age:" + age);
    }

    public static void main(String[] args){
        Person p = new Person();
        p.setName("张三");
        p.setAge(20);
        p.display();
    }
}
