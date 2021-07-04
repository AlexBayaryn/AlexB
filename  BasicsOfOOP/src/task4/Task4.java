package task4;

import java.util.Scanner;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать файлы.
 * <p>
 * Дракон и его сокровища. Создать программу, позволяющую
 * обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ,
 * выбора самого дорогого по стоимости сокровища и
 * выбора сокровищ на заданную сумму.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaveDragon caveDragon = new CaveDragon();


        int number;
        do {
            System.out.println("1-просмотр сокровищ.\n" +
                    "2-самоге дорогое по стоимости сокровище.\n" +
                    "3-сокровище на заданную сумму.\n" +
                    "0-выход.");
            number = scanner.nextInt();
            if (number < 0 || number > 3) {
                System.out.println("Неверный ввод!!!");
            }
            switch (number) {
                case (1):
                    caveDragon.showTreasure();
                    break;
                case (2):
                    caveDragon.dearestTreasure();
                    break;
                case (3):
                    System.out.print("Введите сумму: ");
                    caveDragon.buyTreasures(scanner.nextInt());
                    break;
            }
        } while (number != 0);
    }
}
