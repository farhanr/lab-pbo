import java.util.ArrayList;

class Player {
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private ArrayList<Item> items = new ArrayList<Item>();

    Player(String name, String role) {
        this.name = name;
        this.role = role;
        
        damage = 15;
        hp = 100;
        energy = 50;
        money = 20000;
    }

    private void removeItem(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(item.getName())) {
                items.remove(i);
            }
        }
    }

    public void sellItem(Item item) {
        if (items.contains(item)) {
            money += item.getPrice();
            removeItem(item);
            System.out.println("Succes selling this item");
        } else {
            System.out.println("You Dont Have This Item");
        }
    }

    public void destroyItem(Item item) {
        removeItem(item);
    }

    public void showStatus() {
        System.out.println("Name\t: " + name);
        System.out.println("Role\t: " + role);
        System.out.println("Level\t: " + level);
        System.out.println("Damage\t: " + damage);
        System.out.println("HP\t: " + hp);
        System.out.println("Energy\t: " + energy);
        System.out.println("Money\t: " + money);
    }

    public void showItems() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).getDetails();
            System.out.print(i == items.size() - 1 ? "" : "\n");
        }
    }

    public boolean buy(Item item) {
        if (money >= item.getPrice()) {
            money -= item.getPrice();
            items.add(item);
            System.out.printf("Successfully bought [%s] [%s]\n",item.getName(),getName());

            return true;
        } else {
            System.out.println("Money Needed!");
            return false;
        }
    }

    public Double getDamage() {
        return damage;
    }

    public boolean attack(Player player) {
        if (energy > 0) {
            System.out.println(name + " Attacking " + player.name);
            player.hp -= damage;
            System.out.println(player.name + " HP has decreased by " + damage);
            energy -= 1;
            return true;
        } else {
            System.out.println("unable to attack, you dont have energy");
            return false;
        }
    }

    public void startBattle(Player player) {
        while (true) {
            if (energy > 0 || hp <= 0) {
                player.hp -= damage;
                energy -= 1;
            } else {
                System.out.printf("[%s] Out of energy\n",name);
                break;
            }
            if (player.getEnergy() > 0 || hp <= 0) {
                hp -= player.getDamage();
                player.setEnergy(player.getEnergy() - 1);
            } else {
                System.out.printf("[%s] Out of energy\n",player.getName());
                break;
            }
            if (hp <= 0) {
                System.out.printf("[%s] is death\n",name);
                break;
            }
            if (player.getHp() <= 0) {
                System.out.printf("[%s] is death\n",player.getName());
                break;
            }
        }
    }

    public boolean healing(Integer healing) {
        if (energy > 0) {
            System.out.println("Healing " + name + " by 25 points");
            hp += healing;
            energy -= 1;
            return true;
        } else {
            System.out.println("You dont have energy");
            return false;
        }
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    public double getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

} 