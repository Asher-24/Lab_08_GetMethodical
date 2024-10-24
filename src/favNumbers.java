import java.util.Scanner;

public class favNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favoriteInt = safeInput.getInt(in, "Enter your favorite integer ");
        double favoriteDouble = safeInput.getDouble(in, "Enter your favorite double ");

        System.out.println("\nYour favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
