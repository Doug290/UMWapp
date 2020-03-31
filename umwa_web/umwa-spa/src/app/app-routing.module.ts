import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UpcomingMoviesListComponent } from './components/upcoming-movies-list/upcoming-movies-list.component';


const routes: Routes = [
  {
    path: '',
    redirectTo: '/upcoming-list',
    pathMatch: 'full'
  },
  {
    path: 'upcoming-list',
    component: UpcomingMoviesListComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
