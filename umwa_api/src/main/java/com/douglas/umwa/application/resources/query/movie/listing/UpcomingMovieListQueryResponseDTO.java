package com.douglas.umwa.application.resources.query.movie.listing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpcomingMovieListQueryResponseDTO {
    private List<BaseInformationMovieResponseDTO> results;
}
