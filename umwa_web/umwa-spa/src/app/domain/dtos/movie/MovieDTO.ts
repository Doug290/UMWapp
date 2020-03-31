export class MovieDTO {
    constructor(
      public id: number,
      public title: string,
      public posterPath: string,
      public genreIds: Array<number>,
      public releaseDate: string
    ) {}
}