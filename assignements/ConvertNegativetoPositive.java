package week1.day2.assignements;

public class ConvertNegativetoPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float number = -40.2f;
		
		if(number<0) {
			float Converted = number*-1 ;
			System.out.println(" The converted number is positive :" +Converted);
		}
		else {
			System.out.println("The provided number is positive : "+number);
		}
	}

}
