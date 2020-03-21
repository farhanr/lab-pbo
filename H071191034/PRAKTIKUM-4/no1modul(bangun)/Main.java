import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner rex = new Scanner(System.in);
        // BangunBangun bd = new BangunBangun();
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1.\tKUBUS");
        System.out.println("2.\tBALOK");
        System.out.println("3.\tPRISMA SEGITIGA");
        System.out.println("4.\tBOLA");
        System.out.println("5.\tTABUNG");
        System.out.println("\t...");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("1.\tPERSEGI");
        System.out.println("2.\tPERSEGI PANJANG");
        System.out.println("3.\tLINGKARAN");
        System.out.println("4.\tSEGITIGA");
        System.out.println("5.\tTRAPESIUM");
        System.out.println("\t...");

        System.out.print("ruang / datar? ");
        String bangun = rex.nextLine();
        switch (bangun){
            case "ruang":
                System.out.print("Bangun ruang ke? ");
                int bRuang = rex.nextInt();
                switch (bRuang){
                    case 1:
                        System.out.print("panjang sisi = ");
                        double sisi = rex.nextDouble();
                        Kubus kubus = new Kubus(sisi);
                        break;
                    case 2:
                        System.out.print("panjang = ");
                        double panjang = rex.nextDouble();
                        System.out.print("lebar = ");
                        double lebar = rex.nextDouble();
                        System.out.print("tinggi = ");
                        double tinggi = rex.nextDouble();
                        Balok balok = new Balok(panjang, lebar, tinggi);
                        break;
                    case 3:
                        System.out.print("luas alas = ");
                        double luasAlas = rex.nextDouble();
                        System.out.print("keliling =");
                        double keliling = rex.nextDouble();
                        System.out.print("tinggi = ");
                        double tinggi2 = rex.nextDouble();
                        System.out.print("sisi A = ");
                        double sisiA = rex.nextDouble();
                        System.out.print("sisi B = ");
                        double sisiB = rex.nextDouble();
                        Prisma prisma = new Prisma(luasAlas, keliling, tinggi2, sisiA, sisiB);
                        break;
                    case 4:
                        System.out.print("r = ");
                        double r = rex.nextDouble();
                        Bola bola = new Bola(r);
                        break;
                    case 5:
                        System.out.print("r = ");
                        double r2 = rex.nextDouble();
                        System.out.print("tinggi = ");
                        double tinggi3 = rex.nextDouble();
                        Tabung tabung = new Tabung(r2, tinggi3);
                        break;
                    default:
                        break;    
                }
                break;
            case "datar":
                System.out.print("Bangun datar ke? ");
                int bDatar = rex.nextInt();
                switch (bDatar){
                    case 1:
                        System.out.print("sisi = ");
                        double sisi = rex.nextDouble();
                        Persegi persegi = new Persegi(sisi);
                        break;
                    case 2:
                        System.out.print("panjang = ");
                        double panjang = rex.nextDouble();
                        System.out.print("lebar = ");
                        double lebar = rex.nextDouble();
                        PersegiPanjang persegip = new PersegiPanjang(panjang, lebar);
                        break;
                    case 3:
                        System.out.print("r = ");
                        double r = rex.nextDouble();
                        Lingkaran lingkaran = new Lingkaran(r);
                        break;
                    case 4:
                        System.out.print("alas = ");
                        double alas = rex.nextDouble();
                        System.out.print("tinggi = ");
                        double tinggi = rex.nextDouble();
                        Segitiga segitiga = new Segitiga(alas, tinggi);
                        break;
                    case 5:
                        System.out.print("sisi A = ");
                        double sisiA = rex.nextDouble();
                        System.out.print("sisi B = ");
                        double sisiB = rex.nextDouble();
                        System.out.print("tinggi = ");
                        double tinggi2 = rex.nextDouble();
                        Trapesium trapesium = new Trapesium(sisiA, sisiB, tinggi2);
                        break;
                } 
                break;
            default:
                break;
        }
    rex.close();
    }
}