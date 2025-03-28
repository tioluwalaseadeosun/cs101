public class CartItem {
    private int itemID;
    private Product item;
    private int quantity;

    public CartItem(int itemID,Product item, int quantity){
        this.item = item;
        this.quantity = quantity;
        this.itemID = itemID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString(){
        String retString = "" + itemID +" || "+ item.getName() + " || Quantity: "+ quantity +" || Price: " + item.getPrice();
        return retString;
    }
}
