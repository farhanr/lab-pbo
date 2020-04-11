import java.util.ArrayList;

public class Player {
    private String name;
    private String role;
    private int level = 1;
    private double damage;
    private double hp = 100;
    // private double energy = 100;
    private int money = 1000;
    private ArrayList<Item> items = new ArrayList<>();

    public Player(String name, String role, double damage) {
        this.name = name;
        this.role = role;
        this.damage = damage;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(item.getName());
            System.out.println("Item price : " + item.getPrice());
            System.out.println("Item info : " + item.getInfo());
        }
    }

    public void attack(Player player) {
        player.getDamage(damage);
    }

    public void getDamage(double damage) {
        hp -= damage;
    }

    public boolean healing(double heal) {
        hp += heal;
        return true;
    }

    public void buy(Item item) {
        items.add(item);
        if (money - item.getPrice() < 0) {
            System.out.println("Item cannot be purchased");
        } else {
            money -= item.getPrice();
            System.out.println("Item purchased");
        }
    }

    public void sell(Item item) {
        items.remove(item);
    }

    public void showStatus() {
        System.out.println("Name : " + this.name);
        System.out.println("Role : " + this.role);
        System.out.println("Level : " + this.level);
        System.out.println("Money : " + this.money);
        System.out.println("HP : " + this.hp);
        System.out.print("Item : ");
        showItems();
        System.out.println();
    }
}