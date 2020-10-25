package fundamentals;

public class Animal {
    String color;
    int n;
    Object obj;

     Animal(String color) {
        this.color = color;
    }

    Animal() {
         this("negru");
    }

    public static void walk() {
        System.out.println("animal walks");
    }
}
