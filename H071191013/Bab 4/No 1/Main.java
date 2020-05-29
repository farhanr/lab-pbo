import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== MENU =====");
        System.out.println("1. Bangun Ruang");
        System.out.println("2. Bangun Datar");
        System.out.print("Input : ");
        int input1 = sc.nextInt();
        if (input1 == 1){
            System.out.println("======================");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Prisma Segitiga");
            System.out.println("4. Bola");
            System.out.println("5. Tabung");
            System.out.println("6. Kerucut");
            System.out.println("7. Limas Segiempat");

            System.out.print("Input : ");
            int input11 = sc.nextInt();
            if (input11 == 1){
                System.out.println("Input Sisi : ");
                double s = sc.nextDouble();
                Kubus cube = new Kubus(s);
                System.out.println("Volume Kubus : " + cube.volume());
                System.out.println("Luas Permukaan Kubus : " + cube.luasPermukaan());
            }
            else if (input11 == 2){
                System.out.println("Input Panjang : ");
                double p = sc.nextDouble();
                System.out.println("Input Lebar : ");
                double l = sc.nextDouble();
                System.out.println("Input Tinggi : ");
                double t = sc.nextDouble();
                Balok block = new Balok(p, l, t);
                System.out.println("Volume Balok : " + block.volume());
                System.out.println("Luas Permukaan Balok : " + block.luasPermukaan());
            }
            else if (input11 == 3){
                System.out.println("Input Luas Alas : ");
                double alas = sc.nextDouble();
                System.out.println("Input Keliling Alas : ");
                double keliling = sc.nextDouble();
                System.out.println("Input Tinggi : ");
                double t = sc.nextDouble();
                PrismaSegitiga prismTriangular = new PrismaSegitiga(alas, keliling, t);
                System.out.println("Volume Prisma Segitiga : " + prismTriangular.volume());
                System.out.println("Luas Permukaan Prisma Segitiga : " + prismTriangular.luasPermukaan());
            }
            else if (input11 == 4){
                System.out.println("Input Jari-Jari : ");
                double jari = sc.nextDouble();
                Bola ball = new Bola(jari);
                System.out.printf("Volume Bola : %.2f\n" ,ball.volume() );
                System.out.printf("Luas Permukaan Bola : %.2f " ,ball.luasPermukaan());
            }
            else if (input11 == 5){
                System.out.println("Input Jari-Jari : ");
                double jari = sc.nextDouble();
                System.out.println("Input Tinggi : ");
                double t = sc.nextDouble();
                Tabung tube = new Tabung(jari, t);
                System.out.printf("Volume Tabung : %.2f\n",tube.volume());
                System.out.printf("Luas Permukaan Tabung : %.2f", tube.luasPermukaan());
            }
            else if (input11 == 6){
                System.out.println("Input Jari-Jari : ");
                double jari = sc.nextDouble();
                System.out.println("Input Tinggi : ");
                double tinggi = sc.nextDouble();
                System.out.println("Input Sisi Selimut : ");
                double selimut = sc.nextDouble();
                Kerucut cone = new Kerucut(jari, tinggi, selimut);
                System.out.printf("Volume Kerucut : %.2f\n",cone.volume());
                System.out.printf("Luas Permukaan Kerucut : %.2f",cone.luasPermukaan());
            }
            else if (input11 == 7){
                System.out.println("Input Panjang : ");
                double p = sc.nextDouble();
                System.out.println("Input Lebar : ");
                double l = sc.nextDouble();
                System.out.println("Input Tinggi : ");
                double t = sc.nextDouble();
                LimasSegiEmpat pyramid = new LimasSegiEmpat(p, l, t);
                System.out.println("Volume Limas Segiempat : " + pyramid.volume());
                System.out.printf("Luas Permukaan Limas Segiempat : %.2f",pyramid.luasPermukaan());
            }
            else{
                System.out.println("Inputan Salah");
            }
        }else if (input1 == 2){
            System.out.println("=====================");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Trapesium");
            System.out.println("6. Layang-Layang");
            System.out.println("7. Jajargenjang");

            System.out.print("Input : ");
            int input12 = sc.nextInt();
            if (input12 == 1){
                System.out.println("Input Sisi : ");
                double s = sc.nextDouble();
                Persegi square = new Persegi(s);
                System.out.println("Keliling Persegi : " + square.keliling());
                System.out.println("Luas Persegi : " + square.luas());
            }
            else if (input12 == 2){
                System.out.println("Input Panjang : ");
                double p = sc.nextDouble();
                System.out.println("Input Lebar : ");
                double l = sc.nextDouble();
                PersegiPanjang rectangle = new PersegiPanjang(p, l);
                System.out.println("Keliling Persegi Panjang : " + rectangle.keliling());
                System.out.println("Luas Persegi Panjang : " + rectangle.luas());
            }
            else if (input12 == 3){
                System.out.println("Input Jari-Jari : ");
                double jari = sc.nextDouble();
                Lingkaran circle = new Lingkaran(jari);
                System.out.printf("Keliling Lingkaran : %.2f\n", circle.keliling());
                System.out.printf("Luas Lingkaran : %.2f", circle.luas());
            }
            else if (input12 == 4){
                System.out.println("Input Alas : ");
                double alas = sc.nextDouble();
                System.out.println("Input Tinggi : ");
                double tinggi = sc.nextDouble();
                double miring = Math.sqrt((Math.pow(alas, 2)) + (Math.pow(tinggi, 2)));
                Segitiga triangle = new Segitiga(alas, tinggi, miring);
                System.out.println("Keliling Segitiga : " + triangle.keliling());
                System.out.println("Luas Segitiga : " + triangle.luas());
            }
            else if (input12 == 5){
                System.out.println("Input Sisi Atas : ");
                double atas = sc.nextDouble();
                System.out.println("Input Sisi Bawah : ");
                double bawah = sc.nextDouble();
                System.out.println("Input Tinggi : ");
                double tinggi = sc.nextDouble();
                System.out.println("Input Sisi Miring : ");
                double miring = sc.nextDouble();
                Trapesium trapesium = new Trapesium(atas, bawah, tinggi, miring);
                System.out.println("Keliling Trapesium : " + trapesium.keliling());
                System.out.println("Luas Trapesium : " + trapesium.luas());
            }
            else if (input12 == 6){
                System.out.println("Input Diagonal 1 : ");
                double diagonal1 = sc.nextDouble();
                System.out.println("Input Diagonal 2 : ");
                double diagonal2 = sc.nextDouble();
                System.out.println("Input Sisi Atas : ");
                double atas = sc.nextDouble();
                System.out.println("Input Sisi Bawah : ");
                double bawah = sc.nextDouble();
                LayangLayang kite = new LayangLayang(diagonal1, diagonal2, atas, bawah);
                System.out.println("Keliling Layang-Layang : " + kite.keliling());
                System.out.println("Luas Layang-Layang : " + kite.luas());
            }
            else if (input12 == 7){
                System.out.println("Input Alas : ");
                double alas = sc.nextDouble();
                System.out.println("Input Sisi Miring : ");
                double miring = sc.nextDouble();
                System.out.println("Input Tinggi : ");
                double tinggi = sc.nextDouble();
                Jajargenjang jajargenjang = new Jajargenjang(alas, tinggi, miring);
                System.out.println("Keliling Jajargenjang : " + jajargenjang.keliling());
                System.out.println("Luas Jajargenjang : " + jajargenjang.luas());
            }
            else{
                System.out.println("Inputan Salah");
            }
        }
        else{
            System.out.println("Inputan Salah");
        }
        sc.close();
    }

}