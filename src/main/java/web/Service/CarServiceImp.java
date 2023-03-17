package web.Service;

import org.springframework.stereotype.Service;
import web.CarDao.CarDao;
import web.CarDao.CarDaoImp;
import web.Model.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarService{

    CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> getListCar(List<Car> cars, int amount) {
        return carDao.getListCar(cars,amount);
    }
}
