package com.provectus.bookshop.service.impl;

import com.provectus.bookshop.dto.GenreDTO;
import com.provectus.bookshop.service.IBookService;
import com.provectus.bookshop.dao.IBookDAO;
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
    private IBookDAO bookDAO;

    @Override
    public List<BookDTO> findAll() {
        List<Book> books= bookDAO.findAll();
        List<BookDTO> result=new ArrayList<>();
        for (Book book: books){
            result.add(convertBook(book));
        }
        return result;
    }

    @Override
    public List<BookDTO> finByAuthor(Long id) {
        List<Book> books= bookDAO.findAll();
        books = finBooksByAuthor(books,id);
        List<BookDTO> result=new ArrayList<>();
        for (Book book: books){
            result.add(convertBook(book));
        }
        return result;
    }

    @Override
    public List<BookDTO> finByGenre(Long id) {
        List<Book> books= bookDAO.findAll();
        books = finBooksByGenre(books,id);
        List<BookDTO> result=new ArrayList<>();
        for (Book book: books){
            result.add(convertBook(book));
        }
        return result;
    }

    @Override
    public void deleteBook(Book book) {
        bookDAO.deleteBook(book);
    }

    @Override
    public Book findById(Long id) {
        return bookDAO.findById(id);
    }

    @Override
    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }

    private List<Book> finBooksByGenre(List<Book> books, Long id) {
        List<Book> resultBooks = new ArrayList<>();
        for (Book book: books){
            List<Genre> genres = book.getBookGenres();
            for(Genre genre: genres){
                if(id.equals(genre.getGenreId())){
                    resultBooks.add(book);
                }
            }
        }
        return resultBooks;
    }


    private List<Book> finBooksByAuthor(List<Book> books, Long id) {
        List<Book> resultBooks = new ArrayList<>();
        for (Book book: books){
            List<Author> authors = book.getBookAuthors();
            for(Author author: authors){
                if(id.equals(author.getAuthorId())){
                    resultBooks.add(book);
                }
            }
        }
        return resultBooks;
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
