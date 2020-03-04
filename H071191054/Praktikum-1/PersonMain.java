public class PersonMain {
    public static void main(String[] args) {

        Person pers1 = new Person();
        Person pers2 = new Person();

        pers1.setName("Nurul");
        pers1.setAge(17);
        pers1.setGender(false);

        pers2.setName("Nuril");
        pers2.setAge(17);
        pers2.setGender(true);

        pers1.desc();
        pers2.desc();

    }
}