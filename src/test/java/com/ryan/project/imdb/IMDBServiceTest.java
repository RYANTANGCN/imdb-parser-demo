package com.ryan.project.imdb;

import com.ryan.project.imdb.service.IMDBService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IMDBServiceTest {

    @Autowired
    IMDBService imdbService;

    @Test
    public void transferDataTest(){
        imdbService.transferData();
    }
}
