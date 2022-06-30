package com.storeBascetCreate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {
    private double basketPrice = 0;

    Map<Integer, Product> assortment = new HashMap<>();
    List<Product> listProduct = new ArrayList<>();

    {
        Product orange = new Fruit(2001011, "Orange", 1);
        Product apple = new Fruit(2057731, "Apple", 2);
        Product lemon = new Fruit(2065031, "Lemon", 3);
        assortment.put(orange.getIdProduct(), orange);
        assortment.put(apple.getIdProduct(), apple);
        assortment.put(lemon.getIdProduct(), lemon);
    }

    public void addProduct(Integer index) {
        Product product = assortment.get(index);
        if (product != null) {
            listProduct.add(product);
            System.out.println("Товар " + product.getNameProduct() + " добавлен в корзину.");

        } else {
            System.out.println("Товар с ID " + index + " в ассортименте отсутсвует");
        }

    }

    public double calculateBasket() {
        return listProduct.stream().mapToDouble(Product::getPriceProduct).sum();
    }


    public Map<Integer, Product> getAssortment() {
        return assortment;
    }


}

