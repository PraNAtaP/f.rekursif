import java.util.Scanner;

public class Fibonacci {
    public static int jumlahPasangan(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }   
        return jumlahPasangan(bulan - 1) + jumlahPasangan(bulan - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bulan ke-n untuk mengetahui jumlah pasangan marmut: ");
        int bulan = scanner.nextInt();

        if (bulan <= 0) {
            System.out.println("Bulan harus lebih besar dari 0!");
        } else {
            int totalPasangan = jumlahPasangan(bulan);
            System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + totalPasangan);
        }
    }
}
