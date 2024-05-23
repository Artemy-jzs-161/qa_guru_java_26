package CarHashMap;

import java.util.HashMap;
import java.util.Map;

public class CarMarket {

    private Map<String, Car> cars = new HashMap<>();

    public void addCar(String id, Car car) {
        System.out.println(cars.put(id, car));
    }

    public void removeCar(String id) {
        System.out.println(cars.remove(id));
    }

    public Car searchCarById(String id) {
        return cars.get(id);
    }

    @Override
    public String toString() {
        return "CarDictionary{" +
                "cars=" + cars +
                '}';
    }

}
