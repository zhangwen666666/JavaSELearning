/*定义一个病毒类
        属性包括：病毒名称name、病毒体积size、病毒类型type
        属性私有化，对外提供公开的set和get方法
        提供无参数构造和有参数构造
        提供一个攻击attack()方法，该方法的参数是“人”，例如：attack(Person p)
        在attack()方法中调用人对象的生病方法。*/
public class Virus {
    private String name;
    private int size;
    private String type;
    public Virus(){}

    public Virus(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attack(Person p){
        p.ill();
    }

    public static void main(String[] args) {
        Virus v = new Virus("天花病毒",1,"性病");
        Person p = new Person("李四",30,"女");
        v.attack(p);
    }
}
