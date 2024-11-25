package com.mobileappbackend.Dao;

import com.mobileappbackend.Entities.website;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IwebsiteRepository extends MongoRepository<website, String> {

}
