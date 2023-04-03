package week2.day1Assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] array=test.split(" ");
		char ch[];
	
		
		for(int i=0;i<array.length;i++)
		{
			if(i%2 ==1)
			{
				ch=array[i].toCharArray();
				for (int j=ch.length-1;j>=0;j--)
				{
					System.out.print(ch[j]);
				}
			}
			else
			{
				System.out.print(array[i]);
			}
			System.out.print(" ");
		}

	}

}
