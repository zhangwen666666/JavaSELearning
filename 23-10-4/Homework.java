public class Homework{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������ĳɼ���");
		double score = s.nextDouble();
		if(score < 0 || score > 100)
			System.out.println("������ĳɼ�����");
		else{
			String rank = "������";
			if(score >= 90)
				rank = "����";
			else if(score >= 80)
				rank = "����";
			else if(score >= 70)
				rank = "��";
			else if(score >= 60)
				rank = "����";
			System.out.println(rank);
		}
	}
}