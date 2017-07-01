package com.provectus.bookshop.dto;

import java.math.BigDecimal;
import java.util.List;

public class BookDTO {
    private Long bookId;
    private String bookName;
    private List<AuthorDTO> authors;
    private List<GenreDTO> genres;
    private String bookDescription;
    private BigDecimal bookPrice;

    public BookDTO() {
    }

    public BookDTO(Long bookId, String bookName, List<AuthorDTO> authors, List<GenreDTO> genres, String bookDescription, BigDecimal bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authors = authors;
        this.genres = genres;
        this.bookDescription = bookDescription;
        this.bookPrice = bookPrice;
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

    public List<AuthorDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorDTO> authors) {
        this.authors = authors;
    }

    public List<GenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreDTO> genres) {
        this.genres = genres;
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
