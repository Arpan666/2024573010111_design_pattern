package praktikum_3.bagian_4.Latihan_2;

public class Main{
    public static void main(String[] args) {
        Matematika mat = new Matematika();
        System.out.println("2 parameter int    : " + mat.tambah(3, 4));
        System.out.println("3 parameter int    : " + mat.tambah(3, 4, 5));
        System.out.println("2 parameter double : " + mat.tambah(2.5, 1.5));
    }
}
