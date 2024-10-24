import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = safeInput.getRegExString(in, "Enter your ssn (###-##-####)", "^\\d{3}-\\d(2)-\\d{4}$");
        System.out.println("Valid SSN: " + ssn);

        String mNumber = safeInput.getRegExString(in, "Enter your UC M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("Valid UC Student M number: " + mNumber);

        String menuChoice = safeInput.getRegExString(in, "Enter a menu choice (O, S,  V, Q)", "^[OoSsVvQq]$");
        System.out.println("Valid menu choice: " + menuChoice);
    }
}
