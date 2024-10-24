import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String msg = safeInput.getNonZeroLenString(in, "Enter the message to be centered in the header");
        safeInput.prettyHeader(msg);
    }
}
