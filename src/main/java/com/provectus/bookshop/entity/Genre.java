package com.provectus.bookshop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @Column(name = "genre_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "gen_seggen")
    @SequenceGenerator(name = "gen_seggen", sequenceName = "genre_seq")
    private Long genreId;

    @Column(name = "genre_name")
    private String genreName;

    @ManyToMany(mappedBy = "bookGenres")
    /*@JoinTable(name = "genre_book", joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))*/
    private List<Book> books=new ArrayList<>();

    public Genre() {
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
