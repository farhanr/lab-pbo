public class Pokemon {

    private String name;
    private String type;
    private int damage;
    private int defense;
    private int xp;
    private int hp;


    public Pokemon(String name,String type,int damage, int defense){
        this.name = name;
        this.type = type.toLowerCase();
        this.damage = damage;
        this.defense = defense;
        xp = 0;
        hp = 100;
    }


    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void getAttack(Pokemon enemy){
        if( defense < enemy.getDamage()){
            if(type == "air" && enemy.type == "listrik"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((damage)));
            }else if(type == "tanah" && enemy.type == "air"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((damage)));
            }else if(type == "api" && enemy.type == "air"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((damage)));
            }else if(type == "listrik" && enemy.type == "tanah"){
                enemy.hp = enemy.hp - Math.abs(enemy.defense - ((damage)));
            }else{
                enemy.hp = enemy.hp - Math.abs(enemy.defense - (damage));
            }
        }
    }

    public Boolean dead(Pokemon enemy){
        if(enemy.hp <= 0){
            xp = 100;
            enemy.xp = 10;
            return true;
        }else{
            return false;
        }
    }

    public int getXp() {
        return xp;
    }

    public void desc(){
        System.out.printf("Name\t: %s\nType\t: %s\nHp\t: %d\nDefense\t: %d\nDamage\t: %d\n\n",name,type,hp,defense,damage);
    }
} 