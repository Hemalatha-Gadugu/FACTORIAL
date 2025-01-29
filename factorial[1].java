
public class factorial {
    public static void main(String[] args) {
        int number = 5;
        long result = Factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long Factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

      