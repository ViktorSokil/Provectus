package com.provectus.bookshop.service;

import com.provectus.bookshop.entity.Genre;

public interface IGenreService {
    Genre findGenre(Long genreId);
}
