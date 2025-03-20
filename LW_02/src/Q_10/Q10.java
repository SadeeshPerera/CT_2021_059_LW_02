package Q_10;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount in dollars :");
        float loan_amount = input.nextFloat();


        System.out.println("Enter annual interest rate :");
        double annual_interest_rate = input.nextDouble();


        System.out.println("Enter loan period :");
        int loan_period = input.nextInt();

        double monthly_interest_rate = annual_interest_rate/ 100.0 /12;
        int number_of_Payment = loan_period * 12 ;
        double monthly_payment = (loan_amount * monthly_interest_rate) / (1- Math.pow(1/(1+ monthly_interest_rate),number_of_Payment));
        double total_payment = monthly_payment * number_of_Payment;

        System.out.println("------ Loan Summary ------");
        System.out.println("Monthly Interest Rate :" +monthly_interest_rate);
        System.out.println("Number Of Payment :" +number_of_Payment);
        System.out.println("Monthly Payment :" +monthly_payment);
        System.out.println("Total Payment :" +total_payment);

    }
}
