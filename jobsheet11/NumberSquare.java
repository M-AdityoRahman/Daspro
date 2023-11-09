import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        Boolean isNilai = false;
        while (!isNilai) {
            System.out.print("Masukkan nilai N (min. 3): ");
            int N = sc.nextInt();
            if (N < 3) {
                System.out.println("Nilai N minimal 3 ya boss!\n");
            } else {
                for (int i = 1; i <= N; i++) {
                    for (int j = 1; j <= N; j++) {
                        if (i == 1 || i == N || j == 1 || j == N) {
                            System.out.print(N + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                isNilai = true;
            }
        }
    }
}
