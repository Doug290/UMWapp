package com.douglas.umwa.application.controller.movie;

import com.douglas.umwa.application.resources.query.movie.detailed.UpcomingMovieDetailQueryResponseDTO;
import com.douglas.umwa.application.resources.query.movie.listing.UpcomingMovieListQueryResponseDTO;
import com.douglas.umwa.application.service.movie.UpcomingMovieQueryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = {"/api/movies"})
public class UpcomingMovieQueryController {

    private UpcomingMovieQueryService upcomingMovieQueryService;

    @GetMapping("/list")
    public ResponseEntity<UpcomingMovieListQueryResponseDTO> findList(
            @RequestParam Integer page) {
        return this.upcomingMovieQueryService.getListPaged(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UpcomingMovieDetailQueryResponseDTO> findList(@PathVariable("id") Long id) {
        return this.upcomingMovieQueryService.getDetail(id);
    }

    @GetMapping("/search")
    public ResponseEntity<UpcomingMovieListQueryResponseDTO> findList(
            @RequestParam("movieSerach") String movieSearch,
            @RequestParam("page") Long page) {
        return this.upcomingMovieQueryService.getSearchListPaged(page, movieSearch);
    }
}
