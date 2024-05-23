package CarHashMap;

public class Main {
    public static void main(String[] args) {
        CarMarket carDictionary = new CarMarket();
        carDictionary.addCar("ABC123", new Car("Toyota", "Corolla", 2019));
        carDictionary.addCar("XYZ789", new Car("Honda", "Civic", 2020));
        carDictionary.addCar("LMN456", new Car("Ford", "Focus", 2018));

        System.out.println(carDictionary);

        String searchId = "XYZ789";
        Car foundCar = carDictionary.searchCarById(searchId);

        if (foundCar != null) {
            System.out.println("Found: " + foundCar);
        } else {
            System.out.println("Car not found: " + searchId);
        }

        carDictionary.removeCar("LMN456");
        System.out.println(carDictionary);

    }
}
