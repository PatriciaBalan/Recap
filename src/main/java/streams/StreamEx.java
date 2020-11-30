package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dacia", "Mercedes", "Toyota", "BMW");
        Stream<String> nameStream = names.stream();
        List<String> namesFromStream = nameStream.collect(Collectors.toList());
        System.out.println(namesFromStream);

        //System.out.println(nameStream.count());
        names.stream().forEach(n -> System.out.println(n)); // consumerul este n -> ...
            // am pus tot name.stream si nu nameStream pt ca nu se poate refolosi un stream
            // pt care am lucrat deja -> count.

        Optional<String> firstElem = names.stream().findFirst();
        if(firstElem.isPresent()) {
            System.out.println("First element is: " + firstElem.get());
        }

        Optional<String> elem = names.stream().findAny();
        if(elem.isPresent()) {
            System.out.println("Any element is: " + elem.get());
        }

        System.out.println("_________________________");

        List<String> endWithA = names.stream()
                .peek(System.out::println)
                .filter(n -> n.endsWith("a"))
                .peek(System.out::println) // folosit pt a vedea exact ce s-a facut in fitru; e greu sa faci debug
                .collect(Collectors.toList());

        List<Integer> countLetters = names.stream()
                //.peek(System.out::println)
                .filter(n -> n.endsWith("a"))
                .map(String::length)
                //.peek(System.out::println) // folosit pt a vedea exact ce s-a facut in fitru; e greu sa faci debug
                .collect(Collectors.toList());
        System.out.println(countLetters);

        // calculati suma literelor din lista de nume avuta
        int countTotalLetters = names.stream()
                .mapToInt(String::length).sum();
        System.out.println(countTotalLetters);


        //reduce method
        String concatenatedNames = names.stream()
                .reduce("",(currentValue, element) -> currentValue.isEmpty() ? currentValue + element
                        : currentValue + ", " + element);
        System.out.println(concatenatedNames);


        System.out.print("___________________Homework__________");

        List<String> stringNames = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> intNumbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 63, 50);
        Stream<String> namesStream = stringNames.stream();


        System.out.println("a)");
        List<String> sortedList = stringNames.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> sortedNumbers = intNumbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);


        System.out.println("b)");
        List<String> startWithE = stringNames.stream()
                .filter(n -> n.startsWith("E"))
                .peek(System.out::println)
                .collect(Collectors.toList());


        System.out.println("c)");
        List<Integer> printInteger = intNumbers.stream()
                .filter(n -> n > 30 && n < 200)
                .collect(Collectors.toList());
        System.out.println(printInteger);


        System.out.println("d)");
        List<String> uppercaseNames = stringNames.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(uppercaseNames);


        System.out.println("e)");
        List<String> removeLetterSortPrint = stringNames.stream()
                .filter(str -> str.length() != 0)
                .map(str -> str.substring(1, str.length() - 1))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(removeLetterSortPrint);


        System.out.println("f)");
        List<String> reversedSort = stringNames.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reversedSort);

                // Comparator<String> comp =  (aName, bName) -> bName.compareTo(aName);
                // stream().sort(comp).collect
    }
}

//mapToInt(Person::getAge).avg();
