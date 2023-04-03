package week2.day1Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] ch= test.toCharArray();
		for(int i=1;i<ch.length;i=i+2)
		{
			ch[i]=Character.toUpperCase(ch[i]);
		}
		System.out.print(ch);
	}
}

	
