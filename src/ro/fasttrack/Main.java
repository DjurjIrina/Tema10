package ro.fasttrack;

import ro.fasttrack.basket.Basket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("mar");
        fruits.add("portocala");
        fruits.add("portocala");
        fruits.add("portocala");
        fruits.add("para");
        fruits.stream().distinct().forEach(System.out::println);


        if (fruits.indexOf("para") !=-1) {
            System.out.println(fruits.indexOf("para"));
        }


        if (fruits.contains("portocala")) {
            System.out.println(true);
        }
        System.out.println(fruits.stream().count());


        Basket basket = new Basket();
        basket.getFruits().add("mar");
        basket.getFruits().add("nectarina");
        basket.getFruits().add("pepene verde");
        System.out.println(basket.getFruits().size());
        System.out.println(basket.getFruits().remove("mar"));
        System.out.println(basket.getFruits().remove("pepene galben"));
        System.out.println(basket.getFruits().get(1));
        basket.getFruits().add("pepene verde");
        basket.getFruits().add("nectarina");
        basket.getFruits().stream().distinct().forEach(System.out::println);

    }
}
