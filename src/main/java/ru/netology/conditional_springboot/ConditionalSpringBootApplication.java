package ru.netology.conditional_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.netology.conditional_springboot.config.JavaConfig;


@Import(JavaConfig.class)
@SpringBootApplication
public class ConditionalSpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConditionalSpringBootApplication.class, args);
    }

}
