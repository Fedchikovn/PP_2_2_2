package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "White", 2021));
        cars.add(new Car("Mercedes-Benz", "Deep blue", 2023));
        cars.add(new Car("Porche", "Olive", 2024));
        cars.add(new Car("Ferrari", "Red", 2022));
        cars.add(new Car("Audi", "Grey", 2024));

    }

    public List<Car> index() {
        return cars;
    }

}
