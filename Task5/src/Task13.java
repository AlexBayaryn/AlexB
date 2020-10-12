public class Task13 {
    public static void main(String[] args) {
        double res = 1;
        for (int i = 1; i <= 200; i++){
            res *= Math.pow(i, 2);
            System.out.println(res);
        }

    }
}
