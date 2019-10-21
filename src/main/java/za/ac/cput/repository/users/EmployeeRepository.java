package za.ac.cput.repository.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
