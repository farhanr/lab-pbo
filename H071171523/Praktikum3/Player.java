import java.util.*;

class Player
{
	private String name, role;
	private int level;
	private double damage, hp, energy;
	private int money;
	private List<Item> items;

	public Player(String name, String role)
	{
		// Parameters
		this.name = name;
		this.role = role;

		// Defaults
		level = 1;
		damage = 5.0;
		hp = 100.0;
		energy = 100.0;
		money = 5000;
		items = new ArrayList<Item>();
	}

	public void showStatus()
	{
		System.out.println("Name   : " + name);
		System.out.println("Role   : " + role);
		System.out.println("Level  : " + level);
		System.out.println("Money  : " + money);
		System.out.println("HP     : " + hp);
		System.out.println("Energy : " + energy);
		System.out.println("Attack : " + damage);
	}

	public void showItems()
	{
		System.out.printf("Items: %d item(s)\n", items.size());

		for (Item item: items)
		{
			System.out.println("Name        : " + item.getName());
			System.out.println("Description : " + item.getInfo());
			System.out.println("Sell Price  : " + item.getPrice());
			System.out.println("=============");
		}
	}

	public boolean attack(Player target)
	{
		if (energy < 5)
		{
			System.out.println(name + " doesn't have enough energy to attack " + target.name);
			return false;
		}

		System.out.println(name + " attacked " + target.name);
		target.hp = Math.max(target.hp - damage, 0);
		energy -= 5.0;
		return true;
	}

	// TODO: getDamage() returns string?
	public String getDamage() {return "";}

	public boolean healing(double amount)
	{
		if (hp <= 0.0)
			// Player dead
			return false;

		hp += amount;
		return true;
	}

	public boolean buy(Item item)
	{
		if (money < item.getPrice())
			// Not enough money
			return false;

		items.add(item);
		money -= item.getPrice();
		item.setOwner(this);
		return true;
	}

	public String getName()
	{
		return name;
	}

	public String getRole()
	{
		return role;
	}

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public void setDamage(double damage)
	{
		this.damage = Math.max(damage, 0.0);
	}

	public double getHealth()
	{
		return hp;
	}

	public double getEnergy()
	{
		return energy;
	}

	public void addEnergy(double energy)
	{
		this.energy += energy;
	}

	public int getMoney()
	{
		return money;
	}

	public void addMoney(int money)
	{
		this.money += money;
	}

	public Item[] getItems()
	{
		Item[] list = new Item[items.size()];
		return items.toArray(list);
	}

	public void removeItemAt(int i)
	{
		Item item = items.get(i);
		items.remove(i);
		item.setOwner(null);
	}

	public void addItem(Item item)
	{
		items.add(item);
		item.setOwner(this);
	}
}