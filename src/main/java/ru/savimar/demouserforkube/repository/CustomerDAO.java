package ru.savimar.demouserforkube.repository;

import org.springframework.data.repository.CrudRepository;
import ru.savimar.demouserforkube.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
