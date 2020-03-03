public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setName("Hal");
        p1.setAge(21);
        p1.setGender(true);

        p2.setName("Kiu");
        p2.setAge(20);
        p2.setGender(false);

        p1.desc();
        p2.desc();

    }
}