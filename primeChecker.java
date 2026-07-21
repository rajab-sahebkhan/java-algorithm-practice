public class primechecker {
    public static void main(String[] args) {
        int n = 11;

        if (n <= 1) {
            System.out.println(n + " is not prime.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }
}
