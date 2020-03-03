public class Person {

    private String name;
    private int age;
    private boolean isMale;

    // method set
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean isMale) {
        if (isMale) {
            this.isMale = true;
        } else {
            this.isMale = false;
        }
    }

    // method get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return isMale ? "Male" : "Female";
    }

    public void desc() {
        System.out.println("Name    :" + getName());
        System.out.println("Age     :" + getAge());
        System.out.println("Gender  :" + getGender());
        System.out.println();
    }
}