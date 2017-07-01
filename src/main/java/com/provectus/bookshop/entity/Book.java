package com.provectus.bookshop.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "book_seggen")
    @SequenceGenerator(name = "book_seggen", sequenceName = "book_seq")
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> bookAuthors=new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "genre_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> bookGenres=new ArrayList<>();

    @Column(name = "book_description")
    private String bookDescription;

    @Column(name = "book_price")
    private BigDecimal bookPrice;

    public Book() {
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Author> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List<Author> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public List<Genre> getBookGenres() {
        return bookGenres;
    }

    public void setBookGenres(List<Genre> bookGenres) {
        this.bookGenres = bookGenres;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }
}
