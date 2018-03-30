package com.lezhin.bootex.repositories;

import com.lezhin.bootex.model.Publisher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author seoeun
 * @since 2017.10.20
 */
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
