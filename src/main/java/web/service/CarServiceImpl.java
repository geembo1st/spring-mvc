package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"BMW",2000));
        cars.add(new Car(2,"Merc",2300));
        cars.add(new Car(3,"Porsche",2500));
        cars.add(new Car(4,"Lada",1000));
        cars.add(new Car(5,"Audi",1500));
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public Car getCarById(int id) {
        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }
}
