package com.storeBascetCreate;


/**
 * Есть сущность «Товар». У каждого товара есть артикул, имя и цена.
 */
public abstract class Product {
    final private Integer idProduct;
    final private String nameProduct;
    final private Double priceProduct;

    public Product(Integer idProduct, String nameProduct, Double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }


    public Double getPriceProduct() {
        return priceProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    @Override
    public String toString() {
        return "{" +
                "nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }


    public String getNameProduct() {
        return nameProduct;
    }
}
