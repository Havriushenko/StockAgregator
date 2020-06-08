package com.test_project.havriushenko.stockAgregator;


import com.test_project.havriushenko.stockAgregator.service.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
public class StartApplication implements CommandLineRunner {

    @Autowired
    private Runner runner;

    public static void main(String... args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        runner.run();
    }
}
