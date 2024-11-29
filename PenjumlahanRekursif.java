import java.util.Scanner;

public class PenjumlahanRekursif {

    static int hitungPenjumlahan(int f, int current) {
        if (current == f) {
            System.out.print(current); 
            return current;
        } else {
            System.out.print(current + " + ");
            return current + hitungPenjumlahan(f, current + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        System.out.print("Proses penjumlahan: ");
        int hasil = hitungPenjumlahan(f, 1);
        System.out.println("\nPenjumlahan dari 1 sampai " + f + " adalah: " + hasil);
    }
}
