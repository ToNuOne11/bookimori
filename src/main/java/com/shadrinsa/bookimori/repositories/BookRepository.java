package com.shadrinsa.bookimori.repositories;

import com.shadrinsa.bookimori.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>{

    List<Book> findByTitleIgnoreCaseContainingOrderByRatingDesc (String title);

    List<Book> findAllByOrderByRatingDesc();

}
