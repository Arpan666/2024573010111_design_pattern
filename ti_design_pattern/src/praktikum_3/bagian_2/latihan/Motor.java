package praktikum_3.bagian_2.latihan;

class Motor {
    // Atribut yang dienkapsulasi (private)
    private String merk;
    private int tahun;

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk tahun
    public int getTahun() {
        return tahun;
    }

    // Setter untuk tahun
    public void setTahun(int tahun) {
        // Contoh validasi: tahun tidak boleh negatif atau terlalu tua
        if (tahun > 1885) {
            this.tahun = tahun;
        } else {
            System.out.println("Tahun tidak valid!");
        }
    }
}