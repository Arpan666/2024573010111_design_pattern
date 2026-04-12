package praktikum_2.bagian_4.latihan;

public class MahasiswaSG {
    private String nama;
    private String nim;

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }

    public static void main(String[] args) {
        MahasiswaSG mhs = new MahasiswaSG();

        mhs.setNama("Mizaul Arfan");
        mhs.setNim("2024573010111");

        mhs.tampilkanInfo();

        System.out.println("\nNama via getter: " + mhs.getNama());
        System.out.println("NIM via getter : " + mhs.getNim());
    }
}