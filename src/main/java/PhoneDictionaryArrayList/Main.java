package PhoneDictionaryArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneDictionary dictionary = new PhoneDictionary();

        dictionary.add(new Person("Artem", "Borovik", "89133333", "NSK"));
        dictionary.add(new Person("Petya", "Petrov", "89522222", "OMSK"));
        dictionary.add(new Person("Anton", "Antonov", "89993333", "SPB"));
        dictionary.add(new Person("Alexey", "Alexeev", "83333333", "MSK"));
        System.out.println(dictionary);

        dictionary.remove(3);
        System.out.println(dictionary);

        String name = "Artem";
        Person person = dictionary.searchByName(name);

        if (person != null) {
            System.out.println("found " + person);
        } else System.out.println("Person " + name + "not found");


    }
}
