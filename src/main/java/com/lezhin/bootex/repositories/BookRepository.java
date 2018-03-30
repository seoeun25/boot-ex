package com.lezhin.bootex.repositories;


import com.lezhin.bootex.model.Book;

import org.springframework.data.repository.CrudRepository;

/**
 * @author seoeun
 * @since 2017.09.05
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
