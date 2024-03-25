package web.service;

import web.DAO.CarDAOImpl;
import web.model.Car;

import java.util.List;

public class CarService {
    private CarDAOImpl carIntDAO = new CarDAOImpl();

    public List<Car> listCar() {
        return carIntDAO.carsList();
    }


    public List<Car> filter(List<Car> cars, int value) {
        return carIntDAO.filterCar(cars,value);
    }

}
