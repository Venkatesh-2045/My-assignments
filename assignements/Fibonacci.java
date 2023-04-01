package week1.day2.assignements;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f ,s ,t ,i ;
		
		f = 0;
		s= 1 ;
		System.out.println( f );
		System.out.println(s);
		
		for (i=3 ; i<=8 ; i++) {
			
			t= f+s;
			System.out.println(t);
			f =s;
			s=t;
			
		}
			
		
		
	}

}

