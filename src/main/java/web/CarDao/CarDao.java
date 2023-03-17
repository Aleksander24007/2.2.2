package web.CarDao;

import web.Model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getListCar(List<Car> cars, int amount);

}
