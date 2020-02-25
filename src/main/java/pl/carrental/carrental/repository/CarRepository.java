package pl.carrental.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.carrental.carrental.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
