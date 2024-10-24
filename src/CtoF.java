import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Celsius = 0;
        double Fahrenheit = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter a temperature in Celsius");
            if (scanner.hasNextDouble()) {
                Celsius = scanner.nextDouble();
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.println(trash + " is not a valid temperature");
                System.out.println("\nPlease enter a valid temperature");
            }
        } while (!done);

        Fahrenheit = (Celsius * 1.8 + 32);
        System.out.println("The temperature in Fahrenheit is " + Fahrenheit);
    }
}
