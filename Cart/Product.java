public class Product {
    private String SKU;
    private String name;
    private int price;

    public Product(String SKU, String name, int price) {
        this.SKU = SKU;
        this.name = name;
        this.price = price;
    }
    
    public Product() {}

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String sKU) {
        SKU = sKU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
