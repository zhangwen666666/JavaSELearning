public class Homework {
    public static void main(String[] args){
        Employee e1 = new SalariedEmployee("固定工资",5,6666.66);
        Employee e2 = new HourlyEmployee("小时工",10,12.5,300);
        Employee e3 = new SalesEmployee("高级销售",3,5000,0.10);
        Employee e4 = new BasePlusSalesEmployee("低级销售",12,3000,0.05,2500);

        int month = 10;
        System.out.println(e1.getName() + month + "月的工资为：" + e1.getSalary(month));
        System.out.println(e2.getName() + month + "月的工资为：" + e2.getSalary(month));
        System.out.println(e3.getName() + month + "月的工资为：" + e3.getSalary(month));
        System.out.println(e4.getName() + month + "月的工资为：" + e4.getSalary(month));
    }
}

class Employee{
    private String name;
    private int birth;
    public Employee(){}
    public Employee(String name,int birth){
        this.name = name;
        this.birth = birth;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void setBirth(int birth){this.birth = birth;}
    public int getBirth(){return birth;}

    public double getSalary(int month){
        double salary = 0;
        salary = month == this.birth? 10000+100:100;
        return salary;
    }
}


class SalariedEmployee extends Employee{
    private double monthSalary;
    public SalariedEmployee(){this.monthSalary = 8888.88;}
    public SalariedEmployee(String name,int birth,double monthSalary){
        super(name,birth);
        this.monthSalary = monthSalary;
    }

    public void setMonthSalary(double monthSalary){this.monthSalary = monthSalary;}
    public double getMonthSalary(){return this.monthSalary;}
    public double getSalary(int month){
        if(month == this.getBirth())
            return this.monthSalary + 100;
        return this.monthSalary;
    }

}


class HourlyEmployee extends Employee{
    private double hourSalary;
    private int workHour;

    public HourlyEmployee(){}
    public HourlyEmployee(String name,int birth,double hourSalary,int workHour){
        super(name,birth);
        this.hourSalary = hourSalary;
        this.workHour = workHour;
    }

    public void setHourSalary(double hourSalary){
        this.hourSalary = hourSalary;
    }
    public double getHourSalary(){return hourSalary;}
    public void setWorkHour(int workHour){
        this.workHour = workHour;
    }
    public int getWorkHour(){return workHour;}

    public double getSalary(int month){
        double salary = 0;
        if(this.workHour <= 160)
            salary = workHour * hourSalary;
        else
            salary = (workHour - 160) * hourSalary * 1.5 + 160 * hourSalary;
        if(month == this.getBirth())
            salary += 100;
        return salary;
    }
}


class SalesEmployee extends Employee{
    private double monthSale;
    private double commissionRate;

    public SalesEmployee(){}
    public SalesEmployee(String name,int birth,double monthSale,double commissionRate){
        super(name,birth);
        this.monthSale = monthSale;
        this.commissionRate = commissionRate;
    }

    public void setMonthSale(double monthSale){this.monthSale = monthSale;}
    public double getMonthSale(){return monthSale;}
    public void setCommissionRate(double commissionRate){this.commissionRate = commissionRate;}
    public double getCommissionRate(){return commissionRate;}

    public double getSalary(int month) {
        double salary = monthSale * (1 + commissionRate);
        if(month == this.getBirth())
            salary += 100;
        return salary;
    }
}

class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    public BasePlusSalesEmployee(){}
    public BasePlusSalesEmployee(String name,int birth,double monthSale,double commissionRate,double baseSalary){
        super(name,birth,monthSale,commissionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){this.baseSalary = baseSalary;}
    public double getBaseSalary(){return baseSalary;}

    public double getSalary(int month){
        double salary = this.baseSalary + this.getMonthSale() * this.getCommissionRate();
        if(month == this.getBirth())
            salary += 100;
        return salary;
    }
}