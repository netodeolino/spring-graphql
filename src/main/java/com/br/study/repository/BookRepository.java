package com.br.study.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.study.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	Optional<Book> findByTitle(String title);

}
