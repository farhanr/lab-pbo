//PLAYER
import java.util.ArrayList;

class Player{
    private String name;
    private String role;
    private int level = 1;
    private double damage;
    private double hp = 100;
    // private double energy = 100;
    private int money = 10000;
    private ArrayList <Item> items = new ArrayList<>();

    public Player(String name, int level, String role, double damage){
        this.name = name;
        this.level = level;
        this.role = role;
        this.damage = damage;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println("Item \t\t: "+item.getName());
            System.out.println("Item price \t: "+item.getPrice());
            System.out.println("Item info \t: "+item.getInfo());

        }
    }

    public void setHp (double hp){
        this.hp = hp;
    }

    public double getHp (){
        return this.hp;
    }

    public void attack(Player player){
        player.getDamage(damage);
    }

    public void getDamage(double damage){
        hp -= damage;
    }

    public boolean healing(double heal){
        hp += heal;
        return true;
    }         

    public void buy(Item item){
        items.add(item);
        if (money - item.getPrice() < 0){
            System.out.println("\n*can't afford item*");
        } else {
            money -= item.getPrice();
            System.out.println("\n*item purchased*");
        }
    }

    
    public void sell(Item item){
        items.remove(item);
    }

    public void showStatus(){
        System.out.println("Name \t\t: "+this.name);
        System.out.println("Level \t\t: "+this.level);
        System.out.println("Role \t\t: "+this.role);
        System.out.println("Money \t\t: "+this.money);
        System.out.println("HP \t\t: "+this.hp);
        showItems();
        System.out.println();
    }
}