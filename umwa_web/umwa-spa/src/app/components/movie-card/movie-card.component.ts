import { Component, Input } from '@angular/core';
import { MovieDTO } from 'src/app/domain/dtos/movie/MovieDTO';

@Component({
  selector: 'app-movie-card',
  templateUrl: './movie-card.component.html',
  styleUrls: ['./movie-card.component.scss']
})
export class MovieCardComponent {

  @Input() movie: MovieDTO;

  // title: string;
  // genreIds: Array<number>;
  // releaseDate: string;

  constructor() {
    // this.title = this.movie.title;
    // this.genreIds = this.movie.genreIds;
    // this.releaseDate = this.movie.releaseDate;
   }


}
