import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons= new ArrayList<>();
        persons.add(new Person("Vanya", "Pavlov", 12));
        persons.add(new Person("Sveta", "Grenadina-Jukova", 18));
        persons.add(new Person("Sasha", "Barsukov", 38));
        persons.add(new Person("Korney", "Lubovich Trumov", 15));
        persons.add(new Person("Tanya", "Zubina", 25));
        persons.add(new Person("Ctas", "Krot", 30));
        persons.add(new Person("Elena", "Jess Krown-Dabur", 27));
        System.out.println(persons);

        Predicate<Person> under18 = p1 -> p1.getAge() < 18;

        persons.removeIf(under18);

        System.out.println(persons);
    }
}