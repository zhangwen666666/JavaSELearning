public class Test {
    public static void main(String[] args) {
        Address a1 = new Address("大同市","开源街","037004");
        Address a2 = new Address("大同市","开源街","037004");
        Address a3 = new Address("大同市","开源街","037008");
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(null instanceof Address);
        System.out.println(a1);
        User u1 = new User("张三",a1);
        User u2 = new User("张三",a2);
        User u3 = new User("张三",a3);
        User u4 = new User("李四",a3);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
        System.out.println(u1.equals(u2)); //true
        System.out.println(u1.equals(u3));  //false
        System.out.println(u3.equals(u4));  //false
    }
}

class User{
    private String name;
    private Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public String toString(){
        return "姓名：" + name + "\t地址信息：" + addr.toString();
    }

    public boolean equals(Object obj){
        if(!(obj instanceof User)) return false;
        if (obj == this) return true;
        User temp = (User)obj;
        return name.equals(temp.name) && addr.equals(temp.addr);
    }
}

class Address{
    private String city;
    private String street;
    private String zipCode;

    public Address() {
    }

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString(){
        return "城市：" + city + ",街道：" + street + ",邮编：" + zipCode;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Address)) return false;
        if(obj == this) return true;
        Address tmp = (Address)obj;
        return city.equals(tmp.getCity()) && street.equals(tmp.getStreet()) && zipCode.equals(tmp.getZipCode());
    }
}
