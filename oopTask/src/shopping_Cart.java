import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class shopping_Cart {
    private Map<Product, Integer>items= new LinkedHashMap<>();
    public void addItem(Product product,int quantity){
        if(product.getQuantity()>=quantity){
            items.put(product, items.getOrDefault(product, 0) + quantity);
        }
        else {
            throw new IllegalArgumentException("Can't cover that amount");
        }
    }
    public Map<Product, Integer> getItems() {
        return items;
    }
    public double calcTotal() {
        double total = 0;
        for (var entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
    public List<ifShipping> getifShipping() {
        List<ifShipping> result = new ArrayList<>();
        for (var item : items.entrySet()) {
            if (item.getKey() instanceof ifShipping) {
                for (int i = 0; i < item.getValue(); i++) {
                    result.add((ifShipping) item.getKey());
                }
            }
        }
        return result;
    }
}
