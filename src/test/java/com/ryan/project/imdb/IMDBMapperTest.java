package com.ryan.project.imdb;

import com.ryan.project.imdb.dao.IMDBMapper;
import com.ryan.project.imdb.model.IMDBItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IMDBMapperTest {


    @Autowired
    IMDBMapper imdbMapper;

    @Test
    public void insertTest(){
        Assertions.assertEquals(1,imdbMapper.insertOne(new IMDBItem(1,"Short",null,null,null,null,null,null,null,null)));
    }
}
