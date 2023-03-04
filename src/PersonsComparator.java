import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    private int maxSurnameLength;
    public PersonsComparator(int num) {
        maxSurnameLength = num;
    }
    @Override
    public int compare(Person o1, Person o2) {
        String[] wordsInO1Surname = o1.getSurname().split("[-, ]");
        int o1NumWords = wordsInO1Surname.length;
        String[] wordsInO2Surname = o2.getSurname().split("[-, ]");
        int o2NumWords = wordsInO2Surname.length;

        if (o1NumWords < maxSurnameLength && o2NumWords < maxSurnameLength) {
            if (Integer.compare(o2NumWords, o1NumWords) != 0) {
                return Integer.compare(o2NumWords, o1NumWords);
            } else
                return Integer.compare(o2.getAge(), o1.getAge());
        } else
            return Integer.compare(o2.getAge(), o1.getAge());
    }
}
