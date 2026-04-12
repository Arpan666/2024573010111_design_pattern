package praktikum_2.bagian_5.latihan;

public class Barang {
    private String namaBarang;
    private double harga;

    // Default Constructor
    public Barang() {
        namaBarang = "Barang Tidak Diketahui";
        harga = 0.0;
    }

    // Parameterized Constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("---");
    }

    public static void main(String[] args) {
        // Menggunakan Default Constructor
        Barang barang1 = new Barang();
        System.out.println("=== Default Constructor ===");
        barang1.tampilkanInfo();

        // Menggunakan Parameterized Constructor
        Barang barang2 = new Barang("Laptop ASUS", 8500000);
        System.out.println("=== Parameterized Constructor ===");
        barang2.tampilkanInfo();

        Barang barang3 = new Barang("Mouse Logitech", 250000);
        barang3.tampilkanInfo();
    }
}