package com.mobileappbackend.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ScrapedDataResponse(
                                String id,
                                String image,
                                String url,//                                @JsonProperty("title")
                                String name,//                               @JsonProperty("current_price") // Mapper la clé JSON "current_price"
                                String currentPrice,//                       @JsonProperty("old_price") // Mapper la clé JSON "old_price"
                                String oldPrice,//                           @JsonProperty("Website") // Mapper la clé JSON "Website"
                                String website
) {
}
