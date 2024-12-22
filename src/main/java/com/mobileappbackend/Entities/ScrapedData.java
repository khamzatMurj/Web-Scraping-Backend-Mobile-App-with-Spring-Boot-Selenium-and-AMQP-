package com.mobileappbackend.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ScrapedData")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ScrapedData {

    private String image;
    private String url;
    @JsonProperty("title")
    private String name;
    @JsonProperty("current_price") // Mapper la clé JSON "current_price"
    private String currentPrice;

    @JsonProperty("old_price") // Mapper la clé JSON "old_price"
    private String oldPrice;

    @JsonProperty("Website") // Mapper la clé JSON "Website"
    private String website;
}
