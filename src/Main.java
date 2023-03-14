import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons= new ArrayList<>();
        persons.add(new Person("Vanya", "Pavlov", 25));
        persons.add(new Person("Sveta", "Grenadina-Jukova", 18));
        persons.add(new Person("Sasha", "Barsukov", 38));
        persons.add(new Person("Korney", "Lubovich Trumov", 44));
        persons.add(new Person("Tanya", "Zubina", 25));
        persons.add(new Person("Ctas", "Krot", 30));
        persons.add(new Person("Elena", "Jess Krown-Dabur", 27));
        System.out.println(persons);
        
        Comparator<Person> comparator = (o1, o2) -> {
            int maxSurnameLength = 3;
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
        };
        Collections.sort(persons, comparator);
        System.out.println("После сортировки 1 сортировки(кто знатнее(или старше) - тот выше): ");
        System.out.println(persons);
    }
}