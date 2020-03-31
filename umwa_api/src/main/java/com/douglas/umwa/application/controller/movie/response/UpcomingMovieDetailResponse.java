package com.douglas.umwa.application.controller.movie.response;

import com.douglas.umwa.application.resources.query.movie.detailed.GenreResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UpcomingMovieDetailResponse {
    private String title;
    private String poster_path;
    private List<GenreResponseDTO> genres;
    private String overview;
    private Date release_date;
}
