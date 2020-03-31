package com.douglas.umwa.application.service.movie;

import com.douglas.umwa.application.resources.query.movie.detailed.UpcomingMovieDetailQueryResponseDTO;
import com.douglas.umwa.application.controller.movie.response.UpcomingMovieDetailResponse;
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

    @Value("${tmdb.api.base.url}")
    private String tmdbBaseUrl;

    private static final String UPCOMING_MOVIES_URI = "movie/upcoming";
    private static final String DETAILED_MOVIE_URI = "movie/";
    private static final String SEARCH_MOVIE_URI = "search/keyword/";


    public ResponseEntity<UpcomingMovieListQueryResponseDTO> getListPaged(Integer page) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(tmdbBaseUrl)
                .path(UPCOMING_MOVIES_URI)
                .queryParam("api_key", tmdbKey)
                .queryParam("page", page);

        ResponseEntity<UpcomingMovieListQueryResponseDTO> teste = restTemplate.getForEntity(builder.toUriString(), UpcomingMovieListQueryResponseDTO.class);
        return restTemplate.getForEntity(builder.toUriString(), UpcomingMovieListQueryResponseDTO.class);
    }

    public ResponseEntity<UpcomingMovieDetailQueryResponseDTO> getDetail(Long id) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(tmdbBaseUrl)
                .path(DETAILED_MOVIE_URI)
                .path(id.toString())
                .queryParam("api_key", tmdbKey);

        ResponseEntity<UpcomingMovieDetailResponse> responseProxy = restTemplate.getForEntity(builder.toUriString(), UpcomingMovieDetailResponse.class);

        // como tratar o possivel null??
        UpcomingMovieDetailQueryResponseDTO responseDto = new UpcomingMovieDetailQueryResponseDTO(responseProxy.getBody());

        return ResponseEntity.ok().body(responseDto);
    }

    public ResponseEntity<UpcomingMovieListQueryResponseDTO> getSearchListPaged(Long page, String querySearch) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(tmdbBaseUrl)
                .path(SEARCH_MOVIE_URI)
                .queryParam("api_key", tmdbKey)
                .queryParam("query", querySearch)
                .queryParam("page", page);
        return restTemplate.getForEntity(builder.toUriString(), UpcomingMovieListQueryResponseDTO.class);
    }
}
