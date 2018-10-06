package web.Repository;

import org.springframework.data.repository.CrudRepository;
import web.Entity.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
