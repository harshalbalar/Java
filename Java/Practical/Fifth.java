/* 5 Write a program in which there are three variables whose data type is byte, int and double; 
the value of int is 260 and value of double is 323.142. 
Convert the value of int into byte, double into int and double into byte and display all the values after conversion. */

public class Fifth 
{
	public static void main(String[] args)
	{
		byte num1;
		int num2 = 260;
		double num3 = 323.142;

		num1 = (byte)num2;
			System.out.println(num1);
		num2 = (int) (num3 * 1000);
			System.out.println(num2);
		num1 = (byte)num3;
			System.out.println(num1);	
	}
}