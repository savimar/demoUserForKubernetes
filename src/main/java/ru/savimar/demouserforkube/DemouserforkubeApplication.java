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



}
