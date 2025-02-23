import java.util.Scanner;

public class DeretDescendingRekursif {
    static void cetakRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            cetakRekursif(n - 1);
        }
    }

    static void cetakIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("\nDeret Descending (Rekursif):");
        cetakRekursif(n);

        System.out.println("\nDeret Descending (Iteratif):");
        cetakIteratif(n);
    }
}
