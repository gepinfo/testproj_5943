package com.geppetto.testproj.repository;

import com.geppetto.testproj.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface PersonRepository extends MongoRepository<Person,String>  {
    
    Page<Person> findAll(Pageable pageable);

}
