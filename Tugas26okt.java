import java.util.Scanner;
public class Tugas26okt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml, total = 0;
        int nilaiTinggi = Integer.MIN_VALUE;  
        int nilaiRendah = Integer.MAX_VALUE;  
        System.out.print("Masukkan banyaknya nilai: ");
        jml = input.nextInt();
        int[] arrayInt = new int[jml];
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            arrayInt[i] = input.nextInt();
            if (arrayInt[i] > nilaiTinggi) {
                nilaiTinggi = arrayInt[i];
            }
            if (arrayInt[i] < nilaiRendah) {
                nilaiRendah = arrayInt[i];
            }
            total += arrayInt[i];
        }
        double rata2 = (double) total / jml;
        System.out.println("Nilai tertinggi adalah " + nilaiTinggi);
        System.out.println("Nilai terendah adalah " + nilaiRendah);
        System.out.println("Nilai rata-rata adalah " + rata2);
    }
}
