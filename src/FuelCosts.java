import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gasInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        double costPer100 = 0;
        double distanceWithGas = 0;

        do{
            System.out.println("Enter the number of gallons of gas in your tank: ");
            gasInTank = in.nextDouble();
        }while (gasInTank <= 0);

        do {
            System.out.println("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = in.nextDouble();
        }while (fuelEfficiency <= 0);

        do{
            System.out.println("Enter the price of gas per gallon: ");
            pricePerGallon = in.nextDouble();
        }while (pricePerGallon <= 0);

        costPer100 = (pricePerGallon / fuelEfficiency) * 100;
        distanceWithGas = gasInTank * fuelEfficiency;

        System.out.printf("The cost of gas per 100 miles is $%4.2f\n", costPer100);
        System.out.printf("The distance the car can go with the gas in the tank is %4.2f\n", distanceWithGas);
        }
    }