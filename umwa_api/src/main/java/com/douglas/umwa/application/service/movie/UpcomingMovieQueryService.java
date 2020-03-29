package com.douglas.umwa.application.service.movie;

import com.douglas.umwa.application.resources.query.movie.listing.UpcomingMovieListQueryResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UpcomingMovieQueryService {
    @Value("${tmdb.api.key}")
    private String tmdbKey;
    private static final String UPCOMING_MOVIES_URL = "https://api.themoviedb.org/3/movie/upcoming";
    @Autowired
    private RestTemplate restTemplate;



    public ResponseEntity<UpcomingMovieListQueryResponseDTO> getListPaged(Integer page) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(UPCOMING_MOVIES_URL)
                .queryParam("api_key", tmdbKey)
                .queryParam("page", page);

        return restTemplate.getForEntity(builder.toUriString(), UpcomingMovieListQueryResponseDTO.class);
    }
}
