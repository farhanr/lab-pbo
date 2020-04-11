package Tugas_1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean pilihan = true;
        while(pilihan == true){
            System.out.println("==== Bangun Ruang ====");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Prisma Segitiga");
            System.out.println("4. Bola");
            System.out.println("5. Tabung");
            System.out.println();
            System.out.println("==== Bangun Datar ====");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Trapesium");
            System.out.println();
            System.out.print("Masukkan pilihan anda = ");
            int choose = input.nextInt();
            System.out.println();

            switch (choose){
                case 1 :
                    Kubus kubus = new Kubus();
                    kubus.sisi = 2;
                    kubus.luas();
                    kubus.volume();
                    break;
                case 2:
                    Balok balok = new Balok();
                    balok.panjang = 2;
                    balok.tinggi = 3;
                    balok.lebar = 4;
                    balok.luas();
                    balok.volume();
                    break;
                case 3:
                    PrismaSegitiga prisma = new PrismaSegitiga();
                    prisma.alas = 6;
                    prisma.tinggi = 7;
                    prisma.ts = 10;
                    prisma.luas();
                    prisma.volume();
                    break;
                case 4:
                    Bola bola = new Bola();
                    bola.r = 22;
                    bola.luas();
                    bola.volume();
                    break;
                case 5:
                    Tabung tabung = new Tabung();
                    tabung.r = 22;
                    tabung.tinggi = 10;
                    tabung.luas();
                    tabung.volume();
                    break;
                case 6:
                    Persegi persegi = new Persegi();
                    persegi.sisi = 2;
                    persegi.luas();
                    persegi.keliling();
                    break;
                case 7:
                    PersegiPanjang persegiPanjang = new PersegiPanjang();
                    persegiPanjang.panjang = 8;
                    persegiPanjang.lebar = 4;
                    persegiPanjang.luas();
                    persegiPanjang.keliling();
                    break;
                case 8:
                    Lingkaran lingkaran = new Lingkaran();
                    lingkaran.r = 22;
                    lingkaran.luas();
                    lingkaran.keliling();
                    break;
                case 9:
                    Segitiga mSegitiga = new Segitiga();
                    mSegitiga.alas = 12;
                    mSegitiga.tinggi = 8;
                    mSegitiga.sisi = 4;
                    mSegitiga.luas();
                    mSegitiga.keliling();
                    break;
                case 10:
                    Trapesium trapesium = new Trapesium();
                    trapesium.a = 3;
                    trapesium.b = 4;
                    trapesium.t = 10;
                    trapesium.A = 2;
                    trapesium.B = 4;
                    trapesium.C = 5;
                    trapesium.D = 8;
                    trapesium.luas();
                    trapesium.keliling();
                    break;
            }
            System.out.println();
            System.out.println("Apakah anda ingin mengulangi proses?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            int yesNo = input.nextInt();
            if(yesNo == 1){
                pilihan = true;
            }
            else{
                pilihan = false;
                break;
            }
        }
    }
}
