package ru.vladuss.adminka_linux.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vladuss.adminka_linux.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private List<Car> carList = new ArrayList<>();

    @GetMapping("/allCars")
    public String getAllCars(Model model) {
        model.addAttribute("cars", carList);
        return "Cars";
    }

    @GetMapping("/create")
    public String showFormForCreateCar(Model model) {
        model.addAttribute("car", new Car());
        return "CreateCar";
    }

    @PostMapping
    public String createCar(@ModelAttribute Car car) {
        car.setId(Long.valueOf(carList.size() + 1));
        carList.add(car);
        return "redirect:/cars/allCars";
    }
}
