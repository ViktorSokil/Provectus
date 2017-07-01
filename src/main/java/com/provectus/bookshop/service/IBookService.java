package com.provectus.bookshop.service;

import com.provectus.bookshop.dto.BookDTO;

import java.util.List;

public interface IBookService {
    List<BookDTO> findAll();
}
