import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxLength = 1;
    public PersonComparator(int maxLength) {
        this.maxLength = maxLength;
    }
    @Override
    public int compare(Person o1, Person o2) {
        String[] words1 = o1.getSurname().split(" ");
        String[] words2 = o2.getSurname().split(" ");
        int l1 = words1.length;
        if(l1 > maxLength) l1 = maxLength;
        int l2 = words2.length;
        if(l2 > maxLength) l2 = maxLength;
        if(l1 != l2) {
            return words2.length - words1.length;
        }
        return o2.getAge() - o1.getAge();
    }
}
