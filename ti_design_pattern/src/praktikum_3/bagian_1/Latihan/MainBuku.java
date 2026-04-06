package praktikum_3.bagian_1.Latihan;

public class MainBuku {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);

        Buku buku2 = new Buku("Clean Code", "Robert C. Martin", 2008);

        buku1.tampilkanInfo();
        System.out.println();
        buku2.tampilkanInfo();
    }
}