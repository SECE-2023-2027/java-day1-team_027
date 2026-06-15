import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String b = s.next();

        System.out.println("Decimal Number: " + Integer.parseInt(b, 2));
    }
}