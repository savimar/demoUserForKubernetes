package ru.savimar.demouserforkube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import ru.savimar.demouserforkube.entity.User;
import ru.savimar.demouserforkube.repository.UserRepository;

import java.util.List;

@SpringBootApplication
public class DemouserforkubeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemouserforkubeApplication.class, args);
    }
   /* @Autowired
    private UserRepository repository;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        List allUsers = this.repository.findAll();

        User user = new User();
        user.setFirstName("Нина");
        user.setLastName("Петрова");

        this.repository.save(user);

        User user1 = new User();
        user1.setFirstName("Иван");
        user1.setLastName("Иванов");

        this.repository.save(user1);

        allUsers = this.repository.findAll();

    }*/
}
