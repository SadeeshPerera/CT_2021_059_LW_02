package Q_07;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms :");
        double w = input.nextDouble();

        System.out.println("Enter your height in centimeters :");
        double h = input.nextDouble();

        double h1  = h/100;
        double bmi =  w / ( h1 *h1 );

        System.out.println("Your BMI is: "+bmi);
        System.out.println("20 - 25 : Normal ");

    }
}
