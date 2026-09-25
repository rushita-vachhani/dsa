public class pow_x_n {
    public static double myPow(double x, int n) {
        long exp = n;

        if (exp < 0) {
            x = 1.0 / x;
            exp = -exp;
        }

        double result = 1.0;
        while (exp > 0) {
            if ((exp & 1L) == 1L) {
                result *= x;
            }
            x *= x;
            exp >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));
        System.out.println(myPow(2.1, 3));
        System.out.println(myPow(2.0, -2));
    }
}
