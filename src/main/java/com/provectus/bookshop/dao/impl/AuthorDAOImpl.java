package com.provectus.bookshop.dao.impl;

import com.provectus.bookshop.dao.IAuthorDAO;
import com.provectus.bookshop.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AuthorDAOImpl implements IAuthorDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Author findAuthor(Long id) {
        return em.find(Author.class, id);
    }
}
