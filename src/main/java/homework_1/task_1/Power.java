package homework_1.task_1;

class Power {

    public double power(double a, int exponent) {
        double c = 1;
        for (int i = 0; i < exponent; i++) {
            c *= a;
        }
        return c;
    }
}