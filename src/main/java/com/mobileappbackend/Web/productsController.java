package com.mobileappbackend.Web;


import com.mobileappbackend.Dto.ScrapedDataResponse;
import com.mobileappbackend.Dto.WebsiteRequest;
import com.mobileappbackend.Dto.websiteResponse;
import com.mobileappbackend.Service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class productsController {

    private final ClientService client_Service;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<ScrapedDataResponse> add_Website_To_scrape_it(@RequestParam("name") String name) {
        return client_Service.findByname(name);
    }




}
