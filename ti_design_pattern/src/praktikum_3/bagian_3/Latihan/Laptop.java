package praktikum_3.bagian_3.Latihan;

public class Laptop {
    String merk;
    Processor processor;
    Ram ram;

    void nyalakan() {
        System.out.println("=== Laptop " + merk + " dinyalakan ===");
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }

    public static void main(String[] args) {
        Processor proc = new Processor();
        proc.tipe = "Intel Core i7";

        Ram ram = new Ram();
        ram.kapasitas = 16;

        Laptop laptop = new Laptop();
        laptop.merk = "ASUS";
        laptop.processor = proc;
        laptop.ram = ram;

        laptop.nyalakan();
    }
}