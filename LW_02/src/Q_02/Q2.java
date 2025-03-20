package Q_02;

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double CM_Per_Inch = 2.54;
        int  Inch_Per_CM = 12;

        System.out.println("Enter length in CM :");
        double CM = input.nextDouble();

        double totalInch = CM / Inch_Per_CM;
        double totalfeet = totalInch / 12 ;

        System.out.println("Feets : " + totalfeet + " inches : " + totalInch);


        }

}
