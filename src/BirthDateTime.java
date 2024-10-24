import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = safeInput.getRangedInt(in, "Enter the year of birth (1950-2015): ", 1950, 2015);
        int month = safeInput.getRangedInt(in, "Enter the month of birth (1-12): ", 1, 12);

        // use a switch to determine the number of days in the entered month
        int daysInMonth;
        switch (month) {
            case 2:
                // For february
                daysInMonth = 29; // Leap year is not considered for simplicity
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                // For months with 30 days
                daysInMonth = 30;
                break;
            default:
                // For months with 31 days
                daysInMonth = 31;
        }

        int day = safeInput.getRangedInt(in, "Enter the day of birth (1-" + daysInMonth + "): ", 1, daysInMonth);
        int hours = safeInput.getRangedInt(in, "Enter the hour of birth (1-24): ", 1, 24);
        int minutes = safeInput.getRangedInt(in, "Enter the minute of birth (1-59): ", 1, 59);

        System.out.println("\nBirth Date and Time");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hours);
        System.out.println("Minutes: " + minutes);
    }
}
