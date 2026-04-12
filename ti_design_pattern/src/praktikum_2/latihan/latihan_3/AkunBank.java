package praktikum_2.bagian_3.latihan;

public class AkunBank {
    private double saldo;

    public void tampilkanSaldo() {
        System.out.println("Saldo Anda: Rp " + saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        AkunBank akun = new AkunBank();
        akun.setSaldo(1500000);

        // Akses melalui method public — BERHASIL
        akun.tampilkanSaldo();

        // Akses langsung ke atribut private — ERROR saat compile:
        // System.out.println(akun.saldo); // 'saldo' has private access in 'AkunBank'
    }
}