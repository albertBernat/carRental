package pl.carrental.carrental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.carrental.carrental.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}
