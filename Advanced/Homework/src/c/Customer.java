package c;

import annotation.Column;
import annotation.Table;

@Table("t_customer")
public class Customer {
    @Column(name="cid")
    private String cid;
    @Column(name="name")
    private String name;
    @Column(name="age",type="int")
    private int age;
    @Column(name="address")
    private String address;
}
