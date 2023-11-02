import java.util.Scanner;
public class BioskopwithScanner17{
    public static void main(String[] args) {
        Scanner input17 = new Scanner (System.in);
        int baris, kolom;
        String nama, next;
        String [][] penonton = new String [4][2];
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = input17.nextLine();
            System.out.print("Masukkan baris: ");
            baris = input17.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input17.nextInt();
            input17.nextLine();

            penonton[baris-1][kolom-1] = nama ;

            System.out.println("Input penonton lainnya? (y/n): ");
            next = input17.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        } 
    }
}