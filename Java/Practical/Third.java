/* 3 Write a program to perform below task:
1. Calculate sum of given two variables, where subject_mark1= 26 and subject_mark2=40.
2. Consider same variable and display average using conditional operator.
3. Display minimum marks of student. */

public class Third
{
	public static void main(String[] args)
	{
		int subject_mark1 = 26;
		int subject_mark2 = 40;
		int sum,avg;

		sum = subject_mark1 + subject_mark2;

		System.out.println("The sum of two variables is :- " +sum);

		avg = sum / 2;

		System.out.println("The average of two variables is :- " +avg);

		if(subject_mark1 < subject_mark2)
		{
			System.out.print("The subject_mark1 is small :- " +subject_mark1);
		}
		else
		{
			System.out.print("The subject_mark2 is small :- " +subject_mark2);
		}
	}
}