/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Pokemon a = new Pokemon("pikacu","listrik",200,50);
        Pokemon b = new Pokemon("grock","tanah",90,70);

        a.getAttack(b);
        b.getAttack(a);
        a.desc();
        b.desc();
        if(a.Dead(b) || b.Dead(a)){
            if (b.Dead(a)){
                System.out.printf("%s \t---> Winner,Xp = %d\n%s \t---> Dead,Xp = %d",b.getName(),b.getXp(),a.getName(),a.getXp());
            }else if (a.Dead(b)){
                System.out.printf("%s \t---> Winner,Xp = %d\n%s \t---> Dead,Xp = %d",a.getName(),a.getXp(),b.getName(),b.getXp());
            }
        }
    }
}