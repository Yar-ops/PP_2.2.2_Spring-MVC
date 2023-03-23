package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", CarService.countCarList(count));
        return "cars";
    }
}
