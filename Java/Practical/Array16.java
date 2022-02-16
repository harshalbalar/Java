/* 16 Arrange the elements of an array of number in increasing order of their value 
and then decreasing order of their value. */

import java.util.*;

public class Array16
{
	public static void main(String[] args)
	{
		int n;
		int tmp = 0;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the elements :- ");
		n = s.nextInt();

		int[] array = new int[n];
		System.out.println("Enter the elements of the array :- ");

		for(int i = 0; i < n; i++)
		{
			System.out.print("  ");
			array[i] = s.nextInt();
		}	
		/*System.out.println("array elements are :- ");

		for(int i = 0; i < n; i++)
		{
			System.out.println(array[i]);
		}*/

		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(array[i] > array[j])
				{
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}

		System.out.println("The sorted array is :- ");

		for (int i = 0; i < n; i++ )
		{
			System.out.print(array[i] + " ");
		}
	}
}