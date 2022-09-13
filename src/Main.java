import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Семен", "Слепаков", 30));
        persons.add(new Person("Вася", "Бубун Чума", 16));
        persons.add(new Person("Коля", "Иванов", 50));
        persons.add(new Person("Петя", "Пупкин Кудрявый Младший", 40));
        persons.add(new Person("Frenk", "Havi Mettal", 12));

        persons.sort(new PersonComparator(2));
        Predicate<Person> predicate = (Person p) -> p.getAge() < 18;
        persons.removeIf(predicate);

        System.out.println(persons);
    }
}
