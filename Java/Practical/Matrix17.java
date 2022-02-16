/* 17 Write a program to find the sum of each row of the n*n matrix and sum of each column of the n*n matrix. 
Note that store the sum of each row in single-dimensional array (sumrow[n]) and 
sum of each column in single-dimensional array (sumcol[n]). */

public class Matrix17
{
	public static void main(String[] args)
	{
		int rows,cols,sumrow,sumcol;

		int a[][] = { {1,2,3},
					  {4,5,6},
					  {7,8,9} };

		rows = a.length;
		cols = a[0].length;

		System.out.println("The sum of rows -- ");

		for(int i = 0; i < rows; i++)
		{
			sumrow = 0;

			for(int j = 0; j < cols; j++)
			{
				sumrow = sumrow + a[i][j];	
			}
			System.out.println("The sum of " + (i + 1) + "row : " + sumrow);
		}

		System.out.println("The sum of columns -- ");

		for(int i = 0; i < cols; i++)
		{
			sumcol = 0;

			for(int j = 0; j < rows; j++)
			{
				sumcol = sumcol + a[i][j];	
			}
			System.out.println("The sum of " + (i + 1) + "column : " + sumcol);
		}
	}
}