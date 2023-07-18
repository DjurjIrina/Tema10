package ro.fasttrack.basket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {
    private static  List<String> fruits;

    public List<String> getFruits() {
        return fruits;
    }


    public Basket() {
        this.fruits = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(fruits, basket.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruits);
    }
}
