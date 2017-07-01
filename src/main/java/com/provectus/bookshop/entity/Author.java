package com.provectus.bookshop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auth_seggen")
    @SequenceGenerator(name = "auth_seggen", sequenceName = "author_seq")
    private Long authorId;

    @Column(name = "author_name")
    private String authorName;

    @ManyToMany(mappedBy = "bookAuthors")
    /*@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))*/
    private List<Book> books=new ArrayList<>();

    public Author() {
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
