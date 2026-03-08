---
title: Laporan Lab 01 - Review Pemrograman Java
---

# Laporan Lab 01: Review Dasar Pemrograman Java

**Mata Kuliah:** Praktikum Design Pattern
**Nama:** Mizaul Arfan
**NIM:** 2024573010111
**Kelas:** TI 2A
**Prodi:** Teknik Informatika — Jurusan TIK, Politeknik Negeri Lhokseumawe

---

## Abstrak

Laporan ini membahas review dasar pemrograman Java yang mencakup sintaks dasar, variabel dan tipe data, operator dan ekspresi, percabangan (if-else dan switch-case), serta perulangan (for, while, do-while). Selain itu, laporan ini juga mendokumentasikan penyelesaian practice problem berupa program faktorial, bilangan prima, dan pola segitiga bintang, serta semua latihan yang diberikan pada modul. Tujuan laporan ini adalah membuktikan pemahaman terhadap konsep-konsep dasar Java sebagai fondasi untuk mempelajari Design Pattern.

---

## 1. Pengenalan Java dan Lingkungan Pengembangan

### Dasar Teori

Java adalah bahasa pemrograman berorientasi objek (OOP) yang populer dan banyak digunakan untuk pengembangan aplikasi desktop, web, dan mobile. Java menggunakan sintaks yang mirip dengan C++ namun dirancang agar lebih mudah dipahami dan digunakan.

Keunggulan utama Java:
- **Platform Independence** — Program Java dikompilasi menjadi *bytecode* yang dapat dijalankan di berbagai sistem operasi melalui JVM (*"Write once, run anywhere"*).
- **Strongly Typed** — Tipe data dicek secara ketat saat kompilasi sehingga mengurangi potensi error.
- **Rich Library** — Koleksi pustaka yang luas untuk berbagai kebutuhan.
- **Komunitas Besar** — Banyak dokumentasi, forum, dan sumber belajar yang aktif.

Komponen ekosistem Java:

| Komponen | Fungsi |
|----------|--------|
| **JDK** (Java Development Kit) | Toolset lengkap untuk pengembangan: kompilasi, debugging, utilities |
| **JRE** (Java Runtime Environment) | Lingkungan runtime untuk menjalankan aplikasi Java yang sudah dikompilasi |
| **JVM** (Java Virtual Machine) | Mesin virtual yang menjalankan bytecode; mengelola memori dan optimisasi JIT |
| **IDE** (Integrated Development Environment) | Lingkungan terpadu: editor kode, debugger, project management |

### Langkah Praktikum

1. Memastikan JDK (Amazon Corretto) dan IntelliJ IDEA Community Edition sudah terinstal.
2. Membuat project baru di IntelliJ dengan konfigurasi:
    - **Name:** `ti_design_pattern`
    - **Build system:** IntelliJ
    - **JDK:** Amazon Corretto
    - **Add sample code:** dinonaktifkan
3. Membuat package `praktikum_1` di dalam folder `src`.
4. Membuat class `HelloWorld` di dalam package `praktikum_1`.
5. Menuliskan dan menjalankan kode program.

### Kode Program

```java
package praktikum_1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Output Program


![Screenshot 2026-03-08 154143](https://hackmd.io/_uploads/Hycg9n9Kbg.png)



### Analisa dan Pembahasan

Program `HelloWorld` adalah program paling dasar di Java. Setiap program Java membutuhkan sebuah class dengan nama yang sama dengan nama file, serta method `main` sebagai titik masuk eksekusi program. `System.out.println()` digunakan untuk mencetak teks ke konsol diikuti dengan baris baru.

---

## 2. Variabel dan Tipe Data

### Dasar Teori

Variabel digunakan untuk menyimpan data dalam program. Setiap variabel memiliki tipe data yang menentukan jenis nilai yang dapat disimpan.

Tipe data dasar di Java:

| Tipe Data | Keterangan | Contoh |
|-----------|------------|--------|
| `int` | Bilangan bulat | `10`, `-5` |
| `double` | Bilangan desimal | `3.14`, `-0.5` |
| `boolean` | Nilai benar/salah | `true`, `false` |
| `char` | Karakter tunggal | `'A'`, `'1'` |
| `String` | Teks | `"Hello"` |

### Langkah Praktikum

1. Membuat class baru bernama `Variable` di dalam package `praktikum_1`.
2. Menuliskan kode deklarasi dan penggunaan variabel dengan berbagai tipe data.
3. Menjalankan program untuk melihat hasil.

### Kode Program

```java
package praktikum_1;

public class Variable {
    public static void main(String[] args) {
        int umur = 20;
        double tinggiBadan = 170.5;
        boolean aktif = true;
        char jenisKelamin = 'L';
        String nama = "Mizaul Arfan";

        System.out.println("Nama          : " + nama);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Tinggi Badan  : " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Status Aktif  : " + aktif);
    }
}
```

### Output Program

![Screenshot 2026-03-08 154031](https://hackmd.io/_uploads/S1sVcn9tWg.png)


### Latihan — Data Diri Lengkap

Membuat program untuk menampilkan data diri lengkap menggunakan tipe data yang tepat untuk setiap atribut.

**Kode Program** (`praktikum_1/latihan/DataDiri.java`):

```java
package praktikum_1.latihan;


public class dataDiri {
    public static void main(String[] args){
        String nama = "Mizaul Arfan";
        String tempatLahir = "Rangkaya";
        String tglLahir = "22-11-2005";
        char golDarah = 'A';
        int umur = 20;
        double tinggiBadan = 1.75;
        char Jkel = 'L';
        String agama = "Islam";
        String pekerjaan = "Mahasiswa";

        System.out.println("Nama: "+ nama);
        System.out.println("Tempat Lahir: "+ tempatLahir);
        System.out.println("Tanggal Lahir: "+ tglLahir);
        System.out.println("Golongan Darah: "+ golDarah);
        System.out.println("Umur: "+ umur);
        System.out.println("Tinggi Badan: "+ tinggiBadan);
        System.out.println("Jenis Kelamin: "+ Jkel);
        System.out.println("Agama: "+ agama);
        System.out.println("Pekerjaan: "+ pekerjaan);
    }
}

```

**Output:**


![image](https://hackmd.io/_uploads/SyV5525KWe.png)


### Analisa dan Pembahasan

Pemilihan tipe data yang tepat sangat penting dalam Java karena memengaruhi penggunaan memori dan operasi yang bisa dilakukan. Misalnya, `char` digunakan untuk golongan darah karena hanya satu karakter, sementara `double` digunakan untuk tinggi badan karena nilainya bisa desimal. Untuk jenis kelamin, `boolean` digunakan sebagai representasi biner (true/false) dengan ternary operator untuk menampilkan teks yang lebih informatif.

---

## 3. Operator dan Ekspresi

### Dasar Teori

Operator digunakan untuk melakukan operasi pada variabel dan nilai.

| Jenis Operator | Simbol |
|----------------|--------|
| Aritmatika | `+`, `-`, `*`, `/`, `%` |
| Perbandingan | `==`, `!=`, `>`, `<`, `>=`, `<=` |
| Logika | `&&` (AND), `\|\|` (OR), `!` (NOT) |

### Langkah Praktikum

1. Membuat class baru bernama `Operator` di dalam package `praktikum_1`.
2. Menuliskan kode yang mendemonstrasikan berbagai jenis operator.
3. Menjalankan program untuk melihat hasil.

### Kode Program

```java
package praktikum_1;

public class Operator {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b ));
        System.out.println("a == b = " + (a == b ));
        System.out.println("a > b = " + (a > b ));

    }
}

```

### Output Program


![Screenshot 2026-03-08 154534](https://hackmd.io/_uploads/H1u2535Kbl.png)


### Latihan — Luas Persegi Panjang

**Kode Program** (`praktikum_1/latihan/LuasPersegiPanjang.java`):

```java
package praktikum_1.latihan;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        double panjang = 12.5;
        double lebar   = 7.0;

        double luas = panjang * lebar;

        System.out.println("=== Hitung Luas Persegi Panjang ===");
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luas + " cm²");
    }
}
```

**Output:**


![Screenshot 2026-03-08 154729](https://hackmd.io/_uploads/SkvCqn9KZl.png)

### Analisa dan Pembahasan

Operator aritmatika bekerja seperti matematika biasa. Perlu diperhatikan bahwa pembagian dua nilai `int` di Java menghasilkan `int` (pembulatan ke bawah), bukan `double`. Itulah mengapa `10 / 3` menghasilkan `3`, bukan `3.33`. Untuk mendapatkan hasil desimal, salah satu operand harus bertipe `double`.

---

## 4. Percabangan (If-Else dan Switch-Case)

### Dasar Teori

Percabangan digunakan untuk mengambil keputusan berdasarkan kondisi.

**If-Else:**
```java
if (kondisi) {
    // Blok kode jika kondisi true
} else {
    // Blok kode jika kondisi false
}
```

**Switch-Case:**
```java
switch (variabel) {
    case nilai1:
        // Blok kode
        break;
    default:
        // Blok kode default
}
```

### Langkah Praktikum

1. Membuat class baru bernama `Percabangan` di dalam package `praktikum_1`.
2. Menuliskan kode yang mendemonstrasikan penggunaan if-else dan switch-case.
3. Menjalankan program untuk melihat hasil.

### Kode Program

```java
package praktikum_1;

public class percabangan {
    public static void main(String[] args){
        int nilai = 95;

        if(nilai >= 80){
            System.out.println("Selamat anda lulus");
        }
        else {
            System.out.println("Anda gagal");
        }
    }
}
```

### Output Program


![Screenshot 2026-03-08 154941](https://hackmd.io/_uploads/SJ9QshqtWl.png)


### Latihan — Genap atau Ganjil

**Kode Program** (`praktikum_1/latihan/GenapGanjil.java`):

```java
package praktikum_1.latihan;

public class ganjilGenap {
    public static void main(String[] args){
        int nilai = 95;

        if(nilai % 2 == 0 ){
            System.out.println("Ini adalah bilangan genap");
        }
        else {
            System.out.println("Ini adalah bilangan ganjil");
        }
    }
}
```

**Output:**


![Screenshot 2026-03-08 155051](https://hackmd.io/_uploads/r1Y4o39Fbe.png)


### Analisa dan Pembahasan

Percabangan memungkinkan program mengambil jalur eksekusi yang berbeda sesuai kondisi. Konsep kunci di sini adalah operator modulo (`%`): jika sisa pembagian suatu bilangan dengan 2 adalah 0, maka bilangan tersebut genap; jika tidak, ganjil. Switch-case lebih cocok digunakan ketika kondisi yang diperiksa berupa nilai diskrit yang pasti (seperti angka hari atau kode menu), sehingga kode lebih rapi dibandingkan if-else bertingkat.

---

## 5. Perulangan (For, While, Do-While)

### Dasar Teori

Perulangan digunakan untuk mengulang blok kode sebanyak yang diperlukan.

**For:**
```java
for (inisialisasi; kondisi; update) {
    // Blok kode yang diulang
}
```

**While:**
```java
while (kondisi) {
    // Blok kode yang diulang
}
```

**Do-While:**
```java
do {
    // Blok kode yang diulang
} while (kondisi);
```

### Langkah Praktikum

1. Membuat class baru bernama `Perulangan` di dalam package `praktikum_1`.
2. Menuliskan kode yang mendemonstrasikan ketiga jenis perulangan.
3. Menjalankan program untuk melihat hasil.

### Kode Program

```java
package praktikum_1;

public class Perulangan {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }
    }
}
```

### Output Program


![image](https://hackmd.io/_uploads/r103AhcKWl.png)



### Latihan — Bilangan Ganjil 1 sampai 20

Membuat program untuk mencetak bilangan ganjil dari 1 hingga 20 menggunakan tiga jenis perulangan.

**Kode Program** (`praktikum_1/latihan/BilanganGanjil.java`):

(`for-ganjil`)
```java
package praktikum_1.latihan;

public class ForGanjil {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 ==1) {
                System.out.println("bilangan ganjil iterasi ke- " + i);
            }
        }
    }
}
```
(`while-ganjil`)
```java
package praktikum_1.latihan;

public class whileganjil {
        public static void main(String[] args) {
            int i = 1;
            while (i <= 20) {
                    System.out.println("bilangan ganjil iterasi ke- " + i);
                i += 2;
            }
        }
}
```
(`doWhile-ganjil`)
```java
package praktikum_1.latihan;

public class doWhileganjil {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("bilangan ganjil iterasi ke- " + i);
            i += 2;
        }
        while (i <= 20); {
        }
    }
}
```

**Output:**


(`for`)
![image](https://hackmd.io/_uploads/rkGp23cKZl.png)

(`while`)
![image](https://hackmd.io/_uploads/rkxuna3cKZl.png)

(`do-while`)
![image](https://hackmd.io/_uploads/HyCqT2cKZl.png)



### Analisa dan Pembahasan

Ketiga jenis perulangan menghasilkan output yang sama namun memiliki perbedaan penting. `for` paling cocok digunakan ketika jumlah iterasi sudah diketahui sejak awal. `while` cocok untuk kondisi yang dievaluasi sebelum eksekusi dimulai. `do-while` menjamin blok kode dieksekusi minimal sekali karena kondisi dievaluasi di akhir. Pada latihan ini, penggunaan `i += 2` adalah cara efisien untuk melompati bilangan genap tanpa perlu kondisi tambahan.

---

## 6. Practice Problem dan Solusi

### Practice Problem 1 — Faktorial

Program untuk menghitung faktorial dari suatu bilangan.

**Kode Program** (`praktikum_1/Factorial.java`):

```java
package praktikum_1;

public class factorial {
    public static void main(String[] args){
        int n = 5;
        int hasil = 1;
        for (int i = 1; i<=n; i++){
            hasil *= i;
        }
        System.out.println("Faktorial dari " + n +" adalah "+ hasil);
    }
}
```

**Output:**


![image](https://hackmd.io/_uploads/Sy7-1a9Fbe.png)


**Analisa:** Faktorial dihitung dengan mengalikan semua bilangan bulat positif dari 1 hingga n. Tipe `long` digunakan sebagai penampung hasil karena nilai faktorial tumbuh sangat cepat dan bisa melebihi batas maksimum `int` (sekitar 2,1 miliar) bahkan untuk n yang relatif kecil, misalnya `13! = 6.227.020.800`.

---

### Practice Problem 2 — Bilangan Prima

Program untuk mengecek apakah suatu bilangan adalah bilangan prima.

**Kode Program** (`praktikum_1/Prima.java`):

```java
package praktikum_1;

public class Prima {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrima = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrima = false;
                break;
            }
        }

        System.out.println(n + (isPrima ? " adalah bilangan prima." : " bukan bilangan prima."));
    }
}
```

**Output:**


![](https://hackmd.io/_uploads/HyCmJTqKbx.png)


**Analisa:** Algoritma pengecekan prima yang efisien hanya perlu mengecek pembagi hingga akar kuadrat dari angka tersebut (`Math.sqrt(angka)`). Ini karena jika angka `n` memiliki faktor lebih besar dari `√n`, pasti ada faktor lain yang lebih kecil dari `√n`. Penggunaan `break` memastikan loop langsung berhenti begitu pembagi ditemukan, sehingga tidak ada komputasi yang sia-sia.

---

### Practice Problem 3 — Pola Segitiga Bintang

Program untuk mencetak pola segitiga menggunakan karakter `*`.

**Kode Program** (`praktikum_1/Segitiga.java`):

```java
package praktikum_1;

public class Segitiga {
    public static void main(String[] args) {
        int tinggi = 5;
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

**Output:**


![image](https://hackmd.io/_uploads/BkBH16cF-x.png)



**Analisa:** Program ini menggunakan *nested loop* (perulangan bersarang). Loop luar (`i`) mengontrol jumlah baris, sedangkan loop dalam (`j`) mengontrol jumlah bintang yang dicetak di setiap baris. Kunci algoritmanya adalah: pada baris ke-`i`, dicetak sebanyak `i` bintang. Pola ini merupakan fondasi dari berbagai pola lain yang lebih kompleks.

---

## 7. Kesimpulan

Melalui modul ini, dipelajari fondasi pemrograman Java yang mencakup:

1. **Lingkungan Pengembangan** — JDK, JRE, JVM, dan IDE adalah komponen inti ekosistem Java yang perlu dipahami sebelum mulai coding.
2. **Variabel dan Tipe Data** — Pemilihan tipe data yang tepat penting untuk efisiensi memori dan ketepatan operasi.
3. **Operator** — Java menyediakan operator aritmatika, perbandingan, dan logika yang menjadi dasar semua ekspresi.
4. **Percabangan** — `if-else` dan `switch-case` memungkinkan program mengambil keputusan secara dinamis.
5. **Perulangan** — `for`, `while`, dan `do-while` masing-masing cocok untuk skenario yang berbeda.
6. **Practice Problem** — Penerapan konsep-konsep di atas dalam program nyata memperkuat pemahaman dan kemampuan problem-solving.

Konsep-konsep ini menjadi pondasi yang sangat penting sebelum mempelajari materi yang lebih kompleks seperti OOP, array, method, dan Design Pattern.

---

## Referensi

- Modul Lab 01 — Review Pemrograman Java, Praktikum Design Pattern, Politeknik Negeri Lhokseumawe
- Oracle Java Documentation: Language Basics — https://docs.oracle.com/javase/tutorial/java/nutsandbolts/
- Amazon Corretto (OpenJDK Distribution) — https://aws.amazon.com/corretto/
- IntelliJ IDEA Community Edition — https://www.jetbrains.com/idea/