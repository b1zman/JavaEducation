package com.storeBascetCreate;

import java.util.Scanner;

/**
 * Создать магазин
 * Есть сущность «Товар». У каждого товара есть артикул, имя и цена.
 * Пользователь вводит акртикулы через запятую и на экран выводится следующее:
 * -Общая стоимость покупок
 * -Список покупок
 * Если пользователь ввел артикул, которого нет в системе - бросить исключение
 * Заюзать абстрактные классы
 * Для хранение ассортимента используй HashMap
 * Для хранения списка покупок используй List
 * Попробовать вместо forEach цикла заюзать StreamAPI
 */

public class Shop {

    public static void main(String[] args) {

        Basket basket = new Basket();
        Scanner addSc = new Scanner(System.in);
        System.out.println(basket.getAssortment());
        do {
            basket.addProduct(addSc.nextInt());
        }
        while (!addSc.hasNext("stop"));
        System.out.println(basket.calculateBasket());
    }

}
