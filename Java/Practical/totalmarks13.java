/* 13 Admission to a professional course is subject to the following conditions:
Marks in mathematics >=60
Marks in physics >=50
Marks in chemistry >=40
Total in all three subjects	>=200
				OR
Total in mathematics and physics >=150
Given the marks in the three subject, write a program to process the applications to list the eligible candidates.*/

import java.util.*;

public class totalmarks13
{
	public static void main(String[] args)
	{
		int p,c,m,sum;
		Scanner t = new Scanner(System.in);

		System.out.print("Enter the marks of physics :- ");
		p = t.nextInt();

		System.out.print("Enter the marks of chemistry :- ");
		c = t.nextInt();

		System.out.print("Enter the marks of mathematics :- ");
		m = t.nextInt();

		sum = p + c + m;

		System.out.println("The sum of this three subject is :- " +sum);

		int pm = p + m;

		System.out.println("--------------------------------------------\n");

		if(p >= 50 && c >= 40 && m >= 60 && (sum >= 200 || pm >= 150))
			System.out.println("The Eligible candidates.");
		else
			System.out.println("Not eligible candidtaes.");
	}
}