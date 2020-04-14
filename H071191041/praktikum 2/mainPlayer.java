public class mainPlayer {

    public static void main(String[] args) {
        int defense = 15;
        int attack = 10;
        Player Player1 = new Player("Mino", attack , defense );
        Player Player2 = new Player("Hilda", defense);

        Player1.status();
        Player2.status();
        Player1.setAttackPower(30);
        Player2.setAttackPower(35);
        System.out.println();

        Player1.getDamage(Player2);
        Player2.getDamage(Player1);
        Player1.status();
        Player2.status();
    }
}