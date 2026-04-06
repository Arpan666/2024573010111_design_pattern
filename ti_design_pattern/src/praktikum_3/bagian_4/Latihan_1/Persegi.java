package praktikum_3.bagian_4.Latihan_1;

public class Persegi extends BangunDatar {
    double sisi;

    @Override
    void hitungLuas() {
        System.out.println("Luas Persegi : " + (sisi * sisi));
    }
}
