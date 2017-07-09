package com.provectus.bookshop.service.impl;

import com.provectus.bookshop.dao.IAuthorDAO;
import com.provectus.bookshop.entity.Author;
import com.provectus.bookshop.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthorServiceImpl implements IAuthorService {
    @Autowired
    private IAuthorDAO authorDAO;

    @Override
    public Author findAuthor(Long id) {
        return authorDAO.findAuthor(id);
    }
}
