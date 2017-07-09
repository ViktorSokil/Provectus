package com.provectus.bookshop.controller;

import com.provectus.bookshop.dto.BookDTO;
import com.provectus.bookshop.entity.Book;
import com.provectus.bookshop.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private IBookService bookService;

    @RequestMapping(value = "/books/", method = RequestMethod.GET)
    public ResponseEntity<List<BookDTO>> listAllBooks(){
        List<BookDTO> books = bookService.findAll();
        if(books.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "/authors/{authorId:.+}/books")
    public ResponseEntity<List<BookDTO>> getBooksByAuthor(@PathVariable Long authorId){
        List<BookDTO> books = bookService.finByAuthor(new Long(authorId));
        if(books.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "/genres/{genreId:.+}/books")
    public ResponseEntity<List<BookDTO>> getBooksByGenre(@PathVariable Long genreId){
        List<BookDTO> books = bookService.finByGenre(new Long(genreId));
        if(books.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }


    @RequestMapping(value = "/books/{id:.+}", method = RequestMethod.PUT)
    public ResponseEntity<Book> updateBook(@PathVariable Long id){
        Book book = bookService.findById(id);
        if (book == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        bookService.saveBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @RequestMapping(value = { "/books/{bookId}" })
    public ResponseEntity deleteBook(@PathVariable Long id){
        Book book = bookService.findById(id);
        if (book == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        bookService.deleteBook(book);
        return new ResponseEntity (HttpStatus.OK);
    }
}
