class Pokemon{
    private String name;
    private String type;
    private int defense;
    private int xp;
    private int health;
    private String winner;
    private String loser;

    public Pokemon (String name, String type, int defense){
        this.name = name;
        this.type = type;
        this.defense = defense;
        xp = 1000;
        health = 100;        
    }

    public String getName (){
        return name;
    }

    public String getType (){
        return name;
    }

    public int getDefense (){
        return defense;
    }

    public void getDamage (Pokemon enemy){
        health = health - (defense - enemy.getDefense());
    }

    public void attack (Pokemon enemy){
        switch (type){
            case "fire":
                switch (enemy.getType()){
                    case "water":
                        winner = enemy.getName();
                        loser = name;
                    case "ground":
                        winner = enemy.getName();
                        loser = name;
                        break;
                    default:
                        System.out.println("Invalid type\n");
                        break;
                }
                break;
            case "ground":
                switch (enemy.getName()){
                    case "fire":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "water":
                        winner = enemy.getName();
                        loser = name;
                        break;
                    case "electric":
                        winner = name;
                        loser = enemy.getName(); 
                        break;
                    default:
                        System.out.println("Invalid type\n");
                        break;
                }
                break;
            case "electric":
                switch (enemy.getType()){
                    case "water":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "ground":
                        winner = enemy.getName();
                        loser = name;
                        break;
                    default:
                        System.out.println("Invalid type\n");
                        break;
                }
                break;
            case "water":
                switch (enemy.getType()){
                    case "fire":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "ground":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "electric":
                        winner = enemy.getName();
                        loser = name;
                        break;
                    default:
                        System.out.println("Invalid type\n");
                        break;
                }
            default:
                break;
        }

        if (winner == name){
            xp += 1000;
        }
    }

    public void dead(){
        if(health <= 0){
            System.out.println(name + " is dead");
        }
    }

    public void desc(){
        System.out.println("Name \t: "+name);
        System.out.println("Type \t: "+type);
        System.out.println("Defense : "+defense);
        System.out.println("Health \t: "+health);
        System.out.println("XP \t: "+xp);
        System.out.println();
    }

    public void result(){
        if (winner != null && loser != null){
            System.out.println(winner+" win");
            System.out.println(loser+" lose");
        }
    } 
    
}