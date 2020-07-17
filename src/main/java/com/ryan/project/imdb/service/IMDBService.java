package com.ryan.project.imdb.service;

import com.ryan.project.imdb.dao.IMDBMapper;
import com.ryan.project.imdb.model.IMDBItem;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class IMDBService {

    private Logger logger = LoggerFactory.getLogger(IMDBService.class);

    @Autowired
    IMDBMapper imdbMapper;

    @Autowired
    SqlSession sqlSession;

    private static String DEFAULT_PATH="classpath*:title.basics.tsv";

    public void transferData(String... path) {
        String filePath=DEFAULT_PATH;
        if (path.length!=0&&path[0]!=null) {
            filePath=path[0];
        }
        File file = new File(filePath);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            bufferedReader.lines().parallel().forEach(w -> {

                if (w.startsWith("tt")) {
                    String[] cells = w.split("\t");

                    imdbMapper.insertOne(new IMDBItem(
                            null,
                            cells[0],
                            cells[1],
                            cells[2],
                            cells[3],
                            Integer.valueOf(cells[4]),
                            cells[5].equals("\\N")?null:Integer.valueOf(cells[5]),
                            cells[6].equals("\\N")?null:Integer.valueOf(cells[6]),
                            cells[7].equals("\\N")?null:Integer.valueOf(cells[7]),
                            cells[8]
                    ));
                    logger.debug(w);
                }
            });
        } catch (IOException ioException) {
            logger.error("Exception Found:",ioException);
        }
    }
}
