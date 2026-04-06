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

![image](https://hackmd.io/_uploads/H1V5UYGjWl.png)


### Latihan — Class Buku

Membuat class `Buku` dengan atribut `judul`, `penulis`, dan `tahunTerbit`, kemudian membuat objek dari class tersebut dan menampilkan informasinya.

**Kode Program** (`Main.java`):

```java
package praktikum_3.bagian_1.Latihan;

public class MainBuku {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);

        Buku buku2 = new Buku("Clean Code", "Robert C. Martin", 2008);

        buku1.tampilkanInfo();
        System.out.println();
        buku2.tampilkanInfo();
    }
}
```
(`Buku.java`):
```java
package praktikum_3.bagian_1.Latihan;

class Buku {
    String judul;
    String penulis;
    int tahunTerbit;

    Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilkanInfo() {
        System.out.println("Detail Buku:");
        System.out.println("Judul        : " + this.judul);
        System.out.println("Penulis      : " + this.penulis);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
    }
}
```

**Output:**

![image](https://hackmd.io/_uploads/rJT6UYMi-e.png)


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
package praktikum_3.bagian_2;

class Mahasiswa {
    // Atribut private
    private String nama;
    private int umur;

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi
    void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
```

**Main.java**
```java
package praktikum_3.bagian_2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengatur nilai menggunakan Setter
        mhs1.setNama("Budi");
        mhs1.setUmur(20);

        // Mengambil dan menampilkan nilai menggunakan Getter
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Umur: " + mhs1.getUmur());
    }
}
```

### Output Program

![image](https://hackmd.io/_uploads/SJuSwtMiWg.png)


### Latihan — Class Motor

Membuat class `Motor` dengan atribut `merk` dan `tahun` yang dienkapsulasi, beserta getter dan setter-nya.

**Kode Program** (`modul_3/latihan/latihan_1/Motor.java`):

```java
package praktikum_3.latihan;

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
```
```java
package praktikum_3.latihan;

public class MainMotor {
    public static void main(String[] args) {
        // Membuat objek Motor
        Motor motorSaya = new Motor();

        // Mengatur nilai menggunakan Setter
        motorSaya.setMerk("Honda PCX");
        motorSaya.setTahun(2023);

        // Mengambil dan menampilkan nilai menggunakan Getter
        System.out.println("--- Informasi Kendaraan ---");
        System.out.println("Merk Motor  : " + motorSaya.getMerk());
        System.out.println("Tahun Terbit: " + motorSaya.getTahun());
    }
}
```

**Output:**

![image](https://hackmd.io/_uploads/SyMjPYziWe.png)


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
![image](https://hackmd.io/_uploads/B1kr4KBiWe.png)


### Langkah Praktikum — Composition

1. Membuat package `komposisi` di dalam package `bagian_3`.
2. Membuat class `Mesin` sebagai komponen.
3. Membuat class `Mobil` yang menggunakan objek `Mesin` sebagai atribut.
4. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Composition

**Mesin.java**
```java
package praktikum_3.bagian_3.Komposisi;

class Mesin {
    void hidupkan() {
        System.out.println("Mesin menyala.");
    }

    void matikan() {
        System.out.println("Mesin dimatikan.");
    }
}
```

**Mobil.java**
```java
package praktikum_3.bagian_3.Komposisi;

class Mobil {
    private final Mesin mesin; // Composition

    public Mobil() {
        this.mesin = new Mesin(); // Membuat objek Mesin
    }

    void mulai() {
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan.");
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil berhenti.");
    }
}
```

**Main.java**
```java
package praktikum_3.bagian_3.Komposisi;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.mulai();
        mobil.berhenti();
    }
}
```

**Output:**
![image](https://hackmd.io/_uploads/BJaY9YHjWg.png)



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
![image](https://hackmd.io/_uploads/Bk3HwFHiZx.png)


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
package praktikum_3.bagian_4;

class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara.");
    }
}
```

**Kucing.java**
```java
package praktikum_3.bagian_4;

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
}
```

**Anjing.java**
```java
package praktikum_3.bagian_4;

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk Guk!");
    }
}

```

**Main.java**
```java
package praktikum_3.bagian_4;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing(); // Polymorphism
        Hewan hewan2 = new Anjing(); // Polymorphism

        hewan1.bersuara(); // Output: Meong!
        hewan2.bersuara(); // Output: Guk Guk!
    }
}
```

**Output:**
![image](https://hackmd.io/_uploads/SJ-latrj-e.png)


### Langkah Praktikum — Method Overloading

1. Membuat package `overloading` di dalam package `bagian_4`.
2. Membuat class `Kalkulator` dengan beberapa versi method `tambah()`.
3. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Method Overloading

**Kalkulator.java**
```java
package praktikum_3.bagian_4.overloading;

class Kalkulator {
    // Method overloading: penjumlahan dua bilangan bulat
    int tambah(int a, int b) {
        return a + b;
    }

    // Method overloading: penjumlahan tiga bilangan bulat
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading: penjumlahan dua bilangan desimal
    double tambah(double a, double b) {
        return a + b;
    }
}
```

**Main.java**
```java
package praktikum_3.bagian_4.overloading;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Hasil 1: " + kalkulator.tambah(5, 10)); // Output: 15
        System.out.println("Hasil 2: " + kalkulator.tambah(5, 10, 15)); // Output: 30
        System.out.println("Hasil 3: " + kalkulator.tambah(3.5, 2.5)); // Output: 6.0
    }
}
```

**Output:**
![image](https://hackmd.io/_uploads/HkWSCKSjZl.png)


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
![image](https://hackmd.io/_uploads/HJY1ycSjZl.png)


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
![image](https://hackmd.io/_uploads/Hkkj1cSjZg.png)


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
package praktikum_3.bagian_5.abstrak;

abstract class Hewan {
    // Atribut
    String nama;

    // Method konkret
    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    // Method abstrak
    abstract void bersuara();
}
```

**Kucing.java**
```java
package praktikum_3.bagian_5.abstrak;

// Subclass dari abstract class
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
}

```

**Anjing.java**
```java
package praktikum_3.bagian_5.abstrak;

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk Guk!");
    }
}
```

**Main.java**
```java
package praktikum_3.bagian_5.abstrak;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.makan(); // Method konkret dari abstract class
        kucing.bersuara(); // Method abstrak yang di-override

        Hewan anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.makan(); // Method konkret dari abstract class
        anjing.bersuara(); // Method abstrak yang di-override
    }
}
```

**Output:**
![image](https://hackmd.io/_uploads/HkDnl9Ho-g.png)


### Langkah Praktikum — Interface

1. Membuat package `antarmuka` di dalam package `bagian_5`.
2. Membuat interface `Bergerak` dengan method `bergerak()`.
3. Membuat class `Mobil` dan `Pesawat` yang mengimplementasikan interface `Bergerak`.
4. Membuat class `Main` untuk menguji hasilnya.

### Kode Program — Interface

**Bergerak.java**
```java
package praktikum_3.bagian_5.antarmuka;

// Interface
interface Bergerak {
    // Method abstrak
    void bergerak();

    // Method default (Java 8+)
    default void berhenti() {
        System.out.println("Berhenti bergerak.");
    }

    // Method static (Java 8+)
    static void info() {
        System.out.println("Ini adalah interface Bergerak.");
    }
}

```

**Mobil.java**
```java
package praktikum_3.bagian_5.antarmuka;

class Mobil implements Bergerak {
    @Override
    public void bergerak() {
        System.out.println("Mobil sedang melaju.");
    }
}
```

**Pesawat.java**
```java
package praktikum_3.bagian_5.antarmuka;

class Pesawat implements Bergerak {
    @Override
    public void bergerak() {
        System.out.println("Pesawat sedang terbang.");
    }
}
```

**Main.java**
```java
package praktikum_3.bagian_5.antarmuka;

public class Main {
    public static void main(String[] args) {
        Bergerak mobil = new Mobil();
        mobil.bergerak(); // Method dari interface
        mobil.berhenti(); // Method default dari interface

        Bergerak pesawat = new Pesawat();
        pesawat.bergerak(); // Method dari interface
        pesawat.berhenti(); // Method default dari interface

        Bergerak.info(); // Method static dari interface
    }
}
```

**Output:**
![image](https://hackmd.io/_uploads/S1DlDcSsbx.png)

### Langkah Praktikum — Interface
1. Di dalam package `bagian_5` buat sebuah class baru dan beri nama `Main`.
```java
package praktikum_3.bagian_5;

interface Terbang {
    void terbang();
}

// Abstract Class
abstract class Hewan {
    String nama;

    abstract void bersuara();
}

// Class yang mewarisi abstract class dan mengimplementasikan interface
class Burung extends Hewan implements Terbang {
    @Override
    void bersuara() {
        System.out.println("Kicau kicau!");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang.");
    }
}

public class Main {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.nama = "Merpati";
        burung.bersuara();
        burung.terbang();
    }
}
```
**Output:**
![image](https://hackmd.io/_uploads/HJX1t9Bs-l.png)


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
![image](https://hackmd.io/_uploads/B1JTYcSs-e.png)


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
package praktikum_3.bagian_6;

abstract class Tiket {
    private final String jenis;
    private final double harga;

    public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    // Abstract method untuk menghitung diskon
    public abstract double hitungDiskon();
}
```

**TiketReguler.java**
```java
package praktikum_3.bagian_6;

class TiketReguler extends Tiket {
    public TiketReguler() {
        super("Reguler", 100000); // Harga tiket reguler
    }

    @Override
    public double hitungDiskon() {
        return 0; // Tidak ada diskon untuk tiket reguler
    }
}
```

**TiketVIP.java**
```java
package praktikum_3.bagian_6;

class TiketVIP extends Tiket {
    public TiketVIP() {
        super("VIP", 250000); // Harga tiket VIP
    }

    @Override
    public double hitungDiskon() {
        return 0.1 * getHarga(); // Diskon 10% untuk tiket VIP
    }
}
```

**Pesanan.java**
```java
package praktikum_3.bagian_6;

class Pesanan {
    private final String namaPemesan;
    private final Tiket tiket;
    private final int jumlah;

    public Pesanan(String namaPemesan, Tiket tiket, int jumlah) {
        this.namaPemesan = namaPemesan;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public int getJumlah() {
        return jumlah;
    }

    // Menghitung total harga setelah diskon
    public double hitungTotal() {
        double total = tiket.getHarga() * jumlah;
        double diskon = tiket.hitungDiskon() * jumlah;
        return total - diskon;
    }

    // Menampilkan detail pesanan
    public void displayDetail() {
        System.out.println("\nDetail Pesanan:");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Jenis Tiket: " + tiket.getJenis());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: Rp" + hitungTotal());
    }
}

```

**KonferensiApp.java**
```java
package praktikum_3.bagian_6;

import java.util.ArrayList;
import java.util.Scanner;

public class KonferensiApp {
    private static final ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Aplikasi Pemesanan Tiket Konferensi ===");
            System.out.println("1. Lihat Daftar Tiket");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Detail Pesanan");
            System.out.println("4. Batalkan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    lihatDaftarTiket();
                    break;
                case 2:
                    pesanTiket();
                    break;
                case 3:
                    lihatDetailPesanan();
                    break;
                case 4:
                    batalkanPesanan();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void lihatDaftarTiket() {
        System.out.println("\nDaftar Tiket:");
        System.out.println("1. Tiket Reguler - Rp100.000");
        System.out.println("2. Tiket VIP - Rp250.000 (Diskon 10%)");
    }

    private static void pesanTiket() {
        System.out.print("\nMasukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();

        System.out.print("Pilih jenis tiket (1: Reguler, 2: VIP): ");
        int jenisTiket = scanner.nextInt();
        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = scanner.nextInt();

        Tiket tiket = null;
        switch (jenisTiket) {
            case 1:
                tiket = new TiketReguler();
                break;
            case 2:
                tiket = new TiketVIP();
                break;
            default:
                System.out.println("Jenis tiket tidak valid.");
                return;
        }

        Pesanan pesanan = new Pesanan(namaPemesan, tiket, jumlah);
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan berhasil dibuat!");
        pesanan.displayDetail();
    }

    private static void lihatDetailPesanan() {
        if (isNoPesanan()) return;

        System.out.print("Pilih nomor pesanan untuk melihat detail: ");
        int nomorPesanan = scanner.nextInt();
        if (nomorPesanan > 0 && nomorPesanan <= daftarPesanan.size()) {
            daftarPesanan.get(nomorPesanan - 1).displayDetail();
        } else {
            System.out.println("Nomor pesanan tidak valid.");
        }
    }

    private static boolean isNoPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("\nBelum ada pesanan.");
            return true;
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < daftarPesanan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPesanan.get(i).getNamaPemesan());
        }
        return false;
    }

    private static void batalkanPesanan() {
        if (isNoPesanan()) return;

        System.out.print("Pilih nomor pesanan yang ingin dibatalkan: ");
        int nomorPesanan = scanner.nextInt();
        if (nomorPesanan > 0 && nomorPesanan <= daftarPesanan.size()) {
            daftarPesanan.remove(nomorPesanan - 1);
            System.out.println("Pesanan berhasil dibatalkan.");
        } else {
            System.out.println("Nomor pesanan tidak valid.");
        }
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
5. Keluar
Pilih menu: 1

Daftar Tiket:
1. Tiket Reguler - Rp100.000
2. Tiket VIP - Rp250.000 (Diskon 10%)

=== Aplikasi Pemesanan Tiket Konferensi ===
1. Lihat Daftar Tiket
2. Pesan Tiket
3. Lihat Detail Pesanan
4. Batalkan Pesanan
5. Keluar
Pilih menu: 2

Masukkan nama pemesan: arfan
Pilih jenis tiket (1: Reguler, 2: VIP): 2
Masukkan jumlah tiket: 3
Pesanan berhasil dibuat!

Detail Pesanan:
Nama Pemesan: arfan
Jenis Tiket: VIP
Jumlah: 3
Total Harga: Rp675000.0

=== Aplikasi Pemesanan Tiket Konferensi ===
1. Lihat Daftar Tiket
2. Pesan Tiket
3. Lihat Detail Pesanan
4. Batalkan Pesanan
5. Keluar
Pilih menu: 3

Daftar Pesanan:
1. arfan
Pilih nomor pesanan untuk melihat detail: 1

Detail Pesanan:
Nama Pemesan: arfan
Jenis Tiket: VIP
Jumlah: 3
Total Harga: Rp675000.0

=== Aplikasi Pemesanan Tiket Konferensi ===
1. Lihat Daftar Tiket
2. Pesan Tiket
3. Lihat Detail Pesanan
4. Batalkan Pesanan
5. Keluar
Pilih menu: 4

Daftar Pesanan:
1. arfan
Pilih nomor pesanan yang ingin dibatalkan: 1
Pesanan berhasil dibatalkan.

=== Aplikasi Pemesanan Tiket Konferensi ===
1. Lihat Daftar Tiket
2. Pesan Tiket
3. Lihat Detail Pesanan
4. Batalkan Pesanan
5. Keluar
Pilih menu: 3

Belum ada pesanan.

=== Aplikasi Pemesanan Tiket Konferensi ===
1. Lihat Daftar Tiket
2. Pesan Tiket
3. Lihat Detail Pesanan
4. Batalkan Pesanan
5. Keluar
Pilih menu: 5
Terima kasih telah menggunakan aplikasi ini.

Process finished with exit code 0

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