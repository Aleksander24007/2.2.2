package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {


    @Override
    public List<Car> getListCar(List<Car> cars, int amount) {
        if (amount > 0 && amount < 5) {
            return cars.stream().limit(amount).toList();
        }
        return cars;
    }

    @Override
    public List<Car> add() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Black", "Ford", 123));
        cars.add(new Car("white", "BMW", 543));
        cars.add(new Car("Black", "Volga", 34223));
        cars.add(new Car("gray", "skoda", 5423234));
        cars.add(new Car("yellow", "Honda", 55423));
        return cars;
    }
}
