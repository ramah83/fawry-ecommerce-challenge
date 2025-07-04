import java.util.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rammah", 10000);

        Product cheese = new shop_expire_prodect("Cheese", 100, 5, false, 400);
        Product biscuits = new shop_expire_prodect("Biscuits", 150, 3, false, 700);
        Product Milk = new shop_expire_prodect("Milk", 200, 1, false, 850);
        Product tv = new shop_expire_prodect("TV", 3000, 2, true, 10000);
        Product scratchCard = new shop_expire_prodect("scratchCard", 50, 10, true, 100);

        shopping_Cart OCart = new shopping_Cart();
        OCart.addItem(cheese, 2);
        OCart.addItem(biscuits, 1);
        OCart.addItem(Milk, 1);
        OCart.addItem(tv, 2);
        OCart.addItem(scratchCard, 1);

        shopping_Cart SCart = new shopping_Cart();
        for (var item : OCart.getItems().entrySet()) {
            Product p = item.getKey();
            int quantity = item.getValue();

            if (p instanceof expire_product && ((expire_product) p).isExpired()) {
                continue;
            }
            SCart.addItem(p, quantity);
        }

        if (SCart.getItems().isEmpty()) {
            throw new RuntimeException("Cart is empty");
        }
        double subtotal = SCart.calcTotal();
        List<ifShipping> shippables = SCart.getifShipping();
        double shippingCost = shippables.size() * 10;
        double total = subtotal + shippingCost;

        if (customer.getBalance() < total) {
            throw new RuntimeException("Not enough balance");
        }

        for (var item : SCart.getItems().entrySet()) {
            item.getKey().lowerStock(item.getValue());
        }

        customer.withdraw(total);

        System.out.println("** Shipment notice **");
        Map<String, Integer> grouped = new HashMap<>();
        double TWeight = 0;
        for (ifShipping item : shippables) {
            grouped.put(item.getname(), grouped.getOrDefault(item.getname(), 0) + 1);
            TWeight += item.getweight();
        }
        for (var x : grouped.entrySet()) {
            String name = x.getKey();
            int count = x.getValue();
            double weight = 0;
            for (ifShipping item : shippables) {
                if (item.getname().equals(name)) {
                    weight = item.getweight();
                    break;
                }
            }
            System.out.println(count + "X " + name + "      " + (int)weight + "G");
        }

        System.out.println("Total Package Weight " + (TWeight / 1000) + "KG");

        System.out.println();

        System.out.println("** Checkout receipt **");
        for (var item : SCart.getItems().entrySet()) {
            Product p = item.getKey();
            int quantity = item.getValue();
            System.out.print(quantity + "x " + p.getName() +"      ");
            System.out.println(quantity * p.getPrice());
        }

        System.out.println("-----------------------------");
        System.out.println("Subtotal " + (int)subtotal);
        System.out.println("Shiping " + (int)shippingCost);
        System.out.println("Amount " + (int)total);
    }
}
