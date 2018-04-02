package com.lezhin.bootex.controller;

import com.lezhin.bootex.repositories.AuthorRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author list을 리턴해주는 controller. /authors
 * thymeleaf 를 이용한 html rendering.
 * 
 * @author seoeun
 * @since 2017.10.20
 */
@Controller
public class AuthorController {

    private static final Logger logger = LoggerFactory.getLogger(AuthorController.class);

    private AuthorRepository authorRepository;

    public AuthorController(final AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        logger.info("----/authors");

        model.addAttribute("authors", authorRepository.findAll());

        // view mapping. /templates/authors.html
        return "authors";
    }

}
