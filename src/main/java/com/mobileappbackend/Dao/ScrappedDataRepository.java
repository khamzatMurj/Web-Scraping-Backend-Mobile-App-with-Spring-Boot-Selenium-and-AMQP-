package com.mobileappbackend.Dao;

import com.mobileappbackend.Entities.ScrapedData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScrappedDataRepository extends MongoRepository<ScrapedData, String> {
}
