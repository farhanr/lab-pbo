import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Bangun Ruang");
        System.out.println("2. Bangun Datar");
        System.out.println();

        int menu = in.nextInt();
        switch (menu) {
            case 1:
                System.out.println("BANGUN RUANG");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Prisma Segitiga");
                System.out.println("4. Bola");
                System.out.println("5. Tabung");

                int br = in.nextInt();
                switch (br) {
                    case 1:
                        System.out.print("Input sisi: ");
                        double s = in.nextDouble();
                        Kubus kb = new Kubus(s);
                        System.out.println();
                        System.out.println("Luas permukaan kubus adalah " + kb.luasPermukaan());
                        System.out.println("Volume kubus adalah " + kb.volume());
                        break;

                    case 2:
                        System.out.print("Input panjang: ");
                        double p = in.nextDouble();
                        System.out.print("Input lebar: ");
                        double l = in.nextDouble();
                        System.out.print("Input tinggi: ");
                        double t = in.nextDouble();
                        Balok bal = new Balok(p, l, t);
                        System.out.println();
                        System.out.println("Luas permukaan balok adalah " + bal.luasPermukaan());
                        System.out.println("Volume balok adalah " + bal.volume());
                        break;

                    case 3:
                        System.out.print("Input luas alas: ");
                        double la = in.nextDouble();
                        System.out.print("Input keliling alas: ");
                        double ka = in.nextDouble();
                        System.out.print("Input tinggi: ");
                        double t2 = in.nextDouble();
                        PrismaSegitiga ps = new PrismaSegitiga(la, ka, t2);
                        System.out.println();
                        System.out.println("Luas permukaan prisma segitiga adalah " + ps.luasPermukaan());
                        System.out.println("Volume prisma segitiga adalah " + ps.volume());
                        break;

                    case 4:
                        System.out.print("Input jari-jari: ");
                        double r = in.nextDouble();
                        Bola bola = new Bola(r);
                        System.out.println();
                        System.out.println("Luas permukaan bola adalah " + bola.luasPermukaan());
                        System.out.println("Volume bola adalah " + bola.volume());
                        break;

                    case 5:
                        System.out.print("Input jari=jari: ");
                        double r2 = in.nextDouble();
                        System.out.print("Input tinggi: ");
                        double t3 = in.nextDouble();
                        Tabung tb = new Tabung(r2, t3);
                        System.out.println();
                        System.out.println("Luas permukaan tabung adalah " + tb.luasPermukaan());
                        System.out.println("Volume tabung adalah " + tb.volume());
                        break;
                }
                break;

            case 2:
                System.out.println("BANGUN DATAR");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Lingkaran");
                System.out.println("4. Segitiga");
                System.out.println("5. Trapesium");

                int bd = in.nextInt();
                switch (bd) {
                    case 1:
                        System.out.print("Input sisi: ");
                        double sisi = in.nextDouble();
                        Persegi pers = new Persegi(sisi);
                        System.out.println();
                        System.out.println("Luas persegi adalah " + pers.luas());
                        System.out.println("Keliling persegi adalah " + pers.keliling());
                        break;

                    case 2:
                        System.out.print("Input panjang: ");
                        double panjang = in.nextDouble();
                        System.out.print("Input lebar: ");
                        double lebar = in.nextDouble();
                        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                        System.out.println();
                        System.out.println("Luas persegi panjang adalah " + pp.luas());
                        System.out.println("Keliling persegi panjang adalah " + pp.keliling());
                        break;

                    case 3:
                        System.out.print("Input jari-jari: ");
                        double jari = in.nextDouble();
                        Lingkaran lk = new Lingkaran(jari);
                        System.out.println();
                        System.out.println("Luas lingkaran adalah " + lk.luas());
                        System.out.println("Keliling lingkaran adalah " + lk.keliling());
                        break;

                    case 4:
                        System.out.print("Input alas: ");
                        double alas = in.nextDouble();
                        System.out.print("Input tinggi: ");
                        double tinggi = in.nextDouble();
                        System.out.print("Input sisi 1: ");
                        double sisi1 = in.nextDouble();
                        System.out.print("Input sisi 2: ");
                        double sisi2 = in.nextDouble();
                        Segitiga st = new Segitiga(alas, tinggi, sisi1, sisi2);
                        System.out.println();
                        System.out.println("Luas persegi adalah " + st.luas());
                        System.out.println("Keliling persegi adalah " + st.keliling());
                        break;

                    case 5:
                        System.out.print("Input tinggi: ");
                        double tinggi1 = in.nextDouble();
                        System.out.print("Input sisi sejajar 1: ");
                        double sisiSj1 = in.nextDouble();
                        System.out.print("Input sisi sejajar 2: ");
                        double sisiSj2 = in.nextDouble();
                        System.out.print("Input sisi lain: ");
                        double sisiLain = in.nextDouble();
                        Trapesium tp = new Trapesium(tinggi1, sisiSj1, sisiSj2, sisiLain);
                        System.out.println();
                        System.out.println("Luas trapesium adalah " + tp.luas());
                        System.out.println("Keliling trapesium adalah " + tp.keliling());
                        break;
                }
                in.close();
        }
    }
}