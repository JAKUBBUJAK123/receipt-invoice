public class test {
    public static void main(String[] args) {
        product a = new product("Clean Code, Robert C.", 100.00, 8);
        product b = new product("Applying UML, C. Larman", 300.00, 8);
        product c = new product("shipping", 50.00, 23);
        calculateVat calculator = new calculateVat();
        calculator.addProduct(a);
        calculator.addProduct(b);
        calculator.addProduct(c);
        calculator.calculate();
    }
}
