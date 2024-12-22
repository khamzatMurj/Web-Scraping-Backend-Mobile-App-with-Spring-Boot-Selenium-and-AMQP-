package com.mobileappbackend.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "electroplanet") // Nom de la collection MongoDB
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString @Builder
public class electroplanet {

    @Id
    private String id; // ID unique généré automatiquement

    private String image;
    private String url;
    private String name;
    private String currentPrice;
    private String oldPrice;
}
