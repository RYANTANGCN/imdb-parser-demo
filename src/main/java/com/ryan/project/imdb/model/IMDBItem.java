package com.ryan.project.imdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IMDBItem {
    Integer id;

    String titleConstant;

    String titleType;

    String primaryTitle;

    String originalTitle;

    Integer adult;

    Integer startYear;

    Integer endYear;

    Integer runtimeMinutes;

    String genres;
}
