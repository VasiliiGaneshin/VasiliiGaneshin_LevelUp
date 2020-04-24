package homework_1.task_1;

public class Factorial {

    public long calculateFactorial(long n) {
        long a = 1;
        for (long i = 1; i <= n; i++) {
            a *= i;
        }
        return a;
    }

    public int calculateFactorial(int m) {
        int b = 1;
        for (long i = 1; i <= m; i++) {
            b *= i;
        }
        return b;
    }
}