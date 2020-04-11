/**
 * Main
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Player naruto = new Player("Naruto", "Ninja",33.0);
        Player sasuke = new Player("Sasuke", "Ninja",32.5);

        Item item1 = new Item("Kunai", 250, "+80 Attack");
        Item item2 = new Item("Vitamin C", 200, "+10 energy");
        Item item3 = new Item("Minyak Angin", 150 , "+100 hp");

        System.out.println("\t\t-------Welcome to the Game---------");
        boolean next = true;
        do {
            System.out.printf("Pilih pemain :\n1.Naruto\n2.Sasuke\n");
            System.out.print(">");
            int pemain = inp.nextInt();
            if(pemain == 1){
                boolean cek = true;
                do {
                    System.out.printf("\nPilih menu : \n1.Attack\n2.Buy Item\n3.Show Status\n\n99.Pilih Pemain\n0.Exit\n\n");
                    System.out.print(">");
                    int menu = inp.nextInt();
                    if (menu == 3) {
                        naruto.showStatus();
                        System.out.println("\n1.Menu\n2.Pilih Pemain");
                        System.out.print(">");
                        int a = inp.nextInt();
                        if(a == 2){
                            break;
                        }
                    }
                    if (menu == 1){
                        naruto.attack(sasuke);
                        System.out.println(" +----------------------+");
                        System.out.println(" | Naruto attack Sasuke |");
                        System.out.println(" +----------------------+");
                        if(sasuke.getHp() <= 0){
                            System.out.println("\tSasuke Dead");
                            System.out.println("\t\t------- End -------");
                            return;
                        }
                        System.out.println("\n1.Menu\n2.Pilih Pemain");
                        System.out.print(">");
                        int a = inp.nextInt();
                        if(a == 2){
                            break;
                        }
                    }
                    if (menu == 2){
                        item1.itemDetail();
                        System.out.println();
                        item2.itemDetail(); 
                        System.out.println();
                        item3.itemDetail();
                        System.out.print(">");
                        int pilihItem = inp.nextInt();
                            if(pilihItem == 1){
                                naruto.buy(item1);  System.out.println();
                                naruto.equipItem(item1.getName()); System.out.println();
                                
                            }
            
                            else if(pilihItem == 2){
                                naruto.buy(item2);
                                System.out.println();
                                naruto.equipItem(item2.getName());
                                System.out.println();
                                
                            }
            
                            else  if(pilihItem == 3){
                                naruto.buy(item3);
                                System.out.println();
                                naruto.equipItem(item3.getName());
                                System.out.println();
                            }
            
                    }
                    if (menu == 99){
                        cek = false;
                    }
                    if (menu == 0){
                        System.out.println("\t\t------ End -------");
                    }
                } while(cek);
            }
            if(pemain == 2){
                boolean cek = true;
                do {
                    System.out.printf("\nPilih menu : \n1.Attack\n2.Buy Item\n3.Show Status\n\n99.Pilih Pemain\n0.Exit\n\n");
                    System.out.print(">");
                    int menu = inp.nextInt();
                    if (menu == 3) {
                        sasuke.showStatus();
                        System.out.println("\n1.Menu\n2.Pilih Pemain");
                        System.out.print(">");
                        int a = inp.nextInt();
                        if(a == 2){
                            break;
                        }
                    }
                    if (menu == 1){
                        sasuke.attack(naruto);
                        System.out.println(" +----------------------+");
                        System.out.println(" | Sasuke attack Naruto |");
                        System.out.println(" +----------------------+");
                        if(sasuke.getHp() <= 0){
                            System.out.println("\tNaruto Dead");
                            System.out.println("\t\t------- End -------");
                            return;
                        }
                        System.out.println("\n1.Menu\n2.Pilih Pemain");
                        System.out.print(">");
                        int a = inp.nextInt();
                        if(a == 2){
                            break;
                        }
                    }
                    if (menu == 2){
                        item1.itemDetail();
                        System.out.println();
                        item2.itemDetail(); 
                        System.out.println();
                        item3.itemDetail();
                        System.out.print(">");
                        int pilihItem = inp.nextInt();
                            if(pilihItem == 1){
                                sasuke.buy(item1);  System.out.println();
                                sasuke.equipItem(item1.getName()); System.out.println();
                                
                            }
            
                            else if(pilihItem == 2){
                                sasuke.buy(item2);
                                System.out.println();
                                sasuke.equipItem(item2.getName());
                                System.out.println();
                                
                            }
            
                            else  if(pilihItem == 3){
                                sasuke.buy(item3);
                                System.out.println();
                                sasuke.equipItem(item3.getName());
                                System.out.println();
                            }
            
                    }
                    if (menu == 99){
                        cek = false;
                    }
                    if (menu == 0){
                        System.out.println("\t\t------ End -------");
                    }
                } while(cek);
            }
            if (pemain < 1 && pemain > 2){
                System.out.println("Inputan Invalid");
                next = false;
            }
                     
        }
        while (next);
    }
}