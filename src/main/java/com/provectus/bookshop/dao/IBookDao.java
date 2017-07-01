package com.provectus.bookshop.dao;

import com.provectus.bookshop.entity.Book;

import java.util.List;

public interface IBookDao {
    List<Book> findAll();
}
