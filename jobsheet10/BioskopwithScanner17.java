import java.util.Scanner;
public class BioskopwithScanner17{
    public static void main(String[] args) {
        Scanner input17 = new Scanner (System.in);
        int baris=0, kolom=0;
        String nama, next;
        String [][] penonton = new String [4][2];
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            
            int Pilihan = input17.nextInt();
            input17.nextLine();

            switch (Pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = input17.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input17.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input17.nextInt();
                    input17.nextLine();
                    penonton[baris - 1][kolom - 1] = nama;

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                        } else {
            
                            System.out.print("Kursi yang dipilih tidak terrsedia,Silakan masukkan baris dan kolom kembali.");
                        }
                    } else {
                        System.out.println("Nomor baris atau kolom kursi tidak valid. Silakan coba lagi.");
                    
                    }


                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Program  Telah selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai");
                }

        System.out.print("Lanjutkan (y/n) : ");
        next = input17.nextLine();

        if (next.equalsIgnoreCase("n")) {
                break;
            }
        } 
    }
}