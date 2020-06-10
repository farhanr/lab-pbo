import java.util.ArrayList;
import java.util.HashSet;

public class DataBase {
    private Menu menu = new Menu();
    private ArrayList<String> keranjang = new ArrayList<>();
    private double total;

    public Menu getMenu() {
        return menu;
    }

    public void hapusPesanan(String item) {
        if (keranjang.contains(item)) {
            keranjang.remove(item);
            total -= menu.getHarga(item);
        }

        printDetailKeranjang();
    }

    public void tambahPesanan(String item) {
        if (item != null) {
            keranjang.add(item);
            total += menu.getHarga(item);
        }

        printDetailKeranjang();
    }
    public int getBanyakItem(String item) {
        int count = 0;
        for (String str : keranjang) {
            if (str.equals(item)) {
                count++;
            }
        }

        return count;
    }

    public int getTotalHarga(String item) {
        int count = 0;
        for (String str : keranjang) {
            if (str.equals(item)) {
                count++;
            }
        }

        return menu.getHarga(item) * count;
    }

    public void bayar() {
        keranjang = new ArrayList<>();
        total = 0;
    }

    public String printDetailKeranjang() {
        StringBuilder detail = new StringBuilder(">>>>>>>>>>>>Koko Restaurant<<<<<<<<<<<<");
        int index = 0;

        detail.append("\n-------------------------Pesanan-------------------------\n");
        if (keranjang.size() == 0) {
            detail.append("Keranjang Kosong !\n");
        }

        for (String namaItem : new HashSet<>(keranjang)) {
            index++;
            detail.append(String.format("%d. \t%s\n", index, namaItem));
            detail.append(String.format("\t\tBanyak\t : %s\n", getBanyakItem(namaItem)));
            detail.append(String.format("\t\tHarga\t : %s\n", getTotalHarga(namaItem)));
        }

        detail.append("\n");
        detail.append(String.format("Banyak Pesanan\t : %s\n", keranjang.size()));
        detail.append(String.format("Total\t\t\t : Rp.%s\n", total));
        detail.append("\nTekan Bayar Jika Sudah Tidak ada yang Ingin Dipesan");
        detail.append("\nnb : harga belum termasuk pajak restorant 5%");

        return detail.toString();
    } 

    public String printStruk() {
        StringBuilder detail = new StringBuilder(">>>>>>>>>>Koko Restaurant<<<<<<<<<<<\n");
        int index = 0;

        detail.append("\n------------------------Struk------------------------\n");
        detail.append("Pesanan :\n");

        if (keranjang.size() == 0) {
            detail.append("Anda Belum Memesan !\n");
        }

        for (String namaItem : new HashSet<>(keranjang)) {
            index++;
            detail.append(String.format("%d. \t%s\n", index, namaItem));
            detail.append(String.format("\t\tBanyak\t : %s", getBanyakItem(namaItem)));
            detail.append(String.format("\t\tHarga\t : %s", getTotalHarga(namaItem)));
        }

        total = total + (total * 0.05);
        detail.append("\n");
        detail.append(String.format("\nBanyak Pesanan\t : %s\n", keranjang.size()));
        detail.append(String.format("Total\t\t\t : Rp. %s\n", total));
        detail.append("\nTerima Kasih");

        return detail.toString();
    }
}