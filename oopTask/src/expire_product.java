public class expire_product extends Product{
  private boolean expired ;
    public expire_product() {

    }
    public expire_product(String name , double price , int quantity, boolean expired) {
        super(name, price, quantity);
        this.expired=expired;
    }
    public boolean isExpired() {
        return expired;
    }
}
