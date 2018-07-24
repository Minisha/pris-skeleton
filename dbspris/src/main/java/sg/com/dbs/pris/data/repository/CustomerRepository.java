package sg.com.dbs.pris.data.repository;

import org.springframework.data.repository.CrudRepository;
import sg.com.dbs.pris.data.model.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

}