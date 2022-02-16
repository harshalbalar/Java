/* 8 In inventory management, the Economic Order Quantity for a single item is given by 
and the optimal Time Between Orders 
Write a program to compute EOQ and TBO, given demand rate (items per unit time), 
setup costs (per order), and the holding coast (per item per unit time). */

import java.util.Scanner;


import static java.lang.Math.sqrt;

public class eight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float EQQ,TBO,demandrate,setupcost,holdingcost;

        System.out.println("Enter the demand rate");
        demandrate = sc.nextFloat();

        System.out.println("Enter the setup cost");
        setupcost = sc.nextFloat();

        System.out.println("Enter the holding cost per unit time");
        holdingcost = sc.nextFloat();

        EQQ = (float) sqrt((2*demandrate*setupcost)/holdingcost);
        TBO = (float) sqrt((2*setupcost)/demandrate*holdingcost);

        System.out.println("EQQ is: "+ EQQ);
        System.out.println("TBO is: "+ TBO);
    }
}
