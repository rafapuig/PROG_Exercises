package math;

public class NextPrimeNumber {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) { // Más optimizado en cuanto a velocidad pero cuidado con el desbordamiento
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int nextPrimeNumber(int n) {
        int next = n + 1;
        if (next % 2 == 0) next++; // Si next es par hacerlo que sea el impar siguiente
        while (!isPrime(next)) {
            next = next + 2;
        }
        return next;
    }

    public static void main(String[] args) {
        int number = 1;
        System.out.println("Numero: " + number);
        for (int i = 0; i < 100_000; i++) {
            int nextPrime = nextPrimeNumber(number);
            System.out.println("Siguiente Primo: " + nextPrime);
            number = nextPrime;
        }
    }
}
