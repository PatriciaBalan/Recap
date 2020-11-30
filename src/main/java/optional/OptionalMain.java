package optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        Optional<String> optionalEx = Optional.ofNullable(null);

        if (optionalEx.isPresent()) {
            String result = optionalEx.get();
            System.out.println(result);
        }

        Optional<String> optionalEx2 = Optional.empty();
        System.out.println(optionalEx.isPresent());

        String optionalEx3 = Optional.of("abc").orElse("def");
        //String result = optionalEx3.orElse("def");
        System.out.println(optionalEx3);
    }
}