package web.CarDao;

import org.springframework.stereotype.Repository;
import web.Model.Car;

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
}
