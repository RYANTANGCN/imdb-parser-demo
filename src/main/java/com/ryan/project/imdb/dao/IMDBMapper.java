package com.ryan.project.imdb.dao;

import com.ryan.project.imdb.model.IMDBItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMDBMapper {

    int insertOne(IMDBItem imdbItem);

    int batchInsert(List<IMDBItem> imdbItems);
}
