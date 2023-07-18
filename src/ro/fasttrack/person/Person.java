package ro.fasttrack.person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> position;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.position = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getPosition() {
        return position;
    }
}
