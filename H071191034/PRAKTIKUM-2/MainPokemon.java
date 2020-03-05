class MainPokemon{
    public static void main(String[] args) {
        Pokemon pok1 = new Pokemon("Pok1", "fire",80);
        Pokemon pok2 = new Pokemon("Pok2", "electric", 75);

        pok1.getDamage(pok2);
        pok2.getDamage(pok1);

        pok1.attack(pok2);
        pok2.attack(pok1);

        pok1.dead();
        pok2.dead();

        pok1.desc();
        pok2.desc();

        pok1.result();


    }
}