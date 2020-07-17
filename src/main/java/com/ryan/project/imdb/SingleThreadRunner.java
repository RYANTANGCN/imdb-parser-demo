package com.ryan.project.imdb;

import com.ryan.project.imdb.service.IMDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class SingleThreadRunner implements CommandLineRunner {

    @Autowired
    IMDBService imdbService;

    @Override
    public void run(String... args) throws Exception {
        imdbService.transferData(args);
    }
}
