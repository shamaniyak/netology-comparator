import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Семен", "Слепаков", 30));
        persons.add(new Person("Вася", "Бубун Чума", 22));
        persons.add(new Person("Коля", "Иванов", 50));
        persons.add(new Person("Петя", "Пупкин Кудрявый Младший", 40));

        Comparator<Person> comparator = (Person p1, Person p2) -> {
            int maxLength = 2;
            String[] words1 = p1.getSurname().split(" ");
            String[] words2 = p2.getSurname().split(" ");
            int l1 = words1.length;
            if(l1 > maxLength) l1 = maxLength;
            int l2 = words2.length;
            if(l2 > maxLength) l2 = maxLength;
            if(l1 != l2) {
                return words2.length - words1.length;
            }
            return p2.getAge() - p1.getAge();
        };
        persons.sort(comparator);

        System.out.println(persons);
    }
}
