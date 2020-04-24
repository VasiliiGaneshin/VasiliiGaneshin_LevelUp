package homework_1.task_1;

public class Fibonacci {

    public long fibonacci(int n) {

        if (n >= 2) {
            int a = 1;
            int b = 1;
            int c;
            int result = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                result = c;
            }
            return result;
        }
        else return n;
    }
}