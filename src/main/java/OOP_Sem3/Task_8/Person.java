package OOP_Sem3.Task_8;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Создание списка объектов Person
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 20));

        // Использование Comparator для сортировки по имени в алфавитном порядке
        Comparator<Person> nameComparator =(p1,p2)->(p1.getName().compareTo(p2.getName()));

//        Comparator<Person> nameComparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.getName().compareTo(p2.getName());
//            }
//        };

        Collections.sort(persons, nameComparator);

        // Вывод отсортированного списка
        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}