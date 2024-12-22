package com.mobileappbackend.Dao;

import com.mobileappbackend.Entities.marjane;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarjaneRepository extends MongoRepository<marjane, String> {
}
