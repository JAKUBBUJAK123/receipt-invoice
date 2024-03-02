import java.util.ArrayList;

public class calculateVat {
    private ArrayList<product> products = new ArrayList<>();

    public void addProduct(product p){
        products.add(p);
    }
    public void calculate(){
        double brutto8 = 0;
        double brutto23 = 0;
        double netto8 = 0;
        double netto23 = 0;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getVat() == 8){
                netto8 += products.get(i).getPrice();
                brutto8 += products.get(i).getPrice() + (products.get(i).getPrice() * 0.08);
            }else if(products.get(i).getVat() == 23){
                netto23 += products.get(i).getPrice();
                brutto23 += products.get(i).getPrice() + (products.get(i).getPrice() * 0.23);
            }
        }
        System.out.println("|          | Total netto | Total brutto |");
        System.out.println("|---------------------------------------|");
        System.out.println("| Vat 8%   |    "+ netto8 + "     |    " + brutto8+ "    |");
        System.out.println("| Vat 23%  |    "+ netto23 + "      |    " + brutto23+ "     |");

    }
}