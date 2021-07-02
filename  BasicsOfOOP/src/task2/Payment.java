package task2;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Payment {
    private String name;
    private List<Product> productList;
    private double totalAmount;

    private class Product {
        private String productName;
        private double productCost;


        public Product(String productName, double productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public double getProductCost() {
            return this.productCost;
        }
    }

    public Payment() {
    }

    public Payment(String name) {
        this.name = name;
    }

    public void setPayment(Scanner scanner, PrintStream out) {
        int countProduct = 0;
        try {
            productList = new ArrayList<>();
            while (true) {
                out.print("Добавить товар <y> <n> ? ");
                if (scanner.next().equals("y")) {
                    out.println("Товар " + (++countProduct) + ": ");
                    out.print("Наименование: ");
                    String productName = scanner.next();
                    System.out.print("Цена: ");
                    double productCost = scanner.nextDouble();
                    productList.add(new Product(productName, productCost));
                    totalAmount += productCost;
                } else {
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Исключение несоответствия ввода");
            e.printStackTrace();
        }
    }

    public void printCheque() {
        System.out.println("***********************************" + "\n" +
                name + "\n" + "***********************************");
        for (Product product : productList) {
            System.out.print("№" + new DecimalFormat("0000000000").format(product.hashCode()));
            System.out.printf("%15s", product.productName);
            System.out.printf("%7s%n", new DecimalFormat("0.##").format(product.productCost));
        }
        System.out.println("===================================" + "\n" +
                "Сумма: " + totalAmount);
    }
}
