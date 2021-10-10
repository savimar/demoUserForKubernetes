package ru.savimar.demouserforkube.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.savimar.demouserforkube.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
