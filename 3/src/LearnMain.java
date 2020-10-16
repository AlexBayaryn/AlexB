import java.util.Scanner;
import java.math.BigInteger;

public class LearnMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = (int) scanner.nextDouble();
        System.out.print("Введите число: ");
        int b = (int) scanner.nextDouble();
        System.out.print("Введите число: ");
        int c = (int) scanner.nextDouble();
        System.out.println(result(  a, b, c));
    }

    public static int result(int q, int w, int e) {
        int ravno = 0;
        ravno = q + w + e;
        return ravno;
    }
}