/* 4 Write a program to display character of given ASCII number.
E.g. intasciiNumber=65, Output would be A. */

import java.util.*;

public class Fourth
{
	public static void main(String[] args)
	{
		int ascii_num;
		char ch;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an ascii number from 0 to 127 :- ");
		ascii_num = sc.nextInt();

		ch = (char) ascii_num;

		System.out.print("The character of that given number is :- " +ch);
	}
}
