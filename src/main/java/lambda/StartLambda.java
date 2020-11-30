package lambda;

import com.sun.xml.internal.ws.policy.sourcemodel.AssertionData;

import javax.lang.model.util.AbstractAnnotationValueVisitor6;
import java.util.*;
import java.util.function.*;

public class StartLambda {

    public static void main(String[] args) {

        //without lambda + adultPerson class
        Person person3 = new Person(26, "ion", "popescu");
        Predicate<Person> adultTest = new AdultPerson();
        System.out.println(adultTest.test(person3));

        //with lambda
        Person person2 = new Person(12, "maria", "popescu");
        Predicate<Person> lambdaAdultTest = (person) -> person.getAge() >= 18;
        System.out.println(lambdaAdultTest.test(person2));

        Runnable runnable = () -> System.out.println("This is now running");
        runnable.run();

        Predicate<String> endsWithTest = (string) -> string.endsWith("ant");
        System.out.println(endsWithTest.test("restaurant"));

        Function<String, Integer> stringLenght = s -> s.length();
        System.out.println(stringLenght.apply("Mere"));

        Function<Person, Integer> getAgeFunction = person -> person.getAge();
        System.out.println(getAgeFunction.apply(person2));
        System.out.println(getAgeFunction.apply(person3));

        Supplier<Integer> takeRandomInt = () -> new Random().nextInt();
        Supplier<Person> personSupplier = () -> new Person(35, "Patricia", "Balan");
        System.out.println("Person supplier is " + personSupplier.get());
        System.out.println("Supplier output " + takeRandomInt.get());

        Consumer<Integer> consumer = number -> System.out.println(number);
        consumer.accept(5);

        Consumer<Person> personConsumer = person -> System.out.println(person.getAge());
        personConsumer.accept(new Person(30, "Patricia", "Balan"));

        Consumer<Person> bodyConsumer = person -> {
            System.out.println("Over 5 years person will have " + (person.getAge() + 5));
        };
        Person adult = new Person(24, "Fulop", "Adrian");
        System.out.println("Adult before :" + adult);
        bodyConsumer.accept(adult);
        System.out.println(adult);

        UnaryOperator<Double> doubleSquere = d -> d * d;
        System.out.println("Unary op results is: " + doubleSquere.apply(4.0));

        Function<Person, Integer> getAgeWithReference = Person::getAge;
        System.out.println(getAgeWithReference.apply(adult));



        System.out.println("_____Homework____");

        System.out.println("a)");

        BinaryOperator<Integer> addition = (x,y) -> x + y;
        System.out.println("Addition is : " + addition.apply(5, 4));

        BinaryOperator<Integer> multiplication = (x, y) -> y * x;
        System.out.println("Multiplication is : " + multiplication.apply(4, 5));

        BinaryOperator<Integer> substraction = (z,t) -> z - t;
        System.out.println("Substraction is : " + substraction.apply(10, 4));

        BinaryOperator<Double> division = (t, u) -> t / u;
        System.out.println("Division is " + division.apply(12.0, 4.0));

        System.out.print("b)");

        List<Integer> listOfIntElements = Arrays.asList(2,4,5,6,7,8);
        Function<List<Integer>, Integer> sumOfElements = sumList -> sumList.stream().mapToInt(intElement -> intElement.intValue()).sum();
        Function<List<Integer>, Integer> sum = list -> {
            int suma = 0;
            for (int i = 0; i < list.size(); i++) {
                suma = suma + list.get(i);
            }
            return suma;
        };
        System.out.println(sum.apply(listOfIntElements));
        System.out.println(sumOfElements.apply(listOfIntElements));

        System.out.print("c)");

        List<String> listOfStringElements = Arrays.asList("masina", "casa", "caine", "tort", "pisica");
        Function<List<String>, Long> sumOfString = sumString -> sumString.stream().count();
        Function<List<String>, Integer> countString = listOfStrings -> listOfStrings.size();
        Function<List<String>, Integer> countStrings = List::size;
        System.out.println(countString.apply(listOfStringElements));
        System.out.println(countStrings.apply(listOfStringElements));
        System.out.println(sumOfString.apply(listOfStringElements));

        System.out.print("d)");

        List<String> stringElements = Arrays.asList("Masina", "casa", "Caine", "tort", "pisica");
        System.out.println("lista elementelor este: " + stringElements);
        Consumer<List<String>> sortList = listOfStrings -> {
            //listOfStrings.sort(String::compareToIgnoreCase);
            //Collections.sort(listOfStrings);
            Collections.sort(listOfStrings, String::compareToIgnoreCase);
        };
        sortList.accept(stringElements);
        System.out.println(stringElements);


    }
}
