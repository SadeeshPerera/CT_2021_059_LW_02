package Q_03;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Celsius : ");
        double Celsius = input.nextDouble();

        double Fahrenheit = Math.sqrt((1.8 * Celsius ) + 32 );
        System.out.println("Fahrenheit : " + Fahrenheit);

    }
}
