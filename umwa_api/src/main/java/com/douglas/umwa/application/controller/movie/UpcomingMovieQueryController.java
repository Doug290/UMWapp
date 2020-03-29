package com.douglas.umwa.application.controller.movie;

import com.douglas.umwa.application.resources.query.movie.listing.UpcomingMovieListQueryResponseDTO;
import com.douglas.umwa.application.service.movie.UpcomingMovieQueryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = {"/api/movies"})
public class UpcomingMovieQueryController {

    private UpcomingMovieQueryService upcomingMovieQueryService;

    @GetMapping("/list")
    public ResponseEntity<UpcomingMovieListQueryResponseDTO> findList() {
        return this.upcomingMovieQueryService.getListPaged(1);
    }
}
