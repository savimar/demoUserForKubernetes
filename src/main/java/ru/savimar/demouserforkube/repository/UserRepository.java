package ru.savimar.demouserforkube.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.savimar.demouserforkube.entity.User;


import java.util.List;

@Repository
public interface UserRepository  extends CrudRepository<User, Integer> {
    List<User> findAll();


}