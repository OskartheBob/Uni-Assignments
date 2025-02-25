
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String name;
    private int price;
    private long itemId;

    /**
     * Constructor for objects of class Item
     */
    public Item(String itemName, long id)
    {
        name = itemName;
        itemId = id;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        String out = "Item Id " + itemId + "\t" + name + "\tPrice: " + price;
        return out;
    }

}
