package com.shadrinsa.bookimori.conrollers;

import com.shadrinsa.bookimori.entities.Book;
import com.shadrinsa.bookimori.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping("/")
    public String books(@RequestParam(name = "title", required = false) String title, Model model){
        model.addAttribute("books", bookService.listBook(title));
        return "books";
    }
    @PostMapping("/book/adding")
    public String addBook(@RequestParam("file") MultipartFile file, Book book) throws IOException {
        bookService.saveBook(book, file);
        return "redirect:/";
    }
}
