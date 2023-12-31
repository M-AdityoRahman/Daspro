public class Porseni {
    public static void main(String[] args) {
        String[][] dataAtlet = {
                { "Yadi", "Badminton" },
                { "Paijo", "Badminton" },
                { "Yanto", "Badminton" },
                { "Suyitno", "Badminton" },
                { "Mariadi", "Badminton" },
                { "Mulyono", "Tenis Meja" },
                { "Yitno", "Tenis Meja" },
                { "Yudi", "Tenis Meja" },
                { "Arynto", "Tenis Meja" },
                { "Jarno", "Tenis Meja" },
                { "Kumal", "Basket" },
                { "Akmal", "Basket" },
                { "Tengik", "Basket" },
                { "Mambu", "Basket" },
                { "Anhar", "Basket" },
                { "Dilan", "Bola Voly" },
                { "Akeo", "Bola Voly" },
                { "Elzan", "Bola Voly" },
                { "Delon", "Bola Voly" },
                { "Alex", "Bola Voly" }
        };
        for (int i = 0; i < dataAtlet.length - 1; i++) {
            for (int j = 0; j < dataAtlet.length - i - 1; j++) {
                if (dataAtlet[j][0].compareTo(dataAtlet[j + 1][0]) > 0) {
                    String[] temp = dataAtlet[j];
                    dataAtlet[j] = dataAtlet[j + 1];
                    dataAtlet[j + 1] = temp;
                }
            }
        }
        System.out.println("\nInformasi Atlet Porseni 2024:");
        for (String[] atlet : dataAtlet) {
            System.out.println("Nama: " + atlet[0] + ", Cabang: " + atlet[1]);
        }
    }
}