public class Player {

    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player(String name, int defense) {
        this.name = name;
        this.defense = defense;
        hp = 100;
    }

    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        hp = 100;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void getDamage(Player Enemy) {
        hp = (hp + defense) - Enemy.getAttackPower();
    }

    public void Status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
        System.out.println();
    }
}