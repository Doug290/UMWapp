package com.douglas.umwa.application.resources.query.movie.listing;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class BaseInformationMovieDTO {
    private Long id;
    private String title;
    private String poster_path;
    private List<Integer> genre_ids;
    private Date release_date;
}
