package com.douglas.umwa.application.resources.query.movie.detailed;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UpcomingMovieDetailQueryResponseDTO {
    private String title;
    private String poster_path;
    private List<GenreDTO> genres;
    private String overview;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date release_date;
}
