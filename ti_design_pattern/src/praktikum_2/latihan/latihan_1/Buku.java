package praktikum_2.bagian_1.latihan_1;

public class Buku {
    String judul;
    String pengarang;

    void tampilkanInfo() {
        System.out.println("Informasi Buku");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Clean Code";
        buku1.pengarang = "Robert C. Martin";

        buku1.tampilkanInfo();
    }
}