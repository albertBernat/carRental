package pl.carrental.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.carrental.carrental.model.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {
}
