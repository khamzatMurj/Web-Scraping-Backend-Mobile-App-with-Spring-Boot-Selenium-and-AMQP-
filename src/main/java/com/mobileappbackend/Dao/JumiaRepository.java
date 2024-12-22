package com.mobileappbackend.Dao;

import com.mobileappbackend.Entities.jumia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JumiaRepository extends MongoRepository<jumia, String> {
}
