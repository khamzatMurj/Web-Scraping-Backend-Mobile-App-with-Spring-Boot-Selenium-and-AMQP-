package com.mobileappbackend.Entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jumia") // Nom de la collection MongoDB
@Data
@AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class jumia {

    @Id
    private String id; // ID unique généré automatiquement

    private String image;
    private String url;
    private String name;
    private String currentPrice;
    private String oldPrice;

}
