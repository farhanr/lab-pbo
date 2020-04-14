import java.util.Scanner;

class Main {

    static Scanner input = new Scanner(System.in);
    static Item item1,item2,item3,item4;
    static Player player1,player2;

    public static void main(String[] args) {

        item1 = new Item("Dual Sword",2000,"Dual Swords are a type of two-handed Melee weapons");
        item2 = new Item("Sword",2000,"A sword is a bladed melee weapon intended for slashing");
        item3 = new Item("Katana", 2000, "A katana is a Japanese long sword used by samurai warriors");
        item4 = new Item("Spear", 2000, "A long stick with a sharp tip used as a weapon for throwing or thrusting");

        player1 = new Player("Kirito","Warrior");
        player2 = new Player("Alice","Knight");

        String p = "---------------";

        player1.showStatus();
        System.out.println(p);
        player2.showStatus();
        System.out.println(p);
        
        player1.buy(item1);
        System.out.println(p);
        player2.buy(item2);
        player2.buy(item3);
        player2.buy(item4);
        System.out.println(p);
        
        item1.use(player1);
        item2.use(player2);
        System.out.println(p);
        
        player1.showItems();
        System.out.println(p);
        
        player2.showItems();
        System.out.println(p);
        
        player1.startBattle(player2);
        System.out.println(p);
    }

} 