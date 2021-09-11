package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        DecimalFormat DF = new DecimalFormat("##.##");
        Scanner uInput = new Scanner(System.in);
        System.out.println( "Enter the principal" );
        double Principal = uInput.nextDouble();
        System.out.println("Enter the percent rate of interest");
        double ROA = uInput.nextDouble();
        System.out.println("Enter the number of years");
        int Years = uInput.nextInt();
        System.out.println("After " + Years + " years at "+ ROA +"%, the investment will be worth $"+ DF.format(Principal*(1+Years *(ROA/100))));
    }
}
