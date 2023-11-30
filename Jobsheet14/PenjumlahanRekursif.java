import java.util.Scanner;
public class PenjumlahanRekursif {
    static int penjmlRekursif(int f) {
        if (f == 1) {
            System.out.print("1");
            return 1;
        } else {
            int hasil = f + penjmlRekursif(f - 1);
            System.out.print("+" + f);
            return hasil;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();
        int hasilPenjumlahan = penjmlRekursif(f);
        System.out.println(" = " + hasilPenjumlahan);
        sc.close();
    }
}