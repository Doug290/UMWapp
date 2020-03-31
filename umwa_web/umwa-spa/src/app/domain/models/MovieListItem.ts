export class MovieListItem {
    constructor(
        readonly id: number,
        readonly title: string,
        readonly poster_path: string,
        readonly genreIds: Array<number>,
        readonly release_date: string
    ) {}
}
