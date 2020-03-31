import { MovieListItem } from './MovieListItem';

export class MovieListReturn {
    constructor(
        readonly results: Array<MovieListItem>
    ) {}
}
