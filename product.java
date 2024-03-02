public class product {
    private String name;
    private double price;
    private double vat;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getVat() {
        return vat;
    }
    public void setVat(double vat) {
        this.vat = vat;
    }
    public product(String name, double price, double vat) {
        this.name = name;
        this.price = price;
        this.vat = vat;
    }
    
}