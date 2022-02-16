/* 9 Write a program to accept amount as command line argument and display total number of notes of 
Rs. 500, 100, 50, 20, 10, 5, 2, 1. Find minimum number of notes required for the given domination. */

import java.util.*;

public class nineth
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        int note500,note100,note50,note20,note10,note5,note2,note1;

        System.out.println("Enter the Amount: ");
        int amount = sc.nextInt();

        note500 = amount/500;
        System.out.println("500 notes: "+ note500);

        note100 = (amount%500)/100;
        System.out.println("100 notes: "+ note100);

        note50 = (((amount%500)%100)/50);
        System.out.println("50 notes: "+ note50);

        note20 = ((((amount%500)%100)%50)/20);
        System.out.println("20 notes: "+ note20);

        note10 = (((((amount%500)%100)%50)%20)/10);
        System.out.println("10 notes: "+ note10);

        note5 = ((((((amount%500)%100)%50)%20)%10)/5);
        System.out.println("5 notes: "+ note5);

        note2 = (((((((amount%500)%100)%50)%20)%10)%5)/2);
        System.out.println("2 notes: "+ note2);

        note1 = ( ( ( ( ( ( ( (amount % 500) % 100) % 50) % 20) % 10) % 5) % 2 ) );
        System.out.println("1 notes: "+ note1);
    }
}