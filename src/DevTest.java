import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = safeInput.getNonZeroLenString(in, "Enter your first name: ");
        lastName = safeInput.getNonZeroLenString(in, "Enter your last name: ");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}



