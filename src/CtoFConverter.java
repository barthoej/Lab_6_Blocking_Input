import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celcius = 0;
        double fahrenheit = 0;

        while(true)
        {
            System.out.println("Enter temperature in Celcius: ");
            if (in.hasNextDouble()) {
                celcius = in.nextDouble();
                break;}

                else{
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
                }
        }

                    fahrenheit = (celcius * 9 / 5) + 32;
                    System.out.println("The equivalent temperature in Fahrenheit is " + fahrenheit);

                    if (celcius == 0)
                    {
                        System.out.println("At 0 degrees celcius, water freezes.");
                    }else if (celcius == 100)
                    {
                        System.out.println("At 100 degrees celcius, water boils.");
                    }
                }
            }
