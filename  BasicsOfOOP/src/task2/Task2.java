package task2;

import java.util.Scanner;

/**
 * Создать класс Payment с внутренним классом,
 * с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payment payment = new Payment("Список покупок");
        payment.setPayment(scanner, System.out);
        payment.printCheque();
    }
}
