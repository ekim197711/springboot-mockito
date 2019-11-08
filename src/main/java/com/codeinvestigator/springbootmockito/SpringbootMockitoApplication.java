package com.codeinvestigator.springbootmockito;

import com.codeinvestigator.springbootmockito.space.PainterProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({PainterProperties.class})
public class SpringbootMockitoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMockitoApplication.class, args);
    }

}
