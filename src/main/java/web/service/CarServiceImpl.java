package web.service;

import web.DAO.CarDAOImpl;
import web.DAO.CarIntDAO;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    private CarIntDAO carIntDAO = new CarDAOImpl();

    @Override
    public List<Car> listCar() {
        return carIntDAO.carsList();
    }

    @Override
    public List<Car> filter(List<Car> cars, int value) {
        return carIntDAO.filterCar(cars, value);
    }

}
