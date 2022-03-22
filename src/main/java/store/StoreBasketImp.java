package store;

import java.util.*;

public class StoreBasketImp implements Basket {

    private Map<String, Integer> card = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        card.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        card.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (card.containsKey(product)) {
            int quantityUpdate = card.get(product);
            quantityUpdate = quantity + quantityUpdate;
            card.put(product, quantityUpdate);
        } else {
            card.put(product, quantity);
        }
    }

    @Override
    public void clear() {
        card.clear();
    }

    @Override
    public List<String> getProducts() {
        Set<String> products = card.keySet();
        return new ArrayList<>(products);
    }

    @Override
    public int getProductQuantity(String product) {
        return card.get(product);
    }
}
