/* 15 Write a program to print the following outputs using for loops:
$	$	$	$	$
$	$	$	$	
$	$	$		
$	$			
$				


1				
0	1			
1	0	1		
0	1	0	1	
1	0	1	0	1


				1
			2	2
		3	3	3
	4	4	4	4
5	5	5	5	5 */

public class sign15
{
	public static void main(String[] args)
	{
		int i,j,row = 5;

		for(i = row - 1; i >= 0; i--)
		{
			for(j = 0; j <= i ; j++)
			{
				System.out.print(" $ ");
			}
			System.out.println();
		}

		System.out.println("\n");

		for(i = 1; i <= row; i++)
		{
			for(j = 1; j <= i; j++)
			{
				if(j % 2 == 0)
				{
					System.out.print(" 0 ");
				}
				else
				{
					System.out.print(" 1 ");
				}
			}
			System.out.println();
		}
	}
}