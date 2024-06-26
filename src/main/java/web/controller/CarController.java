package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String listsCar (@RequestParam(value = "value", defaultValue = "5")int numberCars, Model model) {
        model.addAttribute("list", carService.filter(carService.listCar(), numberCars));
        return "cars";
    }
}