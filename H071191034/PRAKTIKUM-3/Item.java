//PLAYER
class Item{
    private String name;
    private int price;
    private String info;
    
    public Item(String name, int price, String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public String getInfo(){
        return this.info;
    }
    
    // public void use(){

    // }

    // public void destroy(){

    // }

}