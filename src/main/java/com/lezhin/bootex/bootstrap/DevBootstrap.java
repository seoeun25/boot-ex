package com.lezhin.bootex.bootstrap;

import com.lezhin.bootex.model.Author;
import com.lezhin.bootex.model.Book;
import com.lezhin.bootex.model.Publisher;
import com.lezhin.bootex.repositories.AuthorRepository;
import com.lezhin.bootex.repositories.BookRepository;
import com.lezhin.bootex.repositories.PublisherRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * TODO what is ApplicationListener
 *
 * @author seoeun
 * @since 2017.09.05
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private static Logger logger = LoggerFactory.getLogger(DevBootstrap.class);
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
                        PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.logger = logger;
    }


    /**
     * Spring MVC에서 DispatchServlet과 ContextLoaderListener에서 호출하여 2번 호출된다.
     *
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("---- event = {}", event.getApplicationContext().getParent());
        if (event.getApplicationContext().getParent() == null) {
            initData();
        }
    }

    private void initData() {

        logger.info("------------ initData");

        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);

        // Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        // Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJP = new Book("J2EE Development without EJB", "23444", publisher);
        rod.getBooks().add(noEJP);
        noEJP.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJP);

        logger.info("------------ initData end");


    }
}
