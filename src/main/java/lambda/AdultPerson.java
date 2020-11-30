package lambda;

import java.util.function.Predicate;

public class AdultPerson implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.getAge() >= 18;
    }

}
