package arraysOfArrays;

//    2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class MatrixElementsDiagonally {
    public static void main(String[] args) {
        int[][] array = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
