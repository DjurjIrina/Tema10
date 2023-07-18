package ro.fasttrack.buquet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Buquet {
    private  static Set<String> flowers;

    public Buquet() {
        this.flowers = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buquet buquet = (Buquet) o;
        return Objects.equals(flowers, buquet.flowers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowers);
    }

    public Set<String> getFlowers() {
        return flowers;
    }
}
