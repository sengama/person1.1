import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Person> persons = new TreeSet<>();

        // Adaugarea unor persoane in TreeSet
        persons.add(new Person("Ion", 65));
        persons.add(new Person("Maria", 20));
        persons.add(new Person("Ana", 25));
        persons.add(new Person("George", 40));
        persons.add(new Person("Vasile", 70));
        persons.add(new Person("Iura",81));

        System.out.println("Persoanele care au varsta mai mare de 60 de ani sunt:");
        for (Person person : persons) {
            if (person.getAge() > 60) {
                System.out.println(person.toString());
            }
        }
    }
}