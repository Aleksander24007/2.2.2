package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> getListCar(List<Car> cars, int amount) {
        return carDao.getListCar(cars, amount);
    }

    public List<Car> add() {
        return carDao.add();
    }
}
