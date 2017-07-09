package com.provectus.bookshop.dao;

import com.provectus.bookshop.entity.Author;

public interface IAuthorDAO {
    Author findAuthor(Long id);
}
