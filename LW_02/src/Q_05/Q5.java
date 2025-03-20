package Q_05;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in degrees Fahrenheit :");
        double fahrenheit = input.nextDouble();

        double celsius = ( 5.0  / 9.0 ) * (fahrenheit - 32 );
        System.out.println("Temperature in degrees Celsius : " + celsius);


    }
}
