/* 2 Write a program to read the price of item in decimal form (like 75.95) from command line argument 
and print the output in paisa (like 7595 paisa). */

import java.util.*;

public class Second
{
	public static void main(String[] args)
	{
		/* double price = 75.75; 

		System.out.println("Price before converting :- " +price);

		int i = (int)price;

		System.out.println("(float)price = " +i); */

		float price;

		Scanner s = new Scanner(System.in); 

		System.out.print("Enter a float number for price :- ");
		price = s.nextFloat();

		//System.out.println("float value :- " +price);

		int i = (int)price;

		System.out.println("The price convert float into int is := " +i);
	}	
}