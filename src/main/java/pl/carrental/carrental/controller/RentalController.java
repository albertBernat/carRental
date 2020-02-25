package pl.carrental.carrental.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.carrental.carrental.model.Rental;
import pl.carrental.carrental.repository.RentalRepository;

import java.util.List;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    private final RentalRepository rentalRepository;

    public RentalController(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @GetMapping
    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Rental getRentalById(@PathVariable Long id) {
        return rentalRepository.findById(id).get();
    }

    @PostMapping
    public void addRental(@RequestBody Rental rental) {
        rentalRepository.save(rental);
    }

    @DeleteMapping("/{id}")
    public void deleteRental(@PathVariable Long id) {
        rentalRepository.deleteById(id);
    }
}
