import java.util.Scanner;

public class BinaryAdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);

        System.out.println(Integer.toBinaryString(x + y));
    }
}