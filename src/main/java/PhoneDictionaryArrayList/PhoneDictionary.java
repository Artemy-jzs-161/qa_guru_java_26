package PhoneDictionaryArrayList;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        System.out.println(persons.add(person));

    }

    public void remove(int index) {
        System.out.println(persons.remove(index));
    }

    public Person searchByName(String name) {
        for (Person person : persons) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PhoneDictionary{" +
                "persons=" + persons +
                '}';
    }
}