import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество секунд: ");
        int sec = scanner.nextInt();
        int h, m, s;
        if(sec > 0){
             h = (sec / 3600);
             m = (sec - (h * 3600)) / 60;
             s = (sec - (h * 3600)) - (m * 60);
            System.out.println("Исходная длительность в секундах: " + sec);
            System.out.println(h + " ч " + m + " мин " + s + " c.");
        }
        else {
            System.out.println("Отрицательное значение не допустимо!!!");
        }
        }
    }

