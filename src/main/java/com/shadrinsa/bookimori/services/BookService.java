package com.shadrinsa.bookimori.services;

import com.shadrinsa.bookimori.entities.Book;
import com.shadrinsa.bookimori.entities.Image;
import com.shadrinsa.bookimori.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public List<Book> listBook(String title) {
            if(title != null) return bookRepository.findByTitleIgnoreCaseContainingOrderByRatingDesc(title);
            return bookRepository.findAllByOrderByRatingDesc();
    }
    public void saveBook(Book book, MultipartFile file) throws IOException {
        Image image;
        if(!file.isEmpty()) {
            image = toImageEntity(file);
            book.addImageToBook(image);
        }
        bookRepository.save(book);
    }

    private Image toImageEntity(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setSize(file.getSize());
        image.setContentType(file.getContentType());
        image.setBytes(file.getBytes());
        return image;
    }
    public void delete(Long id){
        bookRepository.deleteById(id);
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
