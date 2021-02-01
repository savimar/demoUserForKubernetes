package ru.savimar.demouserforkube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.savimar.demouserforkube.entity.User;
import ru.savimar.demouserforkube.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        List<User> result = userRepository.findAll();
        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<User>();
        }
      }


    public void delete(Integer id){
        userRepository.deleteById(id);
    }

    public User save(User user){
      return userRepository.save(user);
    }


    public User getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow();
    }
}
