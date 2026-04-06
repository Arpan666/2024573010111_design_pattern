# Laporan Lab 03: Review 4 Pilar OOP Menggunakan Java

**Mata Kuliah:** Praktikum Design Pattern  
**Nama:** Mizaul Arfan  
**NIM:** 2024573010111  
**Kelas:** TI 2A  
**Prodi:** Teknik Informatika — Jurusan TIK, Politeknik Negeri Lhokseumawe

---

## Abstrak

Laporan ini membahas review empat pilar utama Pemrograman Berorientasi Objek (OOP) menggunakan Java, yang mencakup Class & Object, Encapsulation, Inheritance & Composition, Polymorphism (Method Overriding & Overloading), serta Abstraction (Abstract Class & Interface). Selain itu, laporan ini mendokumentasikan seluruh latihan yang diberikan pada modul, serta sebuah aplikasi console pemesanan tiket konferensi yang mengintegrasikan semua konsep OOP tersebut. Tujuan laporan ini adalah membuktikan pemahaman terhadap prinsip-prinsip OOP sebagai fondasi untuk mempelajari Design Pattern.

---

## 1. Pengenalan OOP dan Class-Object

### Dasar Teori

OOP (Object-Oriented Programming) adalah paradigma pemrograman yang menggunakan "objek" untuk merepresentasikan data dan metode yang beroperasi pada data tersebut. Konsep dasar OOP meliputi:

- **Class**: Blueprint atau template untuk membuat objek.
- **Object**: Instance dari class yang memiliki atribut dan metode.

### Langkah Praktikum

1. Membuka project pada praktikum sebelumnya menggunakan IntelliJ IDEA.
2. Membuat package baru bernama `modul_3` di dalam folder `src`.
3. Membuat package baru bernama `bagian_1` di dalam package `modul_3`.
4. Membuat class `Mahasiswa` di dalam package `bagian_1`.
5. Membuat class `Main` untuk menjalankan program.
6. Menjalankan program untuk melihat hasilnya.

### Kode Program

**Mahasiswa.java**
```java
package praktikum_3.bagian_1;

class Mahasiswa {
    // Atribut
    String nama;
    int umur;

    // Metode
    void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
```

**Main.java**
```java
package praktikum_3.bagian_1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.umur = 20;

        // Memanggil metode
        mhs1.displayInfo();
    }
}
```

### Output Program



### Latihan — Class Buku

Membuat class `Buku` dengan atribut `judul`, `penulis`, dan `tahunTerbit`, kemudian membuat objek dari class tersebut dan menampilkan informasinya.

**Kode Program** (`modul_3/latihan/latihan_1/Buku.java`):

```java
package modul_3.latihan.latihan_1;

public class Buku {
    String judul;
    String penulis;
    int tahunTerbit;

    void tampilInfo() {
        System.out.println("=== Informasi Buku ===");
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java untuk Pemula";
        buku1.penulis = "Budi Raharjo";
        buku1.tahunTerbit = 2022;

        buku1.tampilInfo();
    }
}
```

**Output:**

```
=== Informasi Buku ===
Judul        : Pemrograman Java untuk Pemula
Penulis      : Budi Raharjo
Tahun Terbit : 2022
```

### Analisa dan Pembahasan

Class berfungsi sebagai cetak biru (blueprint) yang mendefinisikan atribut dan metode yang dimiliki suatu entitas. Object adalah wujud nyata dari class tersebut. Pada contoh di atas, `Mahasiswa` adalah class dan `mhs` adalah object yang dibuat dari class tersebut. Konsep ini memungkinkan kita merepresentasikan entitas dunia nyata ke dalam program secara terstruktur.

---

## 2. Encapsulation (Enkapsulasi)

### Dasar Teori

Encapsulation adalah konsep menyembunyikan detail internal objek dan hanya mengekspos fungsionalitas yang diperlukan. Ini dilakukan dengan menggunakan access modifier (`private`, `public`, `protected`) serta getter dan setter untuk mengakses atribut yang disembunyikan.

### Langkah Praktikum

1. Membuat package baru bernama `bagian_2` di dalam package `modul_3`.
2. Membuat class `Mahasiswa` dengan atribut yang dienkapsulasi menggunakan `private`.
3. Membuat getter dan setter untuk setiap atribut.
4. Membuat class `Main` untuk menjalankan program.
5. Menjalankan program untuk melihat hasilnya.

### Kode Program

**Mahasiswa.java**
```java
package modul_3.bagian_2;

public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public double getIpk() { return ipk; }
    public void setIpk(double ipk) {
        if (ipk >= 0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid!");
        }
    }

    public void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IPK  : " + ipk);
    }
}
```

**Main.java**
```java
package modul_3.bagian_2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Mizaul Arfan");
        mhs.setNim("2024573010111");
        mhs.setIpk(3.85);

        mhs.tampilInfo();
    }
}
```

### Output Program

```
Nama : Mizaul Arfan
NIM  : 2024573010111
IPK  : 3.85
```

### Latihan — Class Motor

Membuat class `Motor` dengan atribut `merk` dan `tahun` yang dienkapsulasi, beserta getter dan setter-nya.

**Kode Program** (`modul_3/latihan/latihan_1/Motor.java`):

```java
package modul_3.latihan.latihan_1;

public class Motor {
    private String merk;
    private int tahun;

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public int getTahun() { return tahun; }
    public void setTahun(int tahun) {
        if (tahun > 1900 && tahun <= 2025) {
            this.tahun = tahun;
        } else {
            System.out.println("Tahun tidak valid!");
        }
    }

    public void tampilInfo() {
        System.out.println("=== Informasi Motor ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Tahun : " + tahun);
    }

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setMerk("Honda");
        motor.setTahun(2023);
        motor.tampilInfo();
    }
}
```

**Output:**

```
=== Informasi Motor ===
Merk  : Honda
Tahun : 2023
```

### Analisa dan Pembahasan

Encapsulation melindungi data dari akses langsung yang tidak terkontrol. Dengan menjadikan atribut `private`, data hanya dapat diakses atau diubah melalui method getter dan setter. Hal ini memungkinkan validasi data dilakukan di dalam setter, seperti pengecekan rentang IPK (0–4.0) atau tahun yang valid, sehingga integritas data terjaga.

---

## 3. Inheritance (Pewarisan) dan Composition (Komposisi)

### Dasar Teori

#### Inheritance (Pewarisan)
Inheritance adalah mekanisme di mana sebuah class (subclass/child class) mewarisi atribut dan metode dari class lain (superclass/parent class). Inheritance menggambarkan hubungan **"is-a"** (adalah). Misalnya, Mobil **adalah** Kendaraan. Inheritance menggunakan keyword `extends`.

#### Composition (Komposisi)
Composition adalah mekanisme di mana sebuah class terdiri dari objek-objek dari class lain. Ini menggambarkan hubungan **"has-a"** (memiliki). Misalnya, Mobil **memiliki** Mesin. Composition lebih fleksibel karena tidak terikat pada hierarki class.

#### Perbandingan Inheritance dan Composition

| Aspek | Inheritance | Composition |
|---|---|---|
| Hubungan | "is-a" (adalah) | "has-a" (memiliki) |
| Fleksibilitas | Kurang fleksibel (terikat hierarki) | Lebih fleksibel (tidak terikat hierarki) |
| Reusability | Mewarisi semua atribut dan metode | Hanya menggunakan apa yang dibutuhkan |
| Keyword | `extends` | Tidak ada keyword khusus |
| Keterikatan | Kuat (subclass tergantung superclass) | Lemah (class independen) |

### Langkah Praktikum — Inheritance

1. Membuat package `bagian_3` di dalam `modul_3`, lalu membuat package `pewarisan` di dalamnya.
2. Membuat class `Kendaraan` sebagai superclass.
3. Membuat class `Mobil` yang mewarisi class `Kendaraan`.
4. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Inheritance

**Kendaraan.java**
```java
package modul_3.bagian_3.pewarisan;

public class Kendaraan {
    String merk;
    int tahun;

    void tampilInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Tahun : " + tahun);
    }
}
```

**Mobil.java**
```java
package modul_3.bagian_3.pewarisan;

public class Mobil extends Kendaraan {
    int jumlahPintu;

    void tampilInfoMobil() {
        tampilInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}
```

**Main.java**
```java
package modul_3.bagian_3.pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.merk = "Toyota";
        mobil.tahun = 2022;
        mobil.jumlahPintu = 4;

        mobil.tampilInfoMobil();
    }
}
```

**Output:**
```
Merk  : Toyota
Tahun : 2022
Jumlah Pintu : 4
```

### Langkah Praktikum — Composition

1. Membuat package `komposisi` di dalam package `bagian_3`.
2. Membuat class `Mesin` sebagai komponen.
3. Membuat class `Mobil` yang menggunakan objek `Mesin` sebagai atribut.
4. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Composition

**Mesin.java**
```java
package modul_3.bagian_3.komposisi;

public class Mesin {
    String tipe;
    int kapasitas;

    void nyalakan() {
        System.out.println("Mesin " + tipe + " dengan kapasitas " + kapasitas + "cc dinyalakan.");
    }
}
```

**Mobil.java**
```java
package modul_3.bagian_3.komposisi;

public class Mobil {
    String merk;
    Mesin mesin;

    void tampilInfo() {
        System.out.println("Merk  : " + merk);
        mesin.nyalakan();
    }
}
```

**Main.java**
```java
package modul_3.bagian_3.komposisi;

public class Main {
    public static void main(String[] args) {
        Mesin mesin = new Mesin();
        mesin.tipe = "V6";
        mesin.kapasitas = 2000;

        Mobil mobil = new Mobil();
        mobil.merk = "Honda";
        mobil.mesin = mesin;

        mobil.tampilInfo();
    }
}
```

**Output:**
```
Merk  : Honda
Mesin V6 dengan kapasitas 2000cc dinyalakan.
```

### Latihan — Laptop dengan Processor dan RAM

Membuat class `Laptop` yang menggunakan composition dengan komponen `Processor` dan `RAM`.

**Kode Program** (`modul_3/latihan/latihan_1/`):

```java
package modul_3.latihan.latihan_1;

public class Processor {
    String tipe;

    void jalankan() {
        System.out.println("Processor " + tipe + " sedang berjalan.");
    }
}
```

```java
package modul_3.latihan.latihan_1;

public class RAM {
    int kapasitas;

    void baca() {
        System.out.println("RAM " + kapasitas + "GB sedang membaca data.");
    }

    void tulis() {
        System.out.println("RAM " + kapasitas + "GB sedang menulis data.");
    }
}
```

```java
package modul_3.latihan.latihan_1;

public class Laptop {
    String merk;
    Processor processor;
    RAM ram;

    void nyalakan() {
        System.out.println("=== Laptop " + merk + " dinyalakan ===");
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }

    public static void main(String[] args) {
        Processor proc = new Processor();
        proc.tipe = "Intel Core i7";

        RAM ram = new RAM();
        ram.kapasitas = 16;

        Laptop laptop = new Laptop();
        laptop.merk = "ASUS";
        laptop.processor = proc;
        laptop.ram = ram;

        laptop.nyalakan();
    }
}
```

**Output:**
```
=== Laptop ASUS dinyalakan ===
Processor Intel Core i7 sedang berjalan.
RAM 16GB sedang membaca data.
RAM 16GB sedang menulis data.
```

### Analisa dan Pembahasan

Inheritance cocok digunakan ketika terdapat hubungan "is-a" yang jelas, seperti `Mobil extends Kendaraan`. Sementara composition lebih fleksibel karena memungkinkan class dibangun dari komponen-komponen yang independen (hubungan "has-a"). Dalam praktiknya, composition sering lebih dianjurkan karena mengurangi keterikatan (coupling) antar class, sehingga kode lebih mudah dipelihara dan diubah.

---

## 4. Polymorphism (Polimorfisme)

### Dasar Teori

Polymorphism memungkinkan objek untuk memiliki banyak bentuk. Di Java, ini dicapai melalui dua cara:

- **Method Overriding**: Subclass menyediakan implementasi spesifik untuk method yang sudah didefinisikan di superclass. Method yang di-override harus memiliki nama, parameter, dan return type yang sama.
- **Method Overloading**: Sebuah class memiliki beberapa method dengan nama yang sama tetapi parameter yang berbeda (jumlah atau tipe).

#### Perbandingan Overriding dan Overloading

| Aspek | Overriding | Overloading |
|---|---|---|
| Definisi | Mengganti implementasi method di subclass | Method nama sama dengan parameter berbeda |
| Parameter | Harus sama | Harus berbeda |
| Return Type | Harus sama atau subtype | Bisa berbeda |
| Class | Antara superclass dan subclass | Dalam satu class |
| Keyword | `@Override` (opsional) | Tidak ada keyword khusus |

### Langkah Praktikum — Method Overriding

1. Membuat package `bagian_4` di dalam `modul_3`, lalu membuat package `overriding`.
2. Membuat class `Hewan` sebagai superclass dengan method `bersuara()`.
3. Membuat class `Kucing` dan `Anjing` yang meng-override method `bersuara()`.
4. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Method Overriding

**Hewan.java**
```java
package modul_3.bagian_4.overriding;

public class Hewan {
    String nama;

    void bersuara() {
        System.out.println(nama + " mengeluarkan suara.");
    }
}
```

**Kucing.java**
```java
package modul_3.bagian_4.overriding;

public class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println(nama + " bersuara: Meow!");
    }
}
```

**Anjing.java**
```java
package modul_3.bagian_4.overriding;

public class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println(nama + " bersuara: Guk Guk!");
    }
}
```

**Main.java**
```java
package modul_3.bagian_4.overriding;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        hewan1.nama = "Kitty";
        hewan1.bersuara();

        Hewan hewan2 = new Anjing();
        hewan2.nama = "Rex";
        hewan2.bersuara();
    }
}
```

**Output:**
```
Kitty bersuara: Meow!
Rex bersuara: Guk Guk!
```

### Langkah Praktikum — Method Overloading

1. Membuat package `overloading` di dalam package `bagian_4`.
2. Membuat class `Kalkulator` dengan beberapa versi method `tambah()`.
3. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Method Overloading

**Kalkulator.java**
```java
package modul_3.bagian_4.overloading;

public class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}
```

**Main.java**
```java
package modul_3.bagian_4.overloading;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalk = new Kalkulator();
        System.out.println("Tambah 2 int    : " + kalk.tambah(5, 3));
        System.out.println("Tambah 3 int    : " + kalk.tambah(5, 3, 2));
        System.out.println("Tambah 2 double : " + kalk.tambah(5.5, 3.2));
    }
}
```

**Output:**
```
Tambah 2 int    : 8
Tambah 3 int    : 10
Tambah 2 double : 8.7
```

### Latihan

#### Latihan 1 — Overriding: BangunDatar

```java
package modul_3.latihan.latihan_1;

public class BangunDatar {
    void hitungLuas() {
        System.out.println("Menghitung luas bangun datar.");
    }
}
```

```java
package modul_3.latihan.latihan_1;

public class Persegi extends BangunDatar {
    double sisi;

    @Override
    void hitungLuas() {
        System.out.println("Luas Persegi : " + (sisi * sisi));
    }
}
```

```java
package modul_3.latihan.latihan_1;

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
```

**Output:**
```
Luas Persegi : 25.0
Luas Lingkaran : 153.93804002589985
```

#### Latihan 2 — Overloading: Matematika

```java
package modul_3.latihan.latihan_1;

public class Matematika {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Matematika mat = new Matematika();
        System.out.println("2 parameter int    : " + mat.tambah(3, 4));
        System.out.println("3 parameter int    : " + mat.tambah(3, 4, 5));
        System.out.println("2 parameter double : " + mat.tambah(2.5, 1.5));
    }
}
```

**Output:**
```
2 parameter int    : 7
3 parameter int    : 12
2 parameter double : 4.0
```

### Analisa dan Pembahasan

Polymorphism memberikan fleksibilitas tinggi dalam pemrograman OOP. Melalui overriding, satu method dapat berperilaku berbeda tergantung pada subclass yang memanggilnya — ini sangat berguna dalam menerapkan prinsip "satu antarmuka, banyak implementasi". Sementara overloading mempermudah penggunaan method karena programmer tidak perlu menghafal nama method yang berbeda untuk operasi yang serupa.

---

## 5. Abstraction (Abstraksi) | Abstract Class dan Interface

### Dasar Teori

Abstraction adalah salah satu dari empat pilar utama OOP yang memungkinkan kita menyembunyikan detail implementasi dan hanya menampilkan fungsionalitas yang diperlukan. Di Java, abstraction diimplementasikan melalui:

- **Abstract Class**: Class yang tidak dapat diinstansiasi langsung. Dapat memiliki method abstrak (tanpa body) dan method konkret (dengan body). Menggunakan keyword `abstract`.
- **Interface**: Blueprint yang hanya berisi method abstrak (sebelum Java 8) atau method default/static (Java 8+). Mendukung multiple inheritance karena sebuah class dapat mengimplementasikan banyak interface.

#### Perbandingan Abstract Class dan Interface

| Aspek | Abstract Class | Interface |
|---|---|---|
| Keyword | `abstract class` | `interface` |
| Method | Bisa abstrak dan konkret | Sebelum Java 8: hanya abstrak. Java 8+: bisa default/static |
| Atribut | Bisa non-static | Hanya konstanta (`public static final`) |
| Constructor | Bisa memiliki constructor | Tidak bisa memiliki constructor |
| Inheritance | Hanya satu superclass | Bisa implementasi banyak interface |
| Penggunaan | Hubungan "is-a" | Mendefinisikan kontrak/kemampuan |

### Langkah Praktikum — Abstract Class

1. Membuat package `bagian_5` di dalam `modul_3`, lalu membuat package `abstrak`.
2. Membuat abstract class `Hewan` dengan method abstrak `bersuara()`.
3. Membuat class `Kucing` dan `Anjing` yang mengimplementasikan method abstrak tersebut.
4. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Abstract Class

**Hewan.java**
```java
package modul_3.bagian_5.abstrak;

public abstract class Hewan {
    String nama;

    abstract void bersuara();

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}
```

**Kucing.java**
```java
package modul_3.bagian_5.abstrak;

public class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println(nama + " bersuara: Meow!");
    }
}
```

**Anjing.java**
```java
package modul_3.bagian_5.abstrak;

public class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println(nama + " bersuara: Guk Guk!");
    }
}
```

**Main.java**
```java
package modul_3.bagian_5.abstrak;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.bersuara();
        kucing.makan();

        Hewan anjing = new Anjing();
        anjing.nama = "Rex";
        anjing.bersuara();
        anjing.makan();
    }
}
```

**Output:**
```
Kitty bersuara: Meow!
Kitty sedang makan.
Rex bersuara: Guk Guk!
Rex sedang makan.
```

### Langkah Praktikum — Interface

1. Membuat package `antarmuka` di dalam package `bagian_5`.
2. Membuat interface `Bergerak` dengan method `bergerak()`.
3. Membuat class `Mobil` dan `Pesawat` yang mengimplementasikan interface `Bergerak`.
4. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Interface

**Bergerak.java**
```java
package modul_3.bagian_5.antarmuka;

public interface Bergerak {
    void bergerak();
}
```

**Mobil.java**
```java
package modul_3.bagian_5.antarmuka;

public class Mobil implements Bergerak {
    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak di darat.");
    }
}
```

**Pesawat.java**
```java
package modul_3.bagian_5.antarmuka;

public class Pesawat implements Bergerak {
    @Override
    public void bergerak() {
        System.out.println("Pesawat bergerak di udara.");
    }
}
```

**Main.java**
```java
package modul_3.bagian_5.antarmuka;

public class Main {
    public static void main(String[] args) {
        Bergerak mobil = new Mobil();
        mobil.bergerak();

        Bergerak pesawat = new Pesawat();
        pesawat.bergerak();
    }
}
```

**Output:**
```
Mobil bergerak di darat.
Pesawat bergerak di udara.
```

### Latihan — HewanAir, Interface Berenang, dan Class Ikan

Membuat interface `Berenang`, abstract class `HewanAir`, dan class `Ikan` yang menggabungkan keduanya.

**Kode Program** (`modul_3/latihan/latihan_1/`):

```java
package modul_3.latihan.latihan_1;

public interface Berenang {
    void berenang();
}
```

```java
package modul_3.latihan.latihan_1;

public abstract class HewanAir {
    String nama;

    abstract void makan();
}
```

```java
package modul_3.latihan.latihan_1;

public class Ikan extends HewanAir implements Berenang {
    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang di air.");
    }

    @Override
    void makan() {
        System.out.println(nama + " sedang makan plankton.");
    }

    public static void main(String[] args) {
        Ikan ikan = new Ikan();
        ikan.nama = "Nemo";
        ikan.berenang();
        ikan.makan();
    }
}
```

**Output:**
```
Nemo sedang berenang di air.
Nemo sedang makan plankton.
```

### Analisa dan Pembahasan

Abstraksi memungkinkan programmer mendefinisikan "apa yang harus dilakukan" tanpa harus menentukan "bagaimana cara melakukannya" di tingkat yang lebih tinggi. Abstract class cocok ketika ada perilaku bersama (method konkret) yang ingin diwarisi, sementara interface cocok untuk mendefinisikan kontrak kemampuan yang dapat diimplementasikan oleh berbagai class yang tidak terkait secara hierarki. Kombinasi keduanya, seperti pada class `Ikan`, memberikan fleksibilitas maksimum.

---

## 6. Aplikasi Console Pemesanan Tiket Konferensi

### Deskripsi

Bagian ini mengimplementasikan seluruh konsep OOP (Class, Object, Encapsulation, Inheritance, Polymorphism, dan Abstraction) dalam sebuah aplikasi console pemesanan tiket konferensi yang memiliki fitur:

1. Menampilkan daftar tiket yang tersedia.
2. Memesan tiket.
3. Melihat detail pesanan.
4. Membatalkan pesanan.
5. Menghitung total harga setelah diskon.

### Langkah Praktikum

1. Membuat package `bagian_6` di dalam `modul_3`.
2. Membuat class `Tiket` (abstract class) sebagai blueprint tiket.
3. Membuat class `TiketReguler` dan `TiketVIP` yang mewarisi `Tiket`.
4. Membuat class `Pesanan` untuk mengelola data pesanan.
5. Membuat class `KonferensiApp` sebagai class utama aplikasi.

### Kode Program

**Tiket.java** (Abstract Class)
```java
package modul_3.bagian_6;

public abstract class Tiket {
    private String jenis;
    private double harga;

    public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getJenis() { return jenis; }
    public double getHarga() { return harga; }

    public abstract double hitungDiskon();

    public double hargaAkhir() {
        return harga - hitungDiskon();
    }

    public void tampilInfo() {
        System.out.println("Jenis  : " + jenis);
        System.out.println("Harga  : Rp " + harga);
        System.out.println("Diskon : Rp " + hitungDiskon());
        System.out.println("Total  : Rp " + hargaAkhir());
    }
}
```

**TiketReguler.java**
```java
package modul_3.bagian_6;

public class TiketReguler extends Tiket {
    public TiketReguler() {
        super("Reguler", 150000);
    }

    @Override
    public double hitungDiskon() {
        return 0; // Tidak ada diskon
    }
}
```

**TiketVIP.java**
```java
package modul_3.bagian_6;

public class TiketVIP extends Tiket {
    public TiketVIP() {
        super("VIP", 500000);
    }

    @Override
    public double hitungDiskon() {
        return getHarga() * 0.1; // Diskon 10%
    }
}
```

**Pesanan.java**
```java
package modul_3.bagian_6;

public class Pesanan {
    private String nomorPesanan;
    private Tiket tiket;
    private int jumlah;

    public Pesanan(String nomorPesanan, Tiket tiket, int jumlah) {
        this.nomorPesanan = nomorPesanan;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public String getNomorPesanan() { return nomorPesanan; }

    public void tampilDetail() {
        System.out.println("=== Detail Pesanan ===");
        System.out.println("No. Pesanan : " + nomorPesanan);
        tiket.tampilInfo();
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total Bayar : Rp " + (tiket.hargaAkhir() * jumlah));
    }
}
```

**KonferensiApp.java**
```java
package modul_3.bagian_6;

import java.util.ArrayList;
import java.util.Scanner;

public class KonferensiApp {
    private static ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
    private static int nomorUrut = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Aplikasi Pemesanan Tiket Konferensi ===");
            System.out.println("1. Lihat Daftar Tiket");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Detail Pesanan");
            System.out.println("4. Batalkan Pesanan");
            System.out.println("5. Hitung Total Harga Semua Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Tiket ---");
                    new TiketReguler().tampilInfo();
                    System.out.println();
                    new TiketVIP().tampilInfo();
                    break;
                case 2:
                    System.out.println("\nPilih Jenis Tiket (1=Reguler, 2=VIP): ");
                    int jenis = scanner.nextInt();
                    System.out.print("Jumlah Tiket: ");
                    int jumlah = scanner.nextInt();
                    Tiket tiket = (jenis == 1) ? new TiketReguler() : new TiketVIP();
                    String nomor = "PSN-" + String.format("%03d", nomorUrut++);
                    daftarPesanan.add(new Pesanan(nomor, tiket, jumlah));
                    System.out.println("Pesanan berhasil! No. Pesanan: " + nomor);
                    break;
                case 3:
                    System.out.print("Masukkan No. Pesanan: ");
                    String cariNomor = scanner.next();
                    boolean ditemukan = false;
                    for (Pesanan p : daftarPesanan) {
                        if (p.getNomorPesanan().equals(cariNomor)) {
                            p.tampilDetail();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) System.out.println("Pesanan tidak ditemukan.");
                    break;
                case 4:
                    System.out.print("Masukkan No. Pesanan yang dibatalkan: ");
                    String batalNomor = scanner.next();
                    daftarPesanan.removeIf(p -> p.getNomorPesanan().equals(batalNomor));
                    System.out.println("Pesanan " + batalNomor + " berhasil dibatalkan.");
                    break;
                case 5:
                    double total = 0;
                    for (Pesanan p : daftarPesanan) total += p.getNomorPesanan().length();
                    System.out.println("Total semua pesanan: Rp " + total);
                    break;
            }
        } while (pilihan != 0);

        System.out.println("Terima kasih!");
        scanner.close();
    }
}
```

### Output Program

```
=== Aplikasi Pemesanan Tiket Konferensi ===
1. Lihat Daftar Tiket
2. Pesan Tiket
3. Lihat Detail Pesanan
4. Batalkan Pesanan
5. Hitung Total Harga Semua Pesanan
0. Keluar
Pilihan: 1

--- Daftar Tiket ---
Jenis  : Reguler
Harga  : Rp 150000.0
Diskon : Rp 0.0
Total  : Rp 150000.0

Jenis  : VIP
Harga  : Rp 500000.0
Diskon : Rp 50000.0
Total  : Rp 450000.0
```

### Penjelasan Penerapan OOP pada Aplikasi

| Konsep OOP | Penerapan dalam Aplikasi |
|---|---|
| **Encapsulation** | Atribut `jenis` dan `harga` pada class `Tiket` bersifat `private`, diakses melalui getter |
| **Inheritance** | `TiketReguler` dan `TiketVIP` mewarisi abstract class `Tiket` |
| **Polymorphism** | Method `hitungDiskon()` di-override secara berbeda di tiap subclass |
| **Abstraction** | `Tiket` adalah abstract class dengan method abstrak `hitungDiskon()` |

### Analisa dan Pembahasan

Aplikasi pemesanan tiket ini membuktikan bahwa konsep OOP dapat diterapkan secara terpadu untuk membangun program yang terstruktur dan mudah dikembangkan. Penggunaan abstract class `Tiket` memastikan setiap jenis tiket wajib mengimplementasikan logika diskon masing-masing. Inheritance memungkinkan `TiketReguler` dan `TiketVIP` berbagi atribut dan method dari `Tiket` tanpa duplikasi kode. Aplikasi ini juga mudah diperluas, misalnya dengan menambahkan jenis tiket baru cukup dengan membuat subclass baru dari `Tiket`.

---

## 7. Kesimpulan

Melalui modul ini, dipelajari empat pilar utama Pemrograman Berorientasi Objek (OOP) menggunakan Java, yang mencakup:

1. **Class dan Object** — Class adalah blueprint dan object adalah instansinya. Semua entitas dalam program OOP direpresentasikan sebagai objek yang memiliki atribut dan perilaku.

2. **Encapsulation** — Menyembunyikan detail internal dengan access modifier `private` dan mengaksesnya melalui getter/setter. Hal ini menjaga integritas data dan menyederhanakan antarmuka class.

3. **Inheritance & Composition** — Inheritance memungkinkan pewarisan atribut dan method (hubungan "is-a"), sementara Composition membangun class dari objek lain (hubungan "has-a"). Composition umumnya lebih fleksibel dan dianjurkan untuk mengurangi coupling.

4. **Polymorphism** — Method Overriding memungkinkan subclass memiliki perilaku berbeda untuk method yang sama, sedangkan Method Overloading memberikan fleksibilitas pemanggilan method dengan parameter berbeda.

5. **Abstraction** — Abstract class dan Interface memungkinkan pendefinisian kontrak tanpa harus mengimplementasikan detailnya. Interface mendukung multiple inheritance sehingga lebih fleksibel untuk mendefinisikan kemampuan lintas hierarki.

6. **Aplikasi Nyata** — Penerapan seluruh konsep OOP dalam aplikasi pemesanan tiket membuktikan bahwa OOP menghasilkan kode yang modular, terstruktur, dan mudah dipelihara serta dikembangkan.

Pemahaman mendalam terhadap konsep-konsep OOP ini merupakan prasyarat penting sebelum mempelajari Design Pattern, yang pada dasarnya merupakan solusi terpola (proven solution) untuk masalah-masalah umum dalam perancangan perangkat lunak berbasis OOP.

---

## Referensi

- Modul Lab 03 — Review 4 Pilar OOP Menggunakan Java, Praktikum Design Pattern, Politeknik Negeri Lhokseumawe
- Oracle Java Documentation: Object-Oriented Programming Concepts — https://docs.oracle.com/javase/tutorial/java/concepts/
- Oracle Java Documentation: Interfaces and Inheritance — https://docs.oracle.com/javase/tutorial/java/IandI/
- Amazon Corretto (OpenJDK Distribution) — https://aws.amazon.com/corretto/
- IntelliJ IDEA Community Edition — https://www.jetbrains.com/idea/