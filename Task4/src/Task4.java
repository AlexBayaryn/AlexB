import java.util.Scanner;
//
public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        double T = scanner.nextDouble();
        System.out.println(r(T));
        }
        public static double r(double T) {
        return (T * 1000) % 1000 +  (int)T / 1000.0;
    }

    }
