package com.shadrinsa.bookimori.conrollers;

import com.shadrinsa.bookimori.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping("/")
    public String books(@RequestParam(name = "tite", required = false) String title, Model model){
        model.addAttribute("books", bookService.listBook(title));
        return "books";
    }
}
