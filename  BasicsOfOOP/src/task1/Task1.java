package task1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        TxtFile txtFile = new TxtFile();
        txtFile.create(scanner, System.out);
        txtFile.deleted();
        System.out.println("Файл был удален!");
        txtFile.create(scanner, System.out);
        System.out.println("Директория и файл созданны");
        while (true) {
            System.out.println("Переименовать файл <y> <n>?");
            if (scanner.next().equals("y")) {
                System.out.print("Введите новое имя файла с расширением: ");
                String newName = scanner.next();
                txtFile.rename(newName);
            } else {
                break;
            }
        }
        txtFile.addText("abra kadabra");
        txtFile.showСontent();
        System.out.println(txtFile);
    }
}
