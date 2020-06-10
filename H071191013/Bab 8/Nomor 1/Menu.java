import java.util.*;

public class Menu {
    private HashMap<String, Integer> menu;
    private ArrayList<String> listMenu;
    private ArrayList<String> listHarga;

    public Menu() {
        menu = new HashMap<>();
        menu.put("Nasi Goreng", 15000);
        menu.put("Ayam Goreng", 10000);
        menu.put("Mi Goreng", 13000);
        menu.put("Nasi Putih", 5000);
        menu.put("Air Gelas", 1000);
        menu.put("Es Teh", 2000);

        listMenu = new ArrayList<>();
        listMenu.add("Nasi Goreng");
        listMenu.add("Ayam Goreng");
        listMenu.add("Mi Goreng");
        listMenu.add("Nasi Putih");
        listMenu.add("Air Gelas");
        listMenu.add("Es Teh");

        listHarga = new ArrayList<>();
        listHarga.add("Rp. 15.000");
        listHarga.add("Rp. 10.000");
        listHarga.add("Rp. 13.000");
        listHarga.add("Rp. 5.000");
        listHarga.add("Rp. 1.000");
        listHarga.add("Rp. 2.000");
    }

    public int getHarga(String item) {
        return menu.get(item);
    }

    public ArrayList<String> getItemName() {
        return listMenu;
    }

    public ArrayList<String> getItemHarga() {
        return listHarga;
    }

}