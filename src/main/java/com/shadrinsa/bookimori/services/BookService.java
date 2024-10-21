package com.shadrinsa.bookimori.services;

import com.shadrinsa.bookimori.entities.Book;
import com.shadrinsa.bookimori.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public List<Book> listBook(String title) {
            if(title != null) return bookRepository.findByTitle(title);
            return bookRepository.findAll();
    }
}
