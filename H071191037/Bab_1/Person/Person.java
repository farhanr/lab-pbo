class Person {

    String name;
    int age;
    boolean isMale;

    public void setAge(Integer age){
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

    public void isMale(){
        this.isMale();
    }

    public void setGender(String gender){ // jika gender pria maka isMale >> true else false
        if(gender == "laki"){
            isMale = true;
        }else if(gender == "perempuan"){
            isMale = false;
        }
    }
    
    public String getGender(){

        if(isMale) {
            return "male";
        } else{
            return "female";
        }
    }

    public void cetak(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(getGender());
    }
}