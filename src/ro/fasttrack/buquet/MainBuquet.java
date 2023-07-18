package ro.fasttrack.buquet;

public class MainBuquet {
    public static void main(String[] args) {
        Buquet buquet = new Buquet();
        buquet.getFlowers().add("Rose");
        buquet.getFlowers().add("Tulip");
        buquet.getFlowers().add("Daisy");
        buquet.getFlowers().add("Lily");

        System.out.println(buquet.getFlowers().remove("Tulip"));
        System.out.println(buquet.getFlowers().size());
        buquet.getFlowers().forEach(System.out::println);

    }
}
