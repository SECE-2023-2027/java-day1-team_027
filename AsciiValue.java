import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char c = s.next().charAt(0);

        System.out.println("The ASCII value of " + c + " is :" + (int) c);
    }
}