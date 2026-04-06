package praktikum_3.bagian_2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengatur nilai menggunakan Setter
        mhs1.setNama("Mizaul Arfan");
        mhs1.setUmur(20);

        // Mengambil dan menampilkan nilai menggunakan Getter
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Umur: " + mhs1.getUmur());
    }
}