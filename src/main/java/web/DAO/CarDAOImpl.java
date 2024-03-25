
package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDAOImpl implements CarIntDAO {

    @Override
    public List<Car> carsList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("model1",100,"color1"));
        carList.add(new Car("model2",200,"color2"));
        carList.add(new Car("model3",300,"color3"));
        carList.add(new Car("model4",400,"color4"));
        carList.add(new Car("model5",500,"color5"));
        return carList;
    }

    @Override
    public List<Car> filterCar(List<Car> cars, int value) {
        if(value < 0) {
            return null;
        }
        if(value == 0 ||value >= 5 ) {
            return cars;
        }
        return cars.stream().limit(value).collect(Collectors.toList());
    }
}