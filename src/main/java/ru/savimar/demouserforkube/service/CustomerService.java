package ru.savimar.demouserforkube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.savimar.demouserforkube.entity.Customer;
import ru.savimar.demouserforkube.entity.User;
import ru.savimar.demouserforkube.repository.CustomerRepository;
import ru.savimar.demouserforkube.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> findAll(){
        List<Customer> result = (List<Customer>) repository.findAll();
        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<Customer>();
        }
    }


    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Customer save(Customer customer){
        return repository.save(customer);
    }


    public Customer getCustomerById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

}
