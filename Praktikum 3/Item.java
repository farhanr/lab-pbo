class Item
{
	private String name;
	private int price;
	private String info;
	private Player owner; 

	public Item(String name, String info, int price)
	{
		this.name = name;
		this.price = price;
		this.info = info;
	}

	public void use()
	{
		if (owner == null)
			throw new IllegalStateException("no item owner");

		// Item restoration?
		String descLower = info.toLowerCase();
		int restoresIndex = descLower.indexOf("restores");
		if (restoresIndex >= 0)
		{
			// Energy or health?
			int energyIndex = descLower.indexOf("energy");
			int healthIndex = descLower.indexOf("hp");
			int indexAmount = restoresIndex + 9;
			int restoreAmount = Integer.parseInt(descLower.substring(
				indexAmount,
				indexAmount + descLower.substring(indexAmount).indexOf(" ")
			));

			// Restores both energy and health
			if (descLower.indexOf("and") >= 0 && energyIndex >= 0 && healthIndex >= 0)
			{
				owner.addEnergy(restoreAmount);
				owner.healing(restoreAmount);
			}
			else if (energyIndex >= 0)
				owner.addEnergy(restoreAmount);
			else if (healthIndex >= 0)
				owner.healing(restoreAmount);
		}

		System.out.println(owner.getName() + " uses " + name);
		destroy();
	}

	public void sell()
	{
		if (owner != null)
		{
			owner.addMoney(price);
			destroy();
		}
	}

	public void destroy()
	{
		int i = searchAtPlayer();

		if (i >= 0)
			owner.removeItemAt(i);
	}

	public String getName()
	{
		return name;
	}

	public String getInfo()
	{
		return info;
	}

	public int getPrice()
	{
		return price;
	}

	public Player getOwner()
	{
		return owner;
	}

	public void setOwner(Player player)
	{
		owner = player;
	}

	private int searchAtPlayer()
	{
		if (owner == null) return -1;

		Item[] items = owner.getItems();
		for (int i = 0; i < items.length; i++)
		{
			if (items[i] == this)
				return i;
		}

		return -1;
	}
}