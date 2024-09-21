import java.util.List;
import java.util.Map;


public class ProductSum {
    double priceMethod(List<String> Productlist, Map<String, Double> map) {

        double price = 0.0;

        for (String productName : Productlist) {
            if (map.containsKey(productName)) {
                price += map.get(productName);
            } else {
                System.out.println("Not " + productName + "found");
            }
        }
        return price;
    }
}