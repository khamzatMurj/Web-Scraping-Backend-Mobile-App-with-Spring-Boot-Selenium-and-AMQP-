package com.mobileappbackend.Dao;

import com.mobileappbackend.Entities.User;
import com.mobileappbackend.Entities.website;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IuserRepository extends MongoRepository<User, String> {
    Optional<Object> findByEmail(String username);
}
