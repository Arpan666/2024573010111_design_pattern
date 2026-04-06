package praktikum_3.bagian_1.Latihan;

class Buku {
    String judul;
    String penulis;
    int tahunTerbit;

    Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilkanInfo() {
        System.out.println("Detail Buku:");
        System.out.println("Judul        : " + this.judul);
        System.out.println("Penulis      : " + this.penulis);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
    }
}