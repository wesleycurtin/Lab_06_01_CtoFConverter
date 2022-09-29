import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double c = 0;
        double f = 0;
        String trash = "";

        System.out.print("Enter the temperature in Celsius: ");

        if(in.hasNextDouble()) {
            c = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("\nYou said the temperature was: " + trash + ". That is not a valid temperature!");
        }

        f = (c * 1.8) + 32;
        System.out.println("Your temperature " + c + " to Fahrenheit is " + f);











    }
}