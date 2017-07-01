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
//public BookDTO(Long bookId, String bookName, List<Author> authors, List<Genre> genres, String bookDescription, BigDecimal bookPrice)
   /* @Override
    public List<BookDTO> findAll() {
        CriteriaQuery<BookDTO> criteria=getCriteriaBuilder().createQuery(BookDTO.class);
        Root<Book> root=criteria.from(Book.class);
        criteria.select(getCriteriaBuilder().construct(BookDTO.class,
                root.get(Book_.bookId),
                root.get(Book_.bookName),
                root.get(Book_.bookAuthors),
                root.get(Book_.bookGenres),
                root.get(Book_.bookDescription),
                root.get(Book_.bookPrice)
        ));
        return em.createQuery(criteria).getResultList();
    }*/

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
