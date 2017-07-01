package com.provectus.bookshop.dto;

public class AuthorDTO {
    private Long authorId;
    private String authorName;

    public AuthorDTO() {
    }

    public AuthorDTO(Long authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
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
}
