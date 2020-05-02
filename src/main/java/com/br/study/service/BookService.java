package com.br.study.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.study.model.Book;
import com.br.study.repository.BookRepository;

@Service
public class BookService {

	@Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserService userService;

    public Book create(Book book, String email){
        book.setUserOwner(this.userService.findUserByEmail(email).get());
        return this.bookRepository.save(book);
    }

    public Optional<Book> findBook(String title) {
        return this.bookRepository.findByTitle(title);
    }

}
