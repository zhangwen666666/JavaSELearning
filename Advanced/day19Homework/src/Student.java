/*2、定义一个学生类
        属性包括：学生编号、学生姓名、学生年龄
        属性私有化，对外提供公开的set和get方法
        提供无参构造和有参数构造方法
        提供一个display()方法，通过该方法打印学生信息。
        编写测试程序创建对象，调用display()方法。*/
public class Student {
    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("id:" + id + ",name:" + name + ",age:" + age);
    }

    public static void main(String[] args) {
        Student s = new Student("12314234","张三",23);
        s.display();
    }
}
