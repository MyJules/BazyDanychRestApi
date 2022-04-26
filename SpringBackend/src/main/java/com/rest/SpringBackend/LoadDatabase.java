package com.rest.SpringBackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(StudentRepository repository){
        return  args -> {
          log.info("Preloading " + repository.save(new Student("Andrew", "Mudryk", "keke@gmail.com", "+48120232")));
          log.info("Preloading " + repository.save(new Student("Volodymyr", "Sinkiewisz", "sink@gmail.com", "+4232332")));
        };
    }
}
