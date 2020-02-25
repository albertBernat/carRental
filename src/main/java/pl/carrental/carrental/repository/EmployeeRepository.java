package pl.carrental.carrental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.carrental.carrental.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
