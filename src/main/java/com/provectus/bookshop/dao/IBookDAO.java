package com.provectus.bookshop.dao;

import com.provectus.bookshop.entity.Book;

import java.util.List;

public interface IBookDAO {
    List<com.provectus.bookshop.entity.Book> findAll();

    void deleteBook(Book book);

    void saveBook(Book book);

    Book findById(Long id);
}
