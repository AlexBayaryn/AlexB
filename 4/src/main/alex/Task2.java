paket main.alex;

import java.util.*;


public class Task2 {   //  2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.println(num(a));
        System.out.println(a);
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();
        System.out.format("%.3f", function(a, b, c));
    }

    public static double function(double g, double k, double l) {
    return ((k + Math.sqrt(Math.pow(k, 2) + 4 * g * l))) / 2 * g - Math.pow(g, 3) * l + Math.pow(k, -2);
    }

    private static double num(double d) {
        double z = 0;
        z = d + 5;

        return z;

    }
}
