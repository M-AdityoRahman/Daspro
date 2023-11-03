import java.util.Scanner;

public class Praktikum10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBooks = 3;
        String[][] bookInfo = new String[numBooks][5];

        bookInfo[0] = new String[] { "0-546-8976", "Harry Potter volume 1", "J.K Rowling", "Gramedia", "300" };
        bookInfo[1] = new String[] { "0-547-8999", "Harry Potter volume 2", "J.K Rowling", "Gramedia", "320" };
        bookInfo[2] = new String[] { "0-548-9050", "Harry Potter volume 3", "J.K Rowling", "Gramedia", "340" };

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Book: " + (i + 1));
            System.out.println("ISBN: " + bookInfo[i][0]);
            System.out.println("Title: " + bookInfo[i][1]);
            System.out.println("Author: " + bookInfo[i][2]);
            System.out.println("Publisher: " + bookInfo[i][3]);
            System.out.println("Pages: " + bookInfo[i][4]);
            System.out.println();
        }
    }
}
