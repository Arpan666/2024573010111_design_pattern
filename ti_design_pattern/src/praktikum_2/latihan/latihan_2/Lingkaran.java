package praktikum_2.bagian_2.latihan;

public class Lingkaran {
    double jariJari;

    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jariJari = 7;

        System.out.println("Kalkulator Lingkaran");
        System.out.println("Jari-Jari : " + lingkaran.jariJari);
        System.out.println("Luas      : " + lingkaran.hitungLuas());
        System.out.println("Keliling  : " + lingkaran.hitungKeliling());
    }
}