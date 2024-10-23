package com.shadrinsa.bookimori.services;

import com.shadrinsa.bookimori.entities.Book;
import com.shadrinsa.bookimori.repositories.BookRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    private static final long id = 1L;
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookService bookService;
    @Test
    void listBookOutAllTest() {
        List<Book> bookList = bookService.listBook(null);

        assertNotNull(bookList);
    }

    @Test
    void saveBookTest() throws IOException {
        final Book book = mock(Book.class);
        final MultipartFile file = mock(MultipartFile.class);

        bookService.saveBook(book, file);

       verify(bookRepository, Mockito.times(1)).save(book);
    }


}