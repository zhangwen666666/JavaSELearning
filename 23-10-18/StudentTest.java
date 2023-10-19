public class StudentTest{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.id = 1000;
		s1.name = "张三";
		s1.age = 18;
		s1.addr = new Address();
		
		s1.addr.city = "大同";
		s1.addr.street = "云冈镇";
		s1.addr.emailId = "037001";

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.addr.city);
		System.out.println(s1.addr.street);
		System.out.println(s1.addr.emailId);
		
	}
}