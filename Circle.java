import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double r = s.nextDouble();

        System.out.println("Area = " + (3.14159 * r * r));
        System.out.println("Perimeter = " + (2 * 3.14159 * r));
    }
}