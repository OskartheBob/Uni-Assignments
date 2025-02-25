
/**
 * Write a description of class ShoppingCart here.
 *
 * @author Oskar Sokol
 * @version v1.0
 */

import java.util.*;
public class ShoppingCart
{
    // Attributes:
    private final long cartId;
    private String createTime;
    private ArrayList<Item> items;
    private int total;
    private Customer customer;
    private boolean isLocked;

    // constructor
    public ShoppingCart(String createTime, Customer customer) {
        cartId = Math.abs(new Random().nextLong());
        this.createTime = createTime;
        items = new ArrayList<Item>();
        total = 0;
        isLocked = false;
    }
    
    // addItem
    public void addItem(Item item){
        if(isLocked) {
            System.out.println("Sorry the shopping cart is closed");
        }
        else{
            items.add(item);
            total++;
            System.out.println("The item has been added");
        }
    }
    // removeItem
    public void removeItem(int i){
        if(isLocked) {
            System.out.println("Sorry the shopping cart is closed");
        }
        else{
            if(items.get(i)!=null) {
                items.remove(i);
                total--;
                System.out.println("The item has been removed");
                }
            else{
                System.out.println("This item doesn't exist");
            }
        }
        }
    
    // getTotal
    public int getTotal(){
        return total;
    }
    // getCartId
    public long getCartId(){
        return cartId;
    }
    // getCustomer
    public Customer getCustomer(){
        return customer;
    }
    // printItems
    public void printItems(){
        System.out.println(items.toString());
    }
    // close (lock it so that items cannot be added/removed from it)
    public void close(){
        isLocked = true;
    }
    // clear(empty the cart)
    public void clear(){
        items.clear();
    }

}
