public class shop_expire_prodect extends expire_product implements ifShipping {
    private double weight;

    public shop_expire_prodect() {
    }

    public shop_expire_prodect(String name, int price, double quantity, boolean expired, double weight) {
        super(name, quantity, price, expired);
        this.weight = weight;
    }

    @Override
    public String getname() {
        return super.getName();
    }

    @Override
    public double getweight() {
        return weight;
    }
}
