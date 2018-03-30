package com.lezhin.bootex.repositories;

import com.lezhin.bootex.model.Author;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author seoeun
 * @since 2017.09.05
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
