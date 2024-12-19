package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping
    public String index(Model model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> carList = carService.index();
        int listSize = carList.size();

        if (count == null || count >= listSize) {
            count = listSize;
        }

        model.addAttribute("count", count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}