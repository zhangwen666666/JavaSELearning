/*1.定义一个用户类
        要处理的信息有用户ID、用户密码、email地址。
        属性私有化，对外提供公开的set和get方法
        提供无参数构造方法
        提供有参数构造方法
        提供一个showInfo()方法，通过这个方法展示用户信息。
        编写测试程序创建对象，调用showInfo()方法。*/
public class User {
    private String id;
    private String password;
    private String emailAddress;

    public User() {
    }

    public User(String id, String password, String emailAddress) {
        this.id = id;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void showInfo(){
        System.out.println("id:" + id + ",password:" + password + ",emailAddress:" + emailAddress);
    }

    public static void main(String[] args) {
        User u = new User("1234","zhang","037000");
        u.showInfo();
    }
}
