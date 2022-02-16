/* 11 Write a menu driven program to perform following task on 1D array:
1.	Total number of even integers
2.	Total number of odd integers
3.	Sum of all even integers
4.	Sum of all odd integers */import java.util.*;
//import java.lang.*;

public class Menudriven11
{
    public static void main(String[] args)
    {
        int ch=1;

        int num;
        int count=1;
        int oddsum=0 , evensum=0;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        num = s.nextInt();

        System.out.print("--------------------------------\n");

        System.out.println("1. For total number of even number ");
        System.out.println("2. For total number of odd number ");
        System.out.println("3. For sum of even number ");
        System.out.println("4. For sum of odd number ");
        System.out.println("0. For exit ");

        System.out.print("--------------------------------\n");

        while(ch!=0)
        {
            System.out.println("make your choice :- ");
            ch = s.nextInt();

                switch(ch)
                {
                    case 1:
                        while(count <= num)
                        {
                            if(count % 2 == 0)
                            {
                                System.out.println("The total number of even number is :- " +count);
                            }
                            //System.out.println(count);
                            count++;
                        }
                        break;

                    case 2:
                        count = 1;

                        while(count <= num)
                        {
                            if(count % 2 != 0)
                            {
                                System.out.println("The total number of odd number is :- " +count);
                            }
                            count++;
                        }
                        break;

                    case 3:
                        count = 1;
                         
                        while(count <= num)
                        {
                            if(count % 2 == 0)
                            {
                                evensum = evensum + count;
                            }
                            count++;
                        }
                        System.out.println("The sum of even number is :- " +evensum);
                        break;

                    case 4:
                        count = 1;

                        while(count <= num)
                        {
                            if(count % 2 != 0)
                            {
                                oddsum = oddsum + count;
                            }
                            count++;
                        }
                        System.out.println("The sum of even number is :- " +oddsum);
                        break;

                    default:
                        System.out.println("This is the end of code !");
                }
        }
    }
}
