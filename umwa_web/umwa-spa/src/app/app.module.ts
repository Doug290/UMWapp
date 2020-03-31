// NODE MOLUES
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

// LOCAL COMPONENTS
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UpcomingMoviesListComponent } from './components/upcoming-movies-list/upcoming-movies-list.component';
import { MovieDetailComponent } from './components/movie-detail/movie-detail.component';
import { MovieCardComponent } from './components/movie-card/movie-card.component';


@NgModule({
  declarations: [
    AppComponent,
    UpcomingMoviesListComponent,
    MovieDetailComponent,
    MovieCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
