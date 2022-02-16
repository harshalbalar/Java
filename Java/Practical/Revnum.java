/* 14 Given a number, write a program using while loop to reverse the digits of the number. 
For example, the number 12345 should be written as 54321. */

import java.util.*;

public class Revnum
{
	public static void main(String[] args)
	{
		int number;
		int rem = 0 , rev = 0;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :- ");
		number = s.nextInt();

		while(number != 0)
		{
			rem = number % 10;	
			rev = rev * 10 + rem;
			number = number / 10;
		}
		System.out.print("The reverse number is :- " +rev);
	}
}