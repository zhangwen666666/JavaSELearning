public class Test{
	public static void main(String[] args){
		int i = 10;
		add(i);
		System.out.println("main--------->" + i); // i = 10
	}
	
	public static void add(int i){
		i++;
		System.out.println("add--------->" + i); // i = 11
	}
}