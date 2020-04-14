public class mainPokemon {

    public static void main(String[] args) {
        Pokemon a = new Pokemon("pikacu","listrik",200,50);
        Pokemon b = new Pokemon("grock","tanah",90,70);

        a.getAttack(b);
        b.getAttack(a);
        a.desc();
        b.desc();
        if(a.dead(b) || b.dead(a)){
            if (b.dead(a)){
                System.out.printf("%s \t---> Winner,Xp = %d\n%s \t---> dead,Xp = %d",b.getName(),b.getXp(),a.getName(),a.getXp());
            }else if (a.dead(b)){
                System.out.printf("%s \t---> Winner,Xp = %d\n%s \t---> dead,Xp = %d",a.getName(),a.getXp(),b.getName(),b.getXp());
            }
        }
    }
} 
