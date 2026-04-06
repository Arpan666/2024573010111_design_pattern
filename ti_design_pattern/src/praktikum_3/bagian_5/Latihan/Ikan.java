package praktikum_3.bagian_5.Latihan;

public class Ikan extends HewanAir implements Berenang {
    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang di air.");
    }

    @Override
    void makan() {
        System.out.println(nama + " sedang makan plankton.");
    }

    public static void main(String[] args) {
        Ikan ikan = new Ikan();
        ikan.nama = "Nemo";
        ikan.berenang();
        ikan.makan();
    }
}