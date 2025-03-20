package Q_01;

public class Q1
{
    public static void main(String[] args)
    {
        double A = 1.0;
        double B = 2.0;
        double C = 3.0;
        double X = 4.0;
        double Y = 5.0;
        double R = 3.14;

        double resultA = Math.sqrt(Math.pow(B,2) + 4 *  A * C );
        System.out.println("The square root of B² + 4AC : " + resultA);

        double resultB = Math.sqrt(X + 4 * Math.pow(Y,3));
        System.out.println("The square root of X + 4Y³ : " + resultB);

        double resultC = Math.cbrt(X * Y);
        System.out.println("The cube root of the product of X and Y : " + resultC);

        double resultR = Math.PI * Math.pow(R ,2);
        System.out.println("The area of a circle : "  + resultR);
    }

}
