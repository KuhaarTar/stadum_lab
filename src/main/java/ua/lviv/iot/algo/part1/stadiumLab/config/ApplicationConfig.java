package ua.lviv.iot.algo.part1.stadiumLab.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.lviv.iot.algo.part1.stadiumLab")
@PropertySource("classpath:application.yml")
public class ApplicationConfig {
}
