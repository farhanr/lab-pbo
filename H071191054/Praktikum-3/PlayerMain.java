class PlayerMain {
    public static void main(String[] args) {
        Player pl1 = new Player("Angel", "Person 1", 22.3);
        Player pl2 = new Player("Shayton", "Person 2", 33.2);
        Item i1 = new Item("Parang", 50, "This is parang");
        Item i2 = new Item("Clurit", 40, "This is clurit");

        pl1.buy(i1);
        pl1.buy(i2);
        pl1.showStatus();
        pl1.attack(pl2);
        pl1.sell(i1);
        pl1.showStatus();

        pl1.buy(i1);
        pl2.buy(i2);
        pl2.showStatus();

        System.out.println(pl1.healing(20));

    }
}