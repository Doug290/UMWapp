package com.douglas.umwa.application.service.movie;

import com.douglas.umwa.application.resources.query.movie.detailed.UpcomingMovieDetailQueryResponseDTO;
import com.douglas.umwa.application.resources.query.movie.listing.UpcomingMovieListQueryResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UpcomingMovieQueryService {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${tmdb.api.key}")
    private String tmdbKey;
    private static final String UPCOMING_MOVIES_URL = "https://api.themoviedb.org/3/movie/upcoming";
    private static final String DETAILED_MOVIE_URL = "https://api.themoviedb.org/3/movie/";

    public ResponseEntity<UpcomingMovieListQueryResponseDTO> getListPaged(Integer page) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(UPCOMING_MOVIES_URL)
                .queryParam("api_key", tmdbKey)
                .queryParam("page", page);
        return restTemplate.getForEntity(builder.toUriString(), UpcomingMovieListQueryResponseDTO.class);
    }

    public ResponseEntity<UpcomingMovieDetailQueryResponseDTO> getDetail(Long id) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(DETAILED_MOVIE_URL)
                .path(id.toString())
                .queryParam("api_key", tmdbKey);
        return restTemplate.getForEntity(builder.toUriString(), UpcomingMovieDetailQueryResponseDTO.class);
    }
}
