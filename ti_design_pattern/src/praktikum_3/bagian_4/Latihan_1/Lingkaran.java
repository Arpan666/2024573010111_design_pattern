package praktikum_3.bagian_4.Latihan_1;

public class Lingkaran extends BangunDatar {
    double jariJari;

    @Override
    void hitungLuas() {
        System.out.println("Luas Lingkaran : " + (Math.PI * jariJari * jariJari));
    }

    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.sisi = 5;
        p.hitungLuas();

        Lingkaran l = new Lingkaran();
        l.jariJari = 7;
        l.hitungLuas();
    }
}