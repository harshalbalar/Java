/* 6 Write a program to convert given no. of days into months, years and days; 
assume that each month is of 30 days. For Example: if input is 69 than Output is 2 months and 9 days. */

import java.util.*;

public class Sixth
{
	public static void main(String[] args)
	{
		int days;
		int ansday , months , year;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha days :- ");
		days = sc.nextInt();

		months = (days * 1) / 30;
		ansday = days - (months * 30);
		year =  (days * 1) / 365;

		System.out.println("The months of the days is :- " +months);
		System.out.println("The days is :- " +ansday);
		System.out.println("The year of the days is :- " +year);
	}
}