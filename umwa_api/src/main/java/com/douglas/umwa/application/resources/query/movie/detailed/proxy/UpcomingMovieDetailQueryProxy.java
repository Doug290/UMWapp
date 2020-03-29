package com.douglas.umwa.application.resources.query.movie.detailed.proxy;

import com.douglas.umwa.application.resources.query.movie.detailed.GenreDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UpcomingMovieDetailQueryProxy {
    private String title;
    private String poster_path;
    private List<GenreDTO> genres;
    private String overview;
    private Date release_date;
}
