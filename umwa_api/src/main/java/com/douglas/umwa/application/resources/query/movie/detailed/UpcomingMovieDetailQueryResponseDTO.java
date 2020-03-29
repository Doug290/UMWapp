package com.douglas.umwa.application.resources.query.movie.detailed;

import com.douglas.umwa.application.resources.query.movie.detailed.proxy.UpcomingMovieDetailQueryProxy;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class UpcomingMovieDetailQueryResponseDTO {
    private String title;
    private String poster_path;
    private List<String> genres;
    private String overview;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date release_date;

    public UpcomingMovieDetailQueryResponseDTO(UpcomingMovieDetailQueryProxy proxy) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://image.tmdb.org/t/p/w500/")
                .path(proxy.getPoster_path());
        this.title = proxy.getTitle();
        this.poster_path = builder.toUriString();
        this.genres = proxy.getGenres() != null
                ? proxy.getGenres().stream().map(GenreDTO::getName).collect(Collectors.toList())
                : new ArrayList<>();
        this.overview = proxy.getOverview();
        this.release_date = proxy.getRelease_date();
    }
}
