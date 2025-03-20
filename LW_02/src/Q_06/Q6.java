package Q_06;

import java.time.LocalDate;
import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int current_year = LocalDate.now().getYear();
        System.out.println("Enter your birth year :");
        int birth_year = input.nextInt();

        int age = current_year - birth_year;
        System.out.println("You were born in "+birth_year+ " and will be " +age+ " this year.");

    }
}
