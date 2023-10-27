public class Override{
	public static void main(String[] args){
		
	}
}

class A{
	public int sum(){
		System.out.println("int sum");
		return 0;
	}
}

class B extends A{
	public double sum(){
		System.out.println("double sum");
		return 0.0;
	}
}