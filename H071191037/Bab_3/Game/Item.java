/**
 * Item
 */
public class Item {

    private String name;
    private int price;
    private String info;

    public Item(String name, int price,String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void itemDetail(){
        System.out.println("Item Name : " + getName());
        System.out.println("     price: " + getPrice());
        System.out.println("     info : " + info);
    }
    
}