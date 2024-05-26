package a;

import annotation.Column;
import annotation.Table;

@Table("t_user")
public class User {
    @Column(name = "userid")
    private String userid;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "age", type = "int")
    private int age;

    private String email;
}
