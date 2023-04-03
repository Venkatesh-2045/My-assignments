package week2.day1Assignments;

import java.util.Arrays;

public class MissingelementinAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.println("The missing number is");
		
		for(int i=arr[0];i<arr.length;i++)
		{
			if(arr[i-1]!=i) {
				System.out.println(i);
				break;
			}
		}
	}

}
