/**
 * Main
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int next,pilih,tinggi,alas,a,b,c,d,d1,d2;
        double r;
        boolean cek = true;
        try {
            do {
                System.out.printf("==== MENU ====\n1. BANGUN DATAR\n2. BANGUN RUANG\n\n0.KELUAR\n");
                System.out.print(">");
                int menu = input.nextInt();
                    switch (menu){
                        case 1:
                            System.out.printf("====== BANGUN DATAR ======\n1. PERSEGI\n2. PERSEGI PANJANG\n3. LINGKARAN\n4. SEGITIGA\n5. TRAPESIUM\n6. JAJARGENJANG\n7. BELAH KETUPAT\n8. LAYANG-LAYANG\n\n99. MENU\n0.KELUAR\n");
                            System.out.print(">");
                            pilih = input.nextInt();
                            switch (pilih) {
                                case 1:
                                    System.out.print("Masukkan Panjang Sisi Persegi = ");
                                    Persegi persegi = new Persegi(input.nextInt());
                                    persegi.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.print("Masukkan Panjang = ");
                                    int p = input.nextInt();
                                    System.out.print("Masukkan Lebar = ");
                                    int l = input.nextInt();

                                    PersegiPanjang pp = new PersegiPanjang(p,l);
                                    pp.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.print("Masukkan Jari-jari = ");
                                    r = input.nextDouble();

                                    Lingkaran lingkaran = new Lingkaran(r);
                                    lingkaran.info();
                                    
                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 4:
                                    System.out.println("*Mencari Luas Segitiga :");
                                    System.out.print("Masukkan Alas = ");
                                    alas = input.nextInt();
                                    System.out.print("Masukkan Tinggi = ");
                                    tinggi = input.nextInt();

                                    System.out.println("\n*Mencari Keliling Segitiga");
                                    System.out.print("Masukkan panjang sisi A = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi B = ");
                                    b = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi C = ");
                                    c = input.nextInt();

                                    Segitiga segitiga = new Segitiga(alas, tinggi,a,b,c);
                                    segitiga.info();
                                
                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 5:
                                    System.out.println("\n*Mencari Luas Segitiga");
                                    System.out.print("Masukkan Panjang Sisi Sejajar 1 = ");
                                    int sisiA = input.nextInt();
                                    System.out.print("Masukkan Panjang Sisi Sejajar 2 = ");
                                    int sisiB = input.nextInt();
                                    System.out.print("Masukkan Tinggi Trapesium = ");
                                    tinggi = input.nextInt();

                                    System.out.println("\n*Mencari Keliling Segitiga");
                                    System.out.print("Masukkan panjang sisi A = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi B = ");
                                    b = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi C = ");
                                    c = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi C = ");
                                    d = input.nextInt();

                                    Trapesium trapesium = new Trapesium(sisiA, sisiB, tinggi, a, b, c, d);
                                    trapesium.info();
                                    
                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 6:
                                    System.out.println("*Mencari Luas Jajargenjang :");
                                    System.out.print("Masukkan Alas = ");
                                    alas = input.nextInt();
                                    System.out.print("Masukkan Tinggi = ");
                                    tinggi = input.nextInt();

                                    System.out.println("\n*Mencari Keliling Jajargenjang");
                                    System.out.print("Masukkan panjang sisi A = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi B = ");
                                    b = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi C = ");
                                    c = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi C = ");
                                    d = input.nextInt();

                                    Jajargenjang jajargenjang = new Jajargenjang(alas, tinggi, a, b, c, d);
                                    jajargenjang.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 7:
                                    System.out.println("*Mencari Luas BelahKetupat :");
                                    System.out.print("Masukkan panjang Diagonal 1 = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan panjang Diagonal 2 = ");
                                    b = input.nextInt();

                                    System.out.println("\n*Mencari Keliling BelahKetupat");
                                    System.out.print("Masukkan panjang sisi = ");
                                    c = input.nextInt();

                                    BelahKetupat belahKetupat = new BelahKetupat(a, b, c);
                                    belahKetupat.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 8:
                                    System.out.println("*Mencari Luas Layang-Layang :");
                                    System.out.print("Masukkan panjang Diagonal 1 = ");
                                    d1 = input.nextInt();
                                    System.out.print("Masukkan panjang Diagonal 2 = ");
                                    d2 = input.nextInt();
                                    System.out.println("\n*Mencari Keliling Layang-Layang :");
                                    System.out.print("Masukkan panjang sisi A = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi B = ");
                                    b = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi C = ");
                                    c = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi C = ");
                                    d = input.nextInt();

                                    LayangLayang layangLayang = new LayangLayang(d1, d2, a, b, c, d);
                                    layangLayang.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 99:
                                    cek = true;
                                    break;
                                case 0:
                                    cek = false;
                                    break;
                                default:
                                    System.out.println("-------- Inputan Invalid --------");
                                    break;
                            }
                            break;
                    
                        case 2:
                            System.out.printf("====== BANGUN RUANG ======\n1. KUBUS\n2. BALOK\n3. PRISMA SEGITIGA\n4. BOLA\n5. TABUNG\n6. KERUCUT\n7. LIMAS SEGITIGA\n8. LIMAS SEGIEMPAT\n\n0.KELUAR\n");
                            System.out.print(">");
                            pilih = input.nextInt();
                            switch (pilih) {
                                case 1:
                                    System.out.print("Masukkan panjang sisi Kubus = ");
                                    a = input.nextInt();
                                    Kubus kubus = new Kubus(a);
                                    kubus.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.print("Masukkan Panjang = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan Lebar = ");
                                    b = input.nextInt();
                                    System.out.print("Masukkan Tinggi = ");
                                    c = input.nextInt();

                                    Balok balok = new Balok(a, b, c);
                                    balok.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.print("Masukkan Panjang alas segitiga = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan tinggi segitiga = ");
                                    b = input.nextInt();
                                    System.out.print("Masukkan Tinggi Prisma = ");
                                    c = input.nextInt();

                                    PrismaSegitiga prismaSegitiga = new PrismaSegitiga(a, b, c);
                                    prismaSegitiga.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 4:
                                    System.out.print("Masukkan Jari-jari Bola = ");
                                    r = input.nextDouble();

                                    Bola bola = new Bola(r);
                                    bola.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 5:
                                    System.out.print("Masukkan Jari-Jari Alas Tabung = ");
                                    r = input.nextDouble();
                                    System.out.print("Masukkan Tinggi Tabung = ");
                                    a = input.nextInt();

                                    Tabung tabung = new Tabung(r, a);
                                    tabung.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 6:
                                    System.out.print("Masukkan Jari-Jari Alas Kerucut = ");
                                    r = input.nextDouble();
                                    System.out.print("Masukkan Tinggi Kerucut = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan Panjang sisi miring Kerucut = ");
                                    b = input.nextInt();

                                    Kerucut kerucut = new Kerucut(r, a, b);
                                    kerucut.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 7:
                                    System.out.println("*Mencari Volume Limas Segitiga :");
                                    System.out.print("Masukkan panjang alas Segitiga = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan tinggi Alas Segitiga = ");
                                    b = input.nextInt();
                                    System.out.print("Masukkan tinggi Limas Segitiga = ");
                                    c = input.nextInt();
                                    
                                    System.out.println("\n*Mencari Luas Permukaan Limas Segitiga :");
                                    System.out.print("Masukkan panjang Alas Segitiga-1 = ");
                                    alas = input.nextInt();
                                    System.out.print("Masukkan tinggi Segitiga-1 = ");
                                    tinggi = input.nextInt();
                                    System.out.print("Masukkan Panjang Alas segitiga-2 = ");
                                    d1 = input.nextInt();
                                    System.out.print("Masukkan tinggi Segitiga-2 = ");
                                    d2 = input.nextInt();
                                    System.out.print("Masukkan Panjang Alas Segitiga-3 = ");
                                    d = input.nextInt();
                                    System.out.print("Masukkan tinggi Segitiga-3 = ");
                                    next = input.nextInt();

                                    LimasSegitiga limasSegitiga = new LimasSegitiga(a, b, c, alas, tinggi, d1, d2, d, next);
                                    limasSegitiga.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 8:
                                    System.out.println("*Mencari Volume Limas Segiempat");
                                    System.out.print("Masukkan Panjang = ");
                                    int p = input.nextInt();
                                    System.out.print("Masukkan Lebar = ");
                                    int l= input.nextInt();
                                    System.out.print("Masukkan Tinggi Limas Segiempat = ");
                                    int t = input.nextInt();

                                    System.out.println("\n*Mencari Luas Permukaan Limas Segiempat :");
                                    System.out.print("Masukkan panjang Alas Segitiga-1 = ");
                                    alas = input.nextInt();
                                    System.out.print("Masukkan tinggi Segitiga-1 = ");
                                    tinggi = input.nextInt();
                                    System.out.print("Masukkan Panjang Alas segitiga-2 = ");
                                    a = input.nextInt();
                                    System.out.print("Masukkan tinggi Segitiga-2 = ");
                                    b = input.nextInt();
                                    System.out.print("Masukkan Panjang Alas Segitiga-3 = ");
                                    c = input.nextInt();
                                    System.out.print("Masukkan tinggi Segitiga-3 = ");
                                    d = input.nextInt();
                                    System.out.print("Masukkan Panjang Segitiga-4 = ");
                                    d1 = input.nextInt();
                                    System.out.print("Masukkan tinggi Segitiga-4 = ");
                                    d2 = input.nextInt();
                                    
                                    LimasSegiempat limasSegiempat = new LimasSegiempat(p, l, t, alas, tinggi, a, b, c, d, d1, d2);
                                    limasSegiempat.info();

                                    System.out.println("\n99. MENU\n0. KELUAR");
                                    System.out.print(">");
                                    next = input.nextInt();
                                    switch (next) {
                                        case 99:
                                            cek = true;
                                            break;
                                        case 0:
                                            cek = false;
                                            break;
                                        default:
                                            System.out.println("---- Inputan invalid ----");
                                            break;
                                    }
                                    break;
                                case 99:
                                    cek = true;
                                    break;
                                case 0:
                                    cek = false;
                                    break;
                                default:
                                    System.out.println("-------- Inputan Invalid --------");
                                    break;
                            }
                            break;
                        case 0:
                            cek = false;
                            input.close();
                            break;
                        default:
                            System.out.println("-------- Inputan Invalid --------");
                            break;
                    }

            }
            while(cek);
            
        } 
        catch (InputMismatchException e) {
            System.out.println("------ Invalid Input ------");
        }
    }   
}