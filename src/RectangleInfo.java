import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double hypotenuse = 0;

        do{
            System.out.println("Enter the width of the rectangle: ");
            width = in.nextDouble();
            if (width <= 0 )
            {
                System.out.println("Width must be a positive number. Please try again!");
            }
        }while (width <= 0);

        do{
            System.out.println("Enter the height of the rectangle: ");
            height = in.nextDouble();
            if (height <= 0 )
            {
                System.out.println("Height must be a positive number. Please try again!");
            }
        }while (height <= 0);

        area = width * height;
        perimeter = 2 * (width + height);
        hypotenuse = Math.sqrt(width * width + height + height);

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The hypotenuse of the rectangle is: " + hypotenuse);
    }
}