package praktikum_3.bagian_2.latihan;

public class MainMotor {
    public static void main(String[] args) {
        // Membuat objek Motor
        Motor motorSaya = new Motor();

        // Mengatur nilai menggunakan Setter
        motorSaya.setMerk("Honda PCX");
        motorSaya.setTahun(2023);

        // Mengambil dan menampilkan nilai menggunakan Getter
        System.out.println("--- Informasi Kendaraan ---");
        System.out.println("Merk Motor  : " + motorSaya.getMerk());
        System.out.println("Tahun Terbit: " + motorSaya.getTahun());
    }
}