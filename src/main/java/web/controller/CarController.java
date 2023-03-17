package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService carsList = new CarServiceImp();


    @GetMapping(value = "/cars")
    public String printTable(@RequestParam(name = "count", defaultValue = "0") int count, ModelMap model) {
        model.addAttribute("cars", carsList.getListCar(carsList.add(), count));
        return "сar";
    }

}
