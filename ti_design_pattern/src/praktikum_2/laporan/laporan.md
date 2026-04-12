# Laporan Lab 02: Review Konsep Dasar OOP Menggunakan Java

**Mata Kuliah:** Praktikum Design Pattern  
**Nama:** Mizaul Arfan  
**NIM:** 2024573010111  
**Kelas:** TI 2A  
**Prodi:** Teknik Informatika — Jurusan TIK, Politeknik Negeri Lhokseumawe

---

## Abstrak

Laporan ini membahas review konsep dasar Pemrograman Berorientasi Objek (OOP) menggunakan Java, yang mencakup Class dan Object, Attribute dan Method, Akses Modifier, Setter dan Getter, serta Constructor (default, parameterized, dan constructor overloading). Selain itu, laporan ini mendokumentasikan penyelesaian seluruh latihan yang diberikan pada modul, serta sebuah aplikasi console Sistem Manajemen Perpustakaan Sederhana yang mengintegrasikan semua konsep tersebut. Tujuan laporan ini adalah membuktikan pemahaman terhadap konsep dasar OOP sebagai fondasi untuk mempelajari materi yang lebih kompleks seperti Design Pattern.

---

## 1. Class dan Object

### Dasar Teori

Dua konsep paling mendasar dalam OOP adalah Class dan Object:

- **Class** adalah blueprint atau cetakan untuk membuat objek. Class mendefinisikan atribut (variabel) dan method (fungsi) yang dimiliki oleh objek.
- **Object** adalah instance dari class. Object memiliki state (nilai dari atribut) dan behavior (method).

### Langkah Praktikum

1. Membuka project pada praktikum sebelumnya menggunakan IntelliJ IDEA.
2. Membuat package baru bernama `praktikum_2` di dalam folder `src`.
3. Membuat package baru bernama `bagian_1` di dalam package `praktikum_2`.
4. Membuat class `Mahasiswa` di dalam package `bagian_1`.
5. Membuat class `Main` untuk menjalankan program.
6. Menjalankan program untuk melihat hasilnya.

### Kode Program

**Mahasiswa.java**
```java
package praktikum_2.bagian_1;

public class Mahasiswa {
    String nama;
    int umur;
}
```

**Main.java**
```java
package praktikum_2.bagian_1;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengisi nilai atribut
        mhs1.nama = "Budi";
        mhs1.umur = 20;

        // Menampilkan nilai atribut
        System.out.println("Nama: " + mhs1.nama);
        System.out.println("Umur: " + mhs1.umur);
    }
}
```

### Output Program
![image](https://hackmd.io/_uploads/Hy3JKoU2-g.png)


### Latihan — Class Buku

Membuat class `Buku` dengan atribut `judul` dan `pengarang`, kemudian membuat object dari class tersebut, mengisi nilai atributnya, dan menampilkannya.

**Kode Program** (`praktikum_2/latihan/latihan_1/Buku.java`):

```java
package praktikum_2.latihan.latihan_1;

public class Buku {
    String judul;
    String pengarang;

    void tampilkanInfo() {
        System.out.println("=== Informasi Buku ===");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Clean Code";
        buku1.pengarang = "Robert C. Martin";

        buku1.tampilkanInfo();
    }
}
```

**Output:**
![image](https://hackmd.io/_uploads/SJESFoL3We.png)


### Analisa dan Pembahasan

Class berfungsi sebagai cetakan yang mendefinisikan struktur data dan perilaku suatu entitas. Object adalah wujud nyata dari class tersebut yang memiliki nilai atribut spesifik. Pada contoh di atas, `Mahasiswa` adalah class dan `mhs1` adalah object yang dibuat (diinstansiasi) dari class tersebut menggunakan keyword `new`. Satu class dapat digunakan untuk membuat banyak object yang berbeda, masing-masing dengan nilai atributnya sendiri.

---

## 2. Attribute dan Method

### Dasar Teori

- **Attribute** adalah variabel yang dimiliki oleh class atau object, merepresentasikan data atau state dari objek tersebut.
- **Method** adalah fungsi atau perilaku yang dimiliki oleh class atau object, merepresentasikan apa yang bisa dilakukan oleh objek.

### Langkah Praktikum

1. Membuat package baru bernama `bagian_2` di dalam package `praktikum_2`.
2. Membuat class `Kalkulator` dengan beberapa atribut dan method operasi matematika.
3. Membuat class `Main` untuk menjalankan program.
4. Menjalankan program untuk melihat hasilnya.

### Kode Program

**Kalkulator.java**
```java
package praktikum_2.bagian_2;

public class Kalkulator {
    // Atribut
    int angka1;
    int angka2;

    // Method
    int tambah() {
        return angka1 + angka2;
    }
}
```

**Main.java**
```java
package praktikum_2.bagian_2;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.angka1 = 5;
        kalkulator.angka2 = 10;

        System.out.println("Hasil Penjumlahan: " + kalkulator.tambah());
    }
}
```

### Output Program

![image](https://hackmd.io/_uploads/ryHdtj82Wg.png)


### Latihan — Class Lingkaran

Membuat class `Lingkaran` dengan atribut `jariJari` dan method `hitungLuas()` yang mengembalikan nilai luas lingkaran.

**Kode Program** (`praktikum_2/latihan/latihan_1/Lingkaran.java`):

```java
package praktikum_2.latihan.latihan_1;

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

        System.out.println("=== Kalkulator Lingkaran ===");
        System.out.println("Jari-Jari : " + lingkaran.jariJari);
        System.out.println("Luas      : " + lingkaran.hitungLuas());
        System.out.println("Keliling  : " + lingkaran.hitungKeliling());
    }
}
```

**Output:**

![image](https://hackmd.io/_uploads/S146YiLnZx.png)


### Analisa dan Pembahasan

Attribute dan method bekerja bersama untuk merepresentasikan entitas secara lengkap. Attribute menyimpan data (jari-jari lingkaran), sementara method mendefinisikan operasi yang bisa dilakukan terhadap data tersebut (menghitung luas). Penting untuk dicatat bahwa method `hitungLuas()` memiliki return type `double` karena hasilnya bisa berupa bilangan desimal. Penggunaan `Math.PI` memberikan nilai pi yang lebih presisi dibandingkan menuliskan 3.14 secara manual.

---

## 3. Akses Modifier

### Dasar Teori

Akses Modifier menentukan tingkat akses dari class, atribut, atau method. Terdapat empat jenis akses modifier di Java:

| Modifier | Keterangan |
|---|---|
| `public` | Dapat diakses dari mana saja |
| `private` | Hanya dapat diakses dalam class yang sama |
| `protected` | Dapat diakses dalam package yang sama dan subclass |
| `default` | Hanya dapat diakses dalam package yang sama (tanpa keyword) |

### Langkah Praktikum

1. Membuat package baru bernama `bagian_3` di dalam package `praktikum_2`.
2. Membuat class `AksesModifier` yang mendemonstrasikan perbedaan akses modifier.
3. Membuat class `Main` untuk menguji akses dari luar class.
4. Menjalankan program untuk melihat hasilnya.

### Kode Program

**AksesModifier.java**
```java
package praktikum_2.bagian_3;

public class AksesModifier {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4; // default

    public void tampilkan() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

```

**Main.java**
```java
package praktikum_2.bagian_3;

public class Main {
    public static void main(String[] args) {
        AksesModifier contoh = new AksesModifier();
        contoh.tampilkan();

        // System.out.println(contoh.privateVar); // Error: privateVar tidak dapat diakses
    }
}

```

### Output Program

![image](https://hackmd.io/_uploads/rJbnqiU2-x.png)


### Latihan — Class AkunBank

Membuat class `AkunBank` dengan atribut `saldo` yang bersifat `private` dan method `tampilkanSaldo()` yang bersifat `public`, kemudian mencoba mengakses atribut saldo langsung dari luar class.

**Kode Program** (`praktikum_2/latihan/latihan_1/AkunBank.java`):

```java
package praktikum_2.latihan.latihan_1;

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
```

**Output:**
![image](https://hackmd.io/_uploads/H1MJio83bg.png)


### Analisa dan Pembahasan

Akses modifier adalah mekanisme kontrol akses yang sangat penting dalam OOP. Ketika atribut `saldo` dideklarasikan sebagai `private`, Java akan menolak akses langsung dari luar class (`akun.saldo`) saat proses kompilasi dengan pesan error: `'saldo' has private access in 'AkunBank'`. Satu-satunya cara untuk mengakses atribut tersebut adalah melalui method `public` yang disediakan oleh class itu sendiri. Pola ini merupakan dasar dari konsep Encapsulation.

---

## 4. Setter dan Getter

### Dasar Teori

- **Setter** adalah method untuk mengubah (menulis) nilai atribut yang bersifat `private`.
- **Getter** adalah method untuk mengambil (membaca) nilai atribut yang bersifat `private`.
- Setter dan Getter merupakan konvensi standar dalam Java untuk mengakses atribut private secara terkontrol, biasanya dengan penamaan `setNamaAtribut()` dan `getNamaAtribut()`.

### Langkah Praktikum

1. Membuat package baru bernama `bagian_4` di dalam package `praktikum_2`.
2. Membuat class `Mobil` dengan atribut private dan getter-setter lengkap.
3. Membuat class `Main` untuk menguji getter dan setter.
4. Menjalankan program untuk melihat hasilnya.

### Kode Program

**Mobil.java**
```java
package praktikum_2.bagian_4;

public class Mobil {
    private String merk;

    // Setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter
    public String getMerk() {
        return merk;
    }
}
```

**Main.java**
```java
package praktikum_2.bagian_4;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setMerk("Toyota");

        System.out.println("Merk Mobil: " + mobil.getMerk());
    }
}
```

### Output Program

![image](https://hackmd.io/_uploads/rygMjjI2bl.png)


### Latihan — Class Mahasiswa dengan Setter & Getter

Membuat class `Mahasiswa` dengan atribut `nama` dan `nim` yang bersifat `private`, beserta setter dan getter untuk kedua atribut tersebut.

**Kode Program** (`praktikum_2/latihan/latihan_1/MahasiswaSG.java`):

```java
package praktikum_2.latihan.latihan_1;

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
```

**Output:**
![image](https://hackmd.io/_uploads/B17BjsL3-e.png)


### Analisa dan Pembahasan

Setter dan getter adalah pasangan method yang menjadi jembatan antara dunia luar dan atribut private sebuah class. Keunggulan pola ini dibandingkan akses langsung adalah kemampuan untuk menambahkan logika validasi di dalam setter sebelum nilai benar-benar disimpan. Misalnya, setter untuk `nim` dapat memvalidasi panjang karakter, atau setter untuk `tahun` dapat memeriksa apakah nilainya masuk akal. Konvensi penamaan `getNamaAtribut()` dan `setNamaAtribut()` sudah menjadi standar universal di Java.

---

## 5. Constructor

### Dasar Teori

Constructor adalah method khusus yang dipanggil secara otomatis saat object dibuat menggunakan keyword `new`. Constructor memiliki nama yang sama dengan nama class dan tidak memiliki return type. Terdapat tiga jenis constructor di Java:

- **Default Constructor**: Constructor tanpa parameter, digunakan untuk inisialisasi nilai default.
- **Parameterized Constructor**: Constructor dengan parameter, memungkinkan inisialisasi atribut langsung saat object dibuat.
- **Constructor Overloading**: Sebuah class memiliki lebih dari satu constructor dengan parameter yang berbeda.

### Langkah Praktikum

1. Membuat package baru bernama `bagian_5` di dalam package `praktikum_2`.
2. Membuat class `Person` yang mendemonstrasikan ketiga jenis constructor.
3. Membuat class `Main` untuk menguji setiap constructor.
4. Menjalankan program untuk melihat hasilnya.

### Kode Program

**Person.java**
```java
package praktikum_2.bagian_5;

public class Person {
    private String nama;
    private int umur;

    // Default Constructor
    public Person() {
        nama = "Unknown";
        umur = 0;
    }

    // Parameterized Constructor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
```

**Main.java**
```java
package praktikum_2.bagian_5;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Budi", 25);

        person1.tampilkanInfo();
        person2.tampilkanInfo();
    }
}

```

### Output Program

![image](https://hackmd.io/_uploads/B19FjiLnWg.png)


### Latihan — Class Barang dengan Constructor

Membuat class `Barang` dengan atribut `namaBarang` dan `harga`, mengimplementasikan default constructor dan parameterized constructor.

**Kode Program** (`praktikum_2/latihan/latihan_1/Barang.java`):

```java
package praktikum_2.latihan.latihan_1;

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
```

**Output:**
![image](https://hackmd.io/_uploads/HkgTjoI2Zg.png)


### Analisa dan Pembahasan

Constructor menyederhanakan proses pembuatan object karena inisialisasi atribut dapat dilakukan sekaligus dalam satu langkah. Constructor overloading memberikan fleksibilitas kepada pengguna class untuk membuat object dengan berbagai cara sesuai data yang tersedia. Perbedaan utama antara default dan parameterized constructor adalah: default constructor memberikan nilai awal bawaan, sementara parameterized constructor memungkinkan nilai atribut ditentukan langsung saat object dibuat, sehingga tidak perlu memanggil setter satu per satu.

---

## 6. Sistem Manajemen Perpustakaan Sederhana

### Deskripsi

Bagian ini mengimplementasikan seluruh konsep yang telah dipelajari (class, object, attribute, method, akses modifier, setter-getter, dan constructor) dalam sebuah aplikasi console Sistem Manajemen Perpustakaan Sederhana. Fitur aplikasi meliputi:

1. Menambahkan buku ke perpustakaan.
2. Menampilkan seluruh daftar buku.
3. Mencari buku berdasarkan judul.

### Langkah Praktikum

1. Membuat package baru bernama `bagian_6` di dalam package `praktikum_2`.
2. Membuat class `Buku` sebagai representasi data buku.
3. Membuat class `Perpustakaan` untuk mengelola koleksi buku.
4. Membuat class `Main` sebagai antarmuka menu interaktif.
5. Menjalankan program untuk melihat hasilnya.

### Kode Program

**Buku.java**
```java
package praktikum_2.bagian_6;

public class Buku {
    // Atribut (private)
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Constructor (default)
    public Buku() {
        this.judul = "Unknown";
        this.pengarang = "Unknown";
        this.tahunTerbit = 0;
    }

    // Constructor (parameterized)
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Setter dan Getter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("------------------------------------");
    }
}
```

**Perpustakaan.java**
```java
package praktikum_2.bagian_6;

import java.util.ArrayList;

public class Perpustakaan {
    // Atribut (private)
    private ArrayList<Buku> daftarBuku;

    // Constructor
    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    // Method untuk menambahkan buku
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan!");
    }

    // Method untuk menampilkan semua buku
    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam perpustakaan.");
        } else {
            System.out.println("Daftar Buku:");
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfo();
            }
        }
    }

    // Method untuk mencari buku berdasarkan judul
    public void cariBuku(String judul) {
        boolean ditemukan = false;
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Buku ditemukan:");
                buku.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
        }
    }
}

```

**Main.java**
```java
package praktikum_2.bagian_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int pilihan;

        do {
            // Menu
            System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    // Tambah Buku
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan nama pengarang: ");
                    String pengarang = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit: ");
                    int tahunTerbit = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline

                    Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
                    perpustakaan.tambahBuku(bukuBaru);
                    break;

                case 2:
                    // Tampilkan Semua Buku
                    perpustakaan.tampilkanSemuaBuku();
                    break;

                case 3:
                    // Cari Buku
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String judulCari = scanner.nextLine();
                    perpustakaan.cariBuku(judulCari);
                    break;

                case 4:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
```

### Output Program

```
=== Sistem Manajemen Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Keluar
Pilih menu: 1
Masukkan judul buku: madilog
Masukkan nama pengarang: tan malaka
Masukkan tahun terbit: 1943
Buku berhasil ditambahkan!

=== Sistem Manajemen Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Keluar
Pilih menu: 2
Daftar Buku:
Judul: madilog
Pengarang: tan malaka
Tahun Terbit: 1943
------------------------------------

=== Sistem Manajemen Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Keluar
Pilih menu: 3
Masukkan judul buku yang dicari: madilog
Buku ditemukan:
Judul: madilog
Pengarang: tan malaka
Tahun Terbit: 1943
------------------------------------

=== Sistem Manajemen Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Keluar
Pilih menu: 4
Terima kasih telah menggunakan sistem ini!

Process finished with exit code 0

```

### Penjelasan Penerapan Konsep pada Aplikasi

| Konsep | Penerapan dalam Aplikasi |
|---|---|
| **Class & Object** | `Buku`, `Perpustakaan`, dan `Main` adalah class; objek `perpus`, `bukuBaru` adalah instance-nya |
| **Attribute** | `judul`, `pengarang`, `tahunTerbit` pada class `Buku`; `daftarBuku` pada `Perpustakaan` |
| **Method** | `tambahBuku()`, `tampilkanSemuaBuku()`, `cariBuku()` pada class `Perpustakaan` |
| **Akses Modifier** | Atribut `Buku` bersifat `private`; method akses bersifat `public` |
| **Setter & Getter** | Disediakan untuk semua atribut `private` pada class `Buku` |
| **Constructor** | `Buku` memiliki default constructor dan parameterized constructor |

### Analisa dan Pembahasan

Aplikasi Sistem Manajemen Perpustakaan ini memperlihatkan bagaimana seluruh konsep dasar OOP bekerja secara sinergis. Class `Buku` menerapkan enkapsulasi dengan atribut private dan akses melalui getter-setter. Constructor overloading pada `Buku` memungkinkan pembuatan objek dengan cara yang fleksibel. Class `Perpustakaan` berperan sebagai pengelola koleksi menggunakan `ArrayList`, menunjukkan bagaimana satu objek dapat mengandung koleksi objek lainnya. Pemisahan antara class `Buku`, `Perpustakaan`, dan `Main` juga mencerminkan prinsip Single Responsibility — setiap class hanya bertanggung jawab atas satu hal.

---

## 7. Kesimpulan

Melalui praktikum ini, dipelajari konsep dasar Pemrograman Berorientasi Objek (OOP) menggunakan Java yang mencakup:

1. **Class dan Object** — Class adalah blueprint untuk membuat object. Dengan satu class, dapat dibuat banyak object yang masing-masing memiliki state (nilai atribut) tersendiri.

2. **Attribute dan Method** — Attribute merepresentasikan data yang dimiliki objek, sedangkan method merepresentasikan perilaku atau operasi yang dapat dilakukan objek terhadap datanya.

3. **Akses Modifier** — `public`, `private`, `protected`, dan `default` mengontrol tingkat visibilitas dan aksesibilitas suatu anggota class. Pemilihan akses modifier yang tepat adalah kunci dalam menerapkan enkapsulasi.

4. **Setter dan Getter** — Pasangan method ini menjadi jembatan terkontrol untuk mengakses dan memodifikasi atribut private, sekaligus memungkinkan validasi data sebelum nilai disimpan.

5. **Constructor** — Method khusus yang dijalankan otomatis saat object dibuat. Constructor overloading memberikan fleksibilitas dalam proses inisialisasi object sesuai kebutuhan.

6. **Aplikasi Nyata** — Sistem Manajemen Perpustakaan membuktikan bahwa konsep-konsep dasar OOP dapat dipadukan untuk membangun program yang terstruktur, mudah dipahami, dan mudah dikembangkan.

Pemahaman yang kuat terhadap konsep-konsep dasar ini menjadi prasyarat penting sebelum melangkah ke materi yang lebih kompleks seperti empat pilar OOP (Encapsulation, Inheritance, Polymorphism, Abstraction) dan Design Pattern.

---

## Referensi

- Modul Lab 02 — Review Konsep Dasar OOP Menggunakan Java, Praktikum Design Pattern, Politeknik Negeri Lhokseumawe
- Oracle Java Documentation: Object-Oriented Programming Concepts — https://docs.oracle.com/javase/tutorial/java/concepts/
- Oracle Java Documentation: Classes and Objects — https://docs.oracle.com/javase/tutorial/java/javaOO/
- Amazon Corretto (OpenJDK Distribution) — https://aws.amazon.com/corretto/
- IntelliJ IDEA Community Edition — https://www.jetbrains.com/idea/