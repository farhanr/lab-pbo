public class Person {
    String name;
    int age;
    boolean isMale;
    
    public String getGender() {
        if(isMale){
            return "Male";
        }else {
            return "Female";
        }
    }
    public void setGender(boolean ismale) {
        this.isMale = ismale;
        //isMale = true;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
