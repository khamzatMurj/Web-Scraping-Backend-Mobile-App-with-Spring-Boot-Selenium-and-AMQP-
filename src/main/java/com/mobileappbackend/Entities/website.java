package com.mobileappbackend.Entities;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "website")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class website {
    @Id
    private String name;
    private String url;
    private Date date_emissions;
    private String description;
    private String image;

}

