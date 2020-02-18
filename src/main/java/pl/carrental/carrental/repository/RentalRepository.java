package pl.carrental.carrental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.carrental.carrental.model.Rental;

@Repository
public interface RentalRepository extends CrudRepository<Rental, Long> {
}
