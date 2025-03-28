import java.util.ArrayList;

public class Cart {
    ArrayList<CartItem> cart;

    public Cart(){
        cart = new ArrayList<CartItem>();
    }

    public void add(CartItem item){
        cart.add(item);
    }
    public void add(int index, CartItem item){
        cart.add(index, item);
    }

    public void remove(CartItem item){
        cart.remove(item);
    }
    public void remove(int index){
        cart.remove(index);
    }

    public String toString(){
        String retString = "<<\n";
        for (int i = 0; i < cart.size(); i++) {
            retString += cart.get(i).toString() + "\n";
        }
        return retString + ">>";

    }

    public int totalPrice(){
        int totalPrice = 0;
        for (int index = 0; index < cart.size(); index++) {
            totalPrice+= cart.get(index).getItem().getPrice();
        }
        return totalPrice;
    }
}
