import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println("Hexadecimal number is : " + Integer.toHexString(n).toUpperCase());
    }
}