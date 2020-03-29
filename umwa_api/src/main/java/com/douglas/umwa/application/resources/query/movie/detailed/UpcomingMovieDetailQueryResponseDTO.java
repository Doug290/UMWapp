package com.douglas.umwa.application.resources.query.movie.detailed;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UpcomingMovieDetailQueryResponseDTO {
    private String title;
    private String poster_path;
    private List<String> genres;
    private String overview;
    private Date releaseDate;
}
