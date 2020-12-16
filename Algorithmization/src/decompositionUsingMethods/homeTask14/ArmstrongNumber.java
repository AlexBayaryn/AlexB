package decompositionUsingMethods.homeTask14;

//  14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
//  равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
public class ArmstrongNumber {
    public static void main(String[] args) {
        SearchNumberAmstrong searchNumberAmstrong = new SearchNumberAmstrong(10_000_000);
        searchNumberAmstrong.methodAmstrong();
    }
}
