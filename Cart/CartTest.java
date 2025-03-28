public class CartTest {
    public static void main(String[] args) {
        Cart myCart = new Cart();
        myCart.add(new CartItem(1, new Product("SK104952", "Keyboard", 65), 2));
        myCart.add(new CartItem(2, new Product("RM356232", "Tic Tac", 2), 5));
        myCart.add(new CartItem(3, new Product("PR234019", "Office Chair", 140), 1));

        System.out.println(myCart);
        System.out.println("Total Price: " + myCart.totalPrice());
    }
}
