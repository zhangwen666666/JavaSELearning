package a.b;

import annotation.Column;
import annotation.Table;

@Table("t_vip")
public class Vip {
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "grade", type = "int")
    private int grade;
}
