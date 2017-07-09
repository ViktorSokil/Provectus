package com.provectus.bookshop.dao.impl;

import com.provectus.bookshop.dao.IBookDAO;
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
public class BookDAOImpl implements IBookDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Book> findAll() {
        CriteriaQuery<Book> criteria = getCriteriaBuilder().createQuery(Book.class);
        Root<Book> root = criteria.from(Book.class);
        criteria.select(root);
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public void deleteBook(Book book) {
        em.remove(book);
    }

    @Override
    public void saveBook(Book book) {
        em.merge(book);
    }

    @Override
    public Book findById(Long id) {
        CriteriaQuery<Book> criteria = getCriteriaBuilder().createQuery(Book.class);
        Root<Book> root = criteria.from(Book.class);
        criteria.where(getCriteriaBuilder().equal(root.get("bookId"), getCriteriaBuilder().parameter(Long.class, "bookId")));
        return em.createQuery(criteria).setParameter("bookId", id).getSingleResult();
    }

    private CriteriaBuilder getCriteriaBuilder(){
        return em.getCriteriaBuilder();
    }
}
