package org.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.demo.*")
@EntityScan("org.demo.*")
@EnableJpaRepositories("org.demo.*")
public class ServerUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerUserApplication.class, args);
    }
}
