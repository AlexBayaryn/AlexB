import java.util.Scanner;

public class Task16 { //Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        char ch = (char) scanner.nextByte();
        if (ch > 31 && ch < 127) {
            System.out.print(ch);
        } else {
            System.out.print("Error!!!");
        }
    }
}
