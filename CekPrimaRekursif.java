import java.util.Scanner;

public class CekPrimaRekursif {

    public static boolean isPrimeRecursive(int n, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrimeRecursive(n, divisor - 1);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        return isPrimeRecursive(n, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan yang ingin dicek: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
