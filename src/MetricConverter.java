import java.util.Scanner;
public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;

        do
        {
            System.out.println("Enter measurement in meters: ");
            while (!in.hasNextDouble())
            {
                System.out.println("Invalid input. Please enter a numeric value in meters.");
                in.next();
            }
            meters = in.nextDouble();
            if (meters <= 0)
            {
                System.out.println("Measurement must be a positive value. Try again.");
            }

        }while (meters <= 0 );
        miles = meters * 0.00062;
        feet = meters * 3.28;
        inches = meters * 39.37;
        System.out.println(meters + " meters is equal to " + miles + " miles.");
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        System.out.println(meters + " meters is equal to " + inches + " inches.");

    }
}