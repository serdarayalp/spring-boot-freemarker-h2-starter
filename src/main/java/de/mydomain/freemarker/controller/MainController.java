package de.mydomain.freemarker.controller;

import de.mydomain.freemarker.model.Car;
import de.mydomain.freemarker.model.City;
import de.mydomain.freemarker.service.ICityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class MainController {

    private final ICityService cityService;

    public MainController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/")
    public ModelAndView index() {

        var params = new HashMap<String, Object>();
        params.put("userId", 100000);
        params.put("firstName", "Max");
        params.put("lastName", "Mustermann");

        return new ModelAndView("index", params);
    }

    @GetMapping(value = "/cities")
    public ModelAndView cities() {

        List<City> cities = cityService.findAll();

        var params = new HashMap<String, Object>();
        params.put("cities", cities);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW","3er",1990));
        cars.add(new Car("Audi","Q5",1997));
        cars.add(new Car("Mercedes","E-Klasse",2000));
        params.put("cars", cars);

        return new ModelAndView("showCities", params);
    }
}