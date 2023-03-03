import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    private int maxSurnameLength;
    public PersonsComparator(int num) {
        maxSurnameLength = num;
    }
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() < maxSurnameLength && o2.getSurname().length() < maxSurnameLength) {
            if (Integer.compare(o2.getSurname().length(), o1.getSurname().length()) != 0) {
                return Integer.compare(o2.getSurname().length(), o1.getSurname().length());
            } else
                return Integer.compare(o2.getAge(), o1.getAge());
        } else
            return Integer.compare(o2.getAge(), o1.getAge());
    }
}
