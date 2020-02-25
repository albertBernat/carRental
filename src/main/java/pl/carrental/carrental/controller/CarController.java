package pl.carrental.carrental.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.carrental.carrental.model.Car;
import pl.carrental.carrental.repository.CarRepository;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car getCarById(@PathVariable Long id) {
        return carRepository.findById(id).get();
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        carRepository.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
    }
}
