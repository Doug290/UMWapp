import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { MovieListItem } from '../domain/models/MovieListItem';
import { MovieListReturn } from '../domain/models/MovieListReturn';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private http: HttpClient) { }

  getUpcomingMoviesList(page: number): Observable<any> {
    return this.http.get<any>(environment.urlService + 'movies/list', {
      params: {
        page: page.toString()
      }
    });
  }

}
