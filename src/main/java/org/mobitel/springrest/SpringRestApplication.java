package org.mobitel.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
    }

}
