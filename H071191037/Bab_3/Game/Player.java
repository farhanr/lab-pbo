import java.util.ArrayList;

public class Player {
    private String name,role;
    private int level,money;
    private double damage,hp,energy;
    private ArrayList<Item> items;

    public Player(){

    }
    public Player(String name, String role,double damage){
        this.name = name;
        this.role = role;
        this.level = 1;
        this.money = 2000;
        this.damage = damage;
        this.hp = 100;
        this. energy = 50;

        items = new ArrayList<>();
    }

    
    /**
     * @return the hp
     */
    public double getHp() {
        return hp;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    public void showStatus(){
        System.out.printf("Nama : %s\nRole : %s\nLevel : %d\nMoney : %d gold\nDamage : %.1f\nHP : %.1f\nEnergy : %.1f\n",name,role,level,money,damage,hp,energy);
    }
    public void showItems(){
        System.out.println();
    }
    public boolean attack(Player enemy){
        if (enemy.hp == 0) {
            return false;
        } else {
            enemy.hp = enemy.hp - damage;
            money += 100;
            energy -= 10.0;
            level += 1;
            return true; 
        }
    }
    public String getDamage(){
        return String.format("Name = %s \nDamage = %d",name, damage);
    }
    public boolean healing(String cekHp){
        for (int i = 0; i < items.size(); i++) {
           if (items.get(i).getName().equals(cekHp)) {
               return true;
           }
       }
       return false;
        
   }

    public boolean buy(Item item){
        if(money >= item.getPrice()){
            money -= item.getPrice();
            items.add(item);
            System.out.println();
            System.out.println("x---- Item Added ----x");
            System.out.println("\"" + item.getName() + "\"" + " Has Purchased ");
            return true;
        }
        else{
            System.out.println("Cannot Buy this Item");
            return false;
        }
    }
    public void equipItem(String item){
        
        if(cekItem(item) || healing(item)){
            if(item.equals("Black Power")){
                damage += 80.0;
            }
            else if(item.equals("Megamorph")){
                energy += 10.0;
            }
            else if(item.equals("Healing Magic")){
                hp += 100.0;
            }

        }
    }
    public boolean cekItem(String cek){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getName().equals(cek)){
                return true;
            }
        }
        return false;
    }

}