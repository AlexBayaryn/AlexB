import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввудите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        System.out.print("Введите с: ");
        int c = scanner.nextInt();
        System.out.print("Введите d: ");
        int d = scanner.nextInt();
        if (a > b) {
            System.out.printf("Between %d and %d, maximum is %d %n", a, b, a);
        } else {
            System.out.printf("Between %d and %d, maximum number is %d %n", a, b, b);
        }
        int max = Math.max(a, b);
        System.out.printf("Maximum value of %d and %d using Math.max() is %d %n", a, b, max);
        if (c < d) {
            System.out.printf("Between %d and %d, Minimum Number is %d %n", c, d, c);
        } else {
            System.out.printf("Between %d and %d, Minimum is %d %n", c, d, d);
        }
        28

        29
        int min = Math.min(x, y);
        30

        31
        System.out.printf("Maximum value of %d and %d using Math.min() is %d %n", x, y, min)
        32
    }

}
}
