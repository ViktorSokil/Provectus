package com.provectus.bookshop.controller;

import com.provectus.bookshop.service.IBookService;
import com.provectus.bookshop.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
