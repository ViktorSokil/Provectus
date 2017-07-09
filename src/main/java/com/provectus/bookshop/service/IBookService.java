package com.provectus.bookshop.service;

import com.provectus.bookshop.dto.BookDTO;
import com.provectus.bookshop.entity.Book;

import java.util.List;

public interface IBookService {
    List<BookDTO> findAll();

    List<BookDTO> finByAuthor(Long id);

    List<BookDTO> finByGenre(Long id);

    Book findById(Long id);

    void saveBook(Book book);

    void deleteBook(Book book);
}
