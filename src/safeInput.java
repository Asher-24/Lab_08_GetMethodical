import java.util.Scanner;

public class safeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. please enter an integer");
                pipe.nextLine(); // clear the buffer
            }
        } while (!validInput);

        pipe.nextLine(); // clear the newline from the buffer
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0.0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. please enter a double");
                pipe.nextLine(); // clear the buffer
            }
        } while (!validInput);

        pipe.nextLine(); // clear the newline from the buffer
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt;
        do {
            retInt = getInt(pipe, prompt + " [" + low + "-" + high + "]");
        } while (retInt < low || retInt > high);

        return retInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble;
        do {
            retDouble = getDouble(pipe, prompt + " [" + low + "-" + high + "]");
        } while (retDouble < low || retDouble > high);

        return retDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        boolean validInput;

        do {
            System.out.print("\n" + prompt + "[Y/N]: ");
            input = pipe.next().toLowerCase();
            validInput = input.equals("y") || input.equals("n");

            if (!validInput) {
                System.out.println("Invalid input. please enter a Y or N");
            }
        } while (!validInput);

        return input.equals("y");
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString;
        do {
            retString = getNonZeroLenString(pipe, prompt);
        } while (!retString.matches(regEx));

        return retString;
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgWidth = msg.length();
        int starWidth = (totalWidth - msgWidth - 6) / 2; // 6 is for three stars on each side

        // top row of stars
        for (int i = 0; i < starWidth; i++) {
            System.out.print("*");
        }

        // second row with centered message
        System.out.println();
        for (int i = 0; i < msgWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // bottom row of stars
        for (int i = 0; i < msgWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
