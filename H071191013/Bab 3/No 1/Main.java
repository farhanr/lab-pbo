import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("welcome to the battle simulator");
        System.out.println("+-----------------------------+");
        System.out.println("insert player 1");
        System.out.print("name : ");
        String name = sc.next();
        System.out.print("role : ");
        String role = sc.next();
        Player player1 = new Player(name, role);
        System.out.println();

        System.out.println("+-----------------------------+");
        System.out.println("insert player 2");
        System.out.print("name : ");
        String name2 = sc.next();
        System.out.print("role : ");
        String role2 = sc.next();
        Player player2 = new Player(name2, role2);
        System.out.println();

        int p1 = 0;
        int p2 = 0;
        boolean turn = false;
        while(true){
            if(player1.dead(player2) || player2.dead(player1)){
                if(player1.dead(player2)){
                    System.out.println();
                    System.out.println(player1.getName() + " dead");
                    System.out.println();
                    System.out.println(player2.getName() + " win");
                }else{
                    System.out.println();
                    System.out.println(player2.getName() + " dead");
                    System.out.println();
                    System.out.println(player1.getName() + " win");
                }
                break;
            }

            //player1
            if(!turn){
                System.out.println();
                System.out.println(player1.getName() + " turn's");
                System.out.println();
                System.out.println("+-----------------------------+");
                System.out.println("1. show status");
                System.out.println("2. show items");
                System.out.println("3. attack");
                System.out.println("4. heal");
                System.out.println("5. buy items");
                System.out.println("6. sell items");
                System.out.println("7. quit");
                System.out.println("+-----------------------------+");
                System.out.println();
                System.out.println("choose = ");
                p1 = sc.nextInt();
                if(p1 == 1){
                    player1.showStatus();
                }else if(p1 == 2){
                    player1.showItems();
                }else if(p1 == 3){
                    player2.getDamage(player2);
                    turn = true;
                }else if(p1 == 4){
                    player1.healing(player1);
                    turn = true;
                }else if(p1 == 5){
                    System.out.println("beli Hp potion");
                    System.out.println("how many?");
                    int item = sc.nextInt();
                    player1.buy(player1, item);
                }else if(p1 == 6){
                    System.out.println("item ke? ");
                    int jual = sc.nextInt();
                    player1.sell(jual);
                }else if(p1 == 7){
                    return;
                }
            }else{
                //player2
                System.out.println();
                System.out.println(player2.getName() + " turn's");
                System.out.println();
                System.out.println("1. show status");
                System.out.println("2. show items");
                System.out.println("3. attack");
                System.out.println("4. heal");
                System.out.println("5. buy items");
                System.out.println("6. sell items");
                System.out.println("7. quit");
                System.out.println();
                System.out.println("choose = ");
                p2 = sc.nextInt();
                if(p2 == 1){
                    player2.showStatus();
                }else if(p2 == 2){
                    player2.showItems();
                }else if(p2 == 3){
                    player1.getDamage(player1);
                    turn = false;
                }else if(p2 == 4){
                    player1.healing(player2);
                    turn = false;

                }else if(p2 == 5){
                    System.out.println("beli Hp potion");
                    System.out.println("how many?");
                    int item2 = sc.nextInt();
                    player2.buy(player2, item2);

                }else if(p2 == 6){
                    System.out.println("item ke? ");
                    int jual = sc.nextInt();
                    player1.sell(jual);

                }else if(p2 == 7){
                    return;
                }
            }
        }
    }
}