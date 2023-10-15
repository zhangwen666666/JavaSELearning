public class Homework{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入你的成绩：");
		double score = s.nextDouble();
		if(score < 0 || score > 100)
			System.out.println("你输入的成绩有误");
		else{
			String rank = "不及格";
			if(score >= 90)
				rank = "优秀";
			else if(score >= 80)
				rank = "良好";
			else if(score >= 70)
				rank = "中";
			else if(score >= 60)
				rank = "及格";
			System.out.println(rank);
		}
	}
}