import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Семен", "Слепаков", 30));
        persons.add(new Person("Вася", "Бубун Чума", 22));
        persons.add(new Person("Коля", "Иванов", 50));

        Collections.sort(persons, new PersonComparator());

        System.out.println(persons);
    }
}
