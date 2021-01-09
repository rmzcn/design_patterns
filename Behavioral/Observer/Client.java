package Behavioral.Observer;

public class Client {
    public static void main(String[] args) {
        Subject product = new Subject();
        //observer setups
        UserObserver userObserver = new UserObserver(product);
        OtherStoreObserver otherStoreObserver = new OtherStoreObserver(product);
        System.out.println("set price to : 25.3");
        product.setPrice(25.3f);
        System.out.println("set price to : 15.3");
        product.setPrice(15.3f);
    }
}
