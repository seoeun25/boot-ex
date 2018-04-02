package com.lezhin.bootex.controller;

import com.lezhin.bootex.repositories.BookRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller example.
 * @author seoeun
 * @since 2017.10.20
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());

        // view mapping. (books에 해당하는 view를 찾아서 리턴)
        // thymeleaf를 위한 template html이 있다면, 해당 (books.html)이 리턴된다.
        return "books";
    }
}
