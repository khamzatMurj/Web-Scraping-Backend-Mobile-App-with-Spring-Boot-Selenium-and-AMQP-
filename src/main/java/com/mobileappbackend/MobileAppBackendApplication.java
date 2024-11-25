package com.mobileappbackend;

import com.mobileappbackend.Dao.IwebsiteRepository;
import com.mobileappbackend.Entities.website;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class MobileAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileAppBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(IwebsiteRepository Websiterepository){
        return args -> {
            Stream.of("website1", "website2", "website3", "website4", "website5").forEach(name -> {
                website website = new website();
                website.setName(name);
                website.setUrl("https://www." + name + ".com");
                website.setDate_emissions(new Date());
                System.out.println("hello");

                Websiterepository.save(website);
            });

        };
    }
}
