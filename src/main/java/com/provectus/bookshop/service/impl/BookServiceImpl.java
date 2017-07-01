package com.provectus.bookshop.service.impl;

import com.provectus.bookshop.dto.GenreDTO;
import com.provectus.bookshop.service.IBookService;
import com.provectus.bookshop.dao.IBookDao;
import com.provectus.bookshop.entity.Author;
import com.provectus.bookshop.entity.Book;
import com.provectus.bookshop.entity.Genre;
import com.provectus.bookshop.dto.AuthorDTO;
import com.provectus.bookshop.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public List<BookDTO> findAll() {
        List<Book> books=bookDao.findAll();
        List<BookDTO> result=new ArrayList<>();
        for (Book book: books){
            result.add(convertBook(book));
        }
        return result;
    }

    private BookDTO convertBook(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookId(book.getBookId());
        bookDTO.setBookName(book.getBookName());
        bookDTO.setAuthors(convertAuthorList(book.getBookAuthors()));
        bookDTO.setGenres(convertGenreList(book.getBookGenres()));
        bookDTO.setBookDescription(book.getBookDescription());
        bookDTO.setBookPrice(book.getBookPrice());
        return bookDTO;
    }

    private List<AuthorDTO> convertAuthorList(List<Author> bookAuthors) {
        List<AuthorDTO> authorDTOList = new ArrayList<>();
        for (Author author: bookAuthors){
            authorDTOList.add(convertAuthor(author));
        }
        return  authorDTOList;
    }

    private AuthorDTO convertAuthor(Author author) {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setAuthorId(author.getAuthorId());
        authorDTO.setAuthorName(author.getAuthorName());
        return  authorDTO;
    }

    private List<GenreDTO> convertGenreList(List<Genre> bookGenres) {
        List<GenreDTO> genreDTOList = new ArrayList<>();
        for (Genre genre: bookGenres){
            genreDTOList.add(convertGenre(genre));
        }
        return  genreDTOList;
    }

    private GenreDTO convertGenre(Genre genre) {
        GenreDTO genreDTO = new GenreDTO();
        genreDTO.setGenreId(genre.getGenreId());
        genreDTO.setGenreName(genre.getGenreName());
        return genreDTO;
    }
}
