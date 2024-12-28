package com.mobileappbackend.Dao;

import com.mobileappbackend.Entities.ScrapedData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IScrappedDataRepository extends MongoRepository<ScrapedData, String> {


//    @Query("{ 'name': { $regex: ?0, $options: 'i' } }")
    @Query("{ name : { $regex: ?0, $options: 'i' } }")
    List<ScrapedData> search(String name);

//    @Query("{ 'name': { '$regex': ".*" + :1 +".*", '$options': 'i' } }")
//    ScrapedData findByname(@Param("x") String name);

    List<ScrapedData> searchScrapedDataByName(String name);





}
