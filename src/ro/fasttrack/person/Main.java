package ro.fasttrack.person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Maria", 33);
        Person person2 = new Person("Marius", 28);
        Person person3 = new Person("Vlad", 49);
        Person person4 = new Person("Mihai", 39);

        person1.getPosition().add("Manager");
        person2.getPosition().add("Welder");
        person3.getPosition().add("Carpenter");

        System.out.println(person1.getPosition());

    }

}
