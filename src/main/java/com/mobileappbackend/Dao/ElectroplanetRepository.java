package com.mobileappbackend.Dao;

import com.mobileappbackend.Entities.electroplanet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ElectroplanetRepository extends MongoRepository<electroplanet, String> {
}
