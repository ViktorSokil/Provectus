package com.provectus.bookshop.entity;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(Book.class)
public class Book_ {
    public static volatile SingularAttribute<Book, Long> bookId;
    public static volatile SingularAttribute<Book, String> bookName;
    public static volatile ListAttribute<Book, Author> bookAuthors;
    public static volatile ListAttribute<Book, Genre> bookGenres;
    public static volatile SingularAttribute<Book, String> bookDescription;
    public static volatile SingularAttribute<Book, BigDecimal> bookPrice;
}
