package decompositionUsingMethods.homeTask16;


//     16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//     Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
public class SumNumber {
    public static void main(String[] args) {
        SearchOddNumber searchOddNumber = new SearchOddNumber(15);
        System.out.println(searchOddNumber);
        System.out.println("Сумма чисел = " + searchOddNumber.sumOddNumber() + "\n"
                + "Количество четных цифр = " + searchOddNumber.quantityEvenElements());

    }
}

