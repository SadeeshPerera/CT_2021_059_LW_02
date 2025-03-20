package Q_04;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        double calories = weight * 19 ;
        System.out.println("Your weight of " + weight + " pounds. ");
        System.out.println("You need " + calories + " calories per day. " );

    }
}
