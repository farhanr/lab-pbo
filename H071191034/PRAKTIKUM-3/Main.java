//PLAYER
class Main{
    public static void main(String[] args) {
        Player p1 = new Player("Bejo", 10,"Person 1", 20);
        Player p2 = new Player("Sukiman", 7, "Person 2", 40);
        Item i1 = new Item("Axe", 12000, "This is axe");
        Item i2 = new Item("Hammer", 5000, "This is hammer");
        Item i3 = new Item("See-saw", 8000, "This is see-saw");
        
        
        p1.buy(i1);
        p1.buy(i2);
        p1.showStatus();
        p1.attack(p2);
        p1.sell(i1);
        p1.showStatus();
        p2.buy(i2);
        p2.showStatus();
        System.out.println(p1.healing(10));
    }
}