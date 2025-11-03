import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[] arr = prime(n);
        
        System.out.print("Prime Numbers: ");
        // print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                System.out.print(i+ "  ");
            }
        }
    }

    public static boolean[] prime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n < 2) return isPrime;

        isPrime[0] = false;
        isPrime[1] = false;

    // Sieve of Eratosthenes
        for (int pr = 2; pr * pr <= n; pr++) {
            if (isPrime[pr]) {
                for (int mul = pr * pr; mul <= n; mul += pr) {
                    isPrime[mul] = false;
                }
            }
        }
        return isPrime;
    }
}
