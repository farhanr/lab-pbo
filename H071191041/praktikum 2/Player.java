class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player(){

    }
    public Player (String name, int defense) {
        this.name = name;
        this.defense = defense;
        hp = 100;
    }
    public Player(String name ,int attackPower, int defense){
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        hp = 100;
    }
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

    public int getAttackPower (){
        return this.attackPower;
    }

    public void getDamage (Player enemy){
        hp = hp - Math.abs((defense - enemy.getAttackPower()));
    }

    public void status (){
        System.out.println(name + " status");
        System.out.println("Hp = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
    }

}