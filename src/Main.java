import java.util.ArrayList;
import java.util.Collections;

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
        Collections.sort(persons, new PersonsComparator(5));
        System.out.println("После сортировки 1 сортировки(кто знатнее(или старше) - тот выше): ");
        System.out.println(persons);
        System.out.println("После сортировки 2 сортировки(кто знатнее(или старше) - тот выше): ");
        Collections.sort(persons, new PersonsComparator(2));
        System.out.println(persons);

    }
}