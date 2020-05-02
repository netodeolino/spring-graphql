package com.br.study.graphql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.study.model.Book;
import com.br.study.service.BookService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class BookGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

	@Autowired
    private BookService bookService;

    public Optional<Book> findBook(String title) {
        return this.bookService.findBook(title);
    }

    public Book createBook(Book book, String email) {
        return this.bookService.create(book, email);
    }

}
