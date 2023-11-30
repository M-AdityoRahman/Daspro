import java.util.Scanner;
public class FibonacciMarmut {
    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1; 
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan: ");
        int bulan = sc.nextInt();
        int jumlahPasangan = hitungPasanganMarmut(bulan);
        int jumlahProduktif = hitungPasanganMarmut(bulan - 2); 
        int jumlahBelumProduktif = jumlahPasangan - jumlahProduktif;
        System.out.println("Jumlah pasangan marmut yang produktif pada bulan ke-" + bulan + " adalah: " + jumlahProduktif);
        System.out.println("Jumlah pasangan marmut yang belum produktif pada bulan ke-" + bulan + " adalah: " + jumlahBelumProduktif);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahPasangan);
        sc.close();
    }
}
