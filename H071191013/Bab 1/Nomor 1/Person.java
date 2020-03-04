public class Person{
    String name;
    int age;
    boolean isMale;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }
    public String getGender(){
        if (isMale == true) {
            return "Laki-Laki";
        } else {
            return "Perempuan";
            
        }
    }

}