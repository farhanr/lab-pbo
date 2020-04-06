import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("STRUKTUR ORGANISASI UKM PROGRAMMER");
        System.out.println("1. Pengurus Inti");
        System.out.println("2. Koordinator Bidang dan Staff");
        System.out.println("3. Anggota");

        int menu = in.nextInt();
        if (menu == 1) {
            System.out.println("1. Ketua Umum");
            System.out.println("2. Sekretaris");
            System.out.println("3. Bendahara");
            int pi = in.nextInt();
            if (pi == 1) {
                System.out.print("Input nama: ");
                in.nextLine();
                String namaKetua = in.nextLine();
                System.out.print("Input NIM: ");
                String idKetua = in.nextLine();
                System.out.print("Input prodi: ");
                String pdKetua = in.nextLine();
                Inti ketua = new Inti(namaKetua, idKetua, pdKetua);
                ketua.showInti();
                System.out.println("Ketua Umum");
                System.out.println("Nama\t:" + namaKetua);
                System.out.println("NIM\t:" + idKetua);
                System.out.println("Prodi\t:" + pdKetua);

            } else if (pi == 2) {
                System.out.print("Input nama: ");
                in.nextLine();
                String namaSekre = in.nextLine();
                System.out.print("Input NIM: ");
                String idSekre = in.nextLine();
                System.out.print("Input prodi: ");
                String pdSekre = in.nextLine();
                Inti sekre = new Inti(namaSekre, idSekre, pdSekre);
                sekre.showInti();
                System.out.println("Sekretaris");
                System.out.println("Nama\t:" + namaSekre);
                System.out.println("NIM\t:" + idSekre);
                System.out.println("Prodi\t:" + pdSekre);

            } else if (pi == 3) {
                System.out.print("Input nama: ");
                in.nextLine();
                String namaBenda = in.nextLine();
                System.out.print("Input NIM: ");
                String idBenda = in.nextLine();
                System.out.print("Input prodi: ");
                String pdBenda = in.nextLine();
                Inti benda = new Inti(namaBenda, idBenda, pdBenda);
                benda.showInti();
                System.out.println("Bendahara");
                System.out.println("Nama\t:" + namaBenda);
                System.out.println("NIM\t:" + idBenda);
                System.out.println("Prodi\t:" + pdBenda);

            } else {
                System.out.println("Data not found");
            }
        } else if (menu == 2) {
            System.out.print("Input nama: ");
            in.nextLine();
            String namaKoord = in.nextLine();
            System.out.print("Input NIM: ");
            String idKoord = in.nextLine();
            System.out.print("Input prodi: ");
            String pdKoord = in.nextLine();
            Koord koord = new Koord(namaKoord, idKoord, pdKoord);
            koord.showKoord();
            System.out.println("Nama\t:" + namaKoord);
            System.out.println("NIM\t:" + idKoord);
            System.out.println("Prodi\t:" + pdKoord);

        } else if (menu == 3) {
            System.out.print("Input nama: ");
            in.nextLine();
            String namaAng = in.nextLine();
            System.out.print("Input NIM: ");
            String idAng = in.nextLine();
            System.out.print("Input prodi: ");
            String pdAng = in.nextLine();
            Anggota anggota = new Anggota(namaAng, idAng, pdAng);
            anggota.showAnggota();
            System.out.println("Nama\t:" + namaAng);
            System.out.println("NIM\t:" + idAng);
            System.out.println("Prodi\t:" + pdAng);
        } else {
            System.out.println("Data not found");
        }
        in.close();
    }
}