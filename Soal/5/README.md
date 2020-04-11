## TUGAS PRAKTIKUM PERTEMUAN 5: ABSTRACT CLASS & INTERFACE
![Skema](https://raw.githubusercontent.com/farhanr/lab-pbo/master/Soal/5/assets/skema-diagram.png)
### Keterangan
Dari skema diatas terdapat:
* Sebuah kelas abstrak: Converter.
* Tiga interface: Data, Distance, dan Temperature.
* Tiga kelas biasa: ConverterData, ConverterDistance, dan ConverterTemperature.

  ConverterData, ConverterDistance, dan ConverterTemperature meng-extend dan mengimplementasikan kelas abstract & interface sesuai skema diatas.
  
  
  Contoh: ConverterData meng-extends Converter dan mengimplementasi interface Data.
### Petunjuk
1. Buat semua kelas yang akan di-extends maupun diimplementasikan berdasarkan skema gambar diatas.
2. Lengkapi seluruh method yang akan diimplementasikan. Penjelasan method ada diakhir halaman ini**.
3. Tidak perlu membuat Class Main sendiri, cukup jalankan method `main()` dari kelas berikut: [Main Class](../5/assets/Main.java)

### Output
**Jika seluruh implementasi kode sudah sesuai, ketika main method dijalankan maka akan menghasilkan output sebagai berikut:**
* seluruh method sesuai dengan pengkondisian di main method kelas Main.

```
Data Converter is started
Terabyte To Gigabyte = OK
Terabyte To Megabyte = OK
Terabyte To Kilobyte = OK
Data Converter is terminated

Temperature Converter is started
Celcius to Fahrenheit = OK
Celcius to Kelvin = OK
Temperature Converter is terminated

Distance Converter is started
Inch to Metre = OK
Metre to Kilometre = OK
Metre to Millimetre = OK
Distance Converter is terminated
```
___
**Jika ada salah satu pengimplementasian yang tidak benar, maka output dari main method seperti berikut:**
* kondisi dimana method `teraToGiga()` menghasilkan output yang salah

```
Data Converter is started
Terabyte To Gigabyte = INCORRECT
```
* kondisi dimana method `celciusToKevin()` menghasilkan output yang salah:

```
Data Converter is started
Terabyte To Gigabyte = OK
Terabyte To Megabyte = OK
Terabyte To Kilobyte = OK
Data Converter is terminated

Temperature Converter is started
Celcius to Fahrenheit = OK
Celcius to Kelvin = INCORRECT
```
* kondisi dimana method `metreToMilli()` menghasilkan output yang salah

```
Data Converter is started
Terabyte To Gigabyte = OK
Terabyte To Megabyte = OK
Terabyte To Kilobyte = OK
Data Converter is terminated

Temperature Converter is started
Celcius to Fahrenheit = OK
Celcius to Kelvin = OK
Temperature Converter is terminated

Distance Converter is started
Inch to Metre = OK
Metre to Kilometre = OK
Metre to Millimetre = INCORRECT
```
### Penjelasan Method
* (abstract) `start()`: menghasilkan output `"... is started"`, tugas kalian adalah mengganti `...` sesuai nama kelasnya.
* (abstract) `start()`: menghasilkan output `"... is terminated"`, tugas kalian adalah mengganti `...` sesuai nama kelasnya.
___
* `celciusToFahrenheit()`: mengkonversi parameter dari celcius ke fahrenheit.
* `celciusToKelvin()`: mengkonversi parameter dari celcius ke kelvin.
___
* `teraToGiga()`: mengkonversi parameter dari Terabyte ke GigaByte.
* `teraToMega()`: mengkonversi parameter dari Terabyte ke MegaByte.
* `teraToKilo()`: mengkonversi parameter dari Terabyte ke KiloByte.
___
* `metreToKilo()`: mengkonversi parameter dari satuan meter ke kilometer.
* `metreToMilli()`: mengkonversi parameter dari satuan meter ke milimeter.
* `inchToMetre()`: mengkonversi parameter dari inci ke meter.

### Note
Hal yang kurang jelas bisa ditanyakan ke asisten lab.


Main method dari kelas Main hanya sebagai test cases untuk method yang ada, jika kalian mempunyai ide yang lain untuk tugas ini silahkan ubah main method sesuai kemauan masing-masing (atau bertanya pada asisten lab). Hal yang harus dipahami dari tugas ini adalah bagaimana cara kerja kelas abstrak dan interface pada Java.
