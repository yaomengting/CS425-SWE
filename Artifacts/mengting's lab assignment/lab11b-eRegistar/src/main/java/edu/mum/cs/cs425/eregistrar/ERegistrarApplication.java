package edu.mum.cs.cs425.eregistrar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ERegistrarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ERegistrarApplication.class, args);
    }

}
