import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите m: ");
        int m = scanner.nextInt();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        for (int x = m; x <= n / 2; x++) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    System.out.println(x + " " + i);
                   // System.out.print(i +" ");
                }


            }
        }
    }
}
