package fundamentals;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("Hello Patricia");

        System.out.println("switch again");

        Animal animal = new Cat();
        animal.walk();
        System.out.println(animal.n);

        System.out.println(10 * 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 * 20);
        System.out.println("Javatpoint" + 10 + 20);

        String a1 = "Ana";
        String a2 = "Ana";
        String a3 = new String("Ana");
        String a4 = new String ("Ana");
        System.out.println(a1 == a2); // true
        System.out.println(a1 == a3); //false
        System.out.println(a3.equals(a4)); //true

        ImmutableClass immutableClass = new ImmutableClass(3, "a");
        // immutableClass.x = 3;
        // System.out.println(immutableClass.x);
        // immutableClass.x = 5;
        // System.out.println(immutableClass.x);

        System.out.println(immutableClass.getX());
    }
}
