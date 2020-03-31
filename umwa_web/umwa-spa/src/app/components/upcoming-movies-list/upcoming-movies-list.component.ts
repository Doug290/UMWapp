import { Component, OnInit } from '@angular/core';
import { MovieService } from 'src/app/service/movie.service';
import { MovieDTO } from 'src/app/domain/dtos/movie/MovieDTO';
import { MovieListItem } from 'src/app/domain/models/MovieListItem';
import { pipe } from 'rxjs';

@Component({
  selector: 'app-upcoming-movies-list',
  templateUrl: './upcoming-movies-list.component.html',
  styleUrls: ['./upcoming-movies-list.component.css']
})
export class UpcomingMoviesListComponent implements OnInit {

  singleMovieReturn: MovieDTO;

  constructor(
    private moviesService: MovieService
  ) { }

  ngOnInit() {
    this.moviesService.getUpcomingMoviesList(1).subscribe((result: any) => {
      console.log(result);
    });
  }

}
