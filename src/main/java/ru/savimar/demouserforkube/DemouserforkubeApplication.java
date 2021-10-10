package ru.savimar.demouserforkube;



import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.savimar.demouserforkube.repository")
public class DemouserforkubeApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemouserforkubeApplication.class, args);
    }


}


