import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println("Octal number is: " + Integer.toOctalString(n));
    }
}