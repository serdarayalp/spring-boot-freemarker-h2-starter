package de.mydomain.freemarker.controller;

import de.mydomain.freemarker.service.ICityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class MainController {

    private final ICityService cityService;

    public MainController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping(value = "/cities")
    public ModelAndView showCities() {

        var cities = cityService.findAll();

        var params = new HashMap<String, Object>();
        params.put("cities", cities);

        return new ModelAndView("showCities", params);
    }
}