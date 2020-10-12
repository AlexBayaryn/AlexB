import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        int x = scanner.nextInt();
        System.out.print("Введите значение y: ");
        int y = scanner.nextInt();
        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y > -3 && y < 0 && x >= -4 && x <= 4)) {
            System.out.println("True");
            System.out.println("Точка (" + x + ", " + y + ") принадлежит закрашенной области");
        } else {
            System.out.println("False");
        }
    }
}