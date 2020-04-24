package homework_1.task_1;

class Power {

    public double power(double a, int exponent) {
        double c = 1;
        int i;
        for (i = 0; i < exponent; i++) {
            c *= a;
        }
        return c;
    }
}