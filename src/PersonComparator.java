import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String[] words1 = o1.getSurname().split(" ");
        String[] words2 = o2.getSurname().split(" ");
        if(words1.length != words2.length) {
            return words2.length - words1.length;
        }
        return o2.getAge() - o1.getAge();
    }
}
