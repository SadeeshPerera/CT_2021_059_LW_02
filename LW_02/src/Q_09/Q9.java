package Q_09;

import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount in dollars :");
        float P  = input.nextFloat();

        System.out.println("Enter annual interest rate in percent :");
        double R = input.nextDouble();

        System.out.println("Enter number of years :");
        int N = input.nextInt();

        double Amount = P * Math.pow( 1 + (R / 100) , N);
        System.out.println("Amount of money earned after " + N + " years :" + Amount );


    }
}
