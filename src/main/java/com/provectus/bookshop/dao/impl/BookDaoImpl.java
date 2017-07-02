package com.provectus.bookshop.dao.impl;

import com.provectus.bookshop.dao.IBookDao;
import com.provectus.bookshop.entity.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BookDaoImpl implements IBookDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Book> findAll() {
        CriteriaQuery<Book> criteria = getCriteriaBuilder().createQuery(Book.class);
        Root<Book> root = criteria.from(Book.class);
        criteria.select(root);
        return em.createQuery(criteria).getResultList();
    }

    private CriteriaBuilder getCriteriaBuilder(){
        return em.getCriteriaBuilder();
    }
}
