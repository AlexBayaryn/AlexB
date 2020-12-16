package decompositionUsingMethods.homeTask15;

//  15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
//  (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class NaturalNumber {
    public static void main(String[] args) {
        SequenceOfNumericElements sequenceOfNumericElements = new SequenceOfNumericElements(10, 20000);
        sequenceOfNumericElements.computationOfConsecutiveElements();
    }
}
