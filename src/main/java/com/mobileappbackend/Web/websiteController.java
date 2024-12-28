package com.mobileappbackend.Web;

import com.mobileappbackend.Dto.websiteResponse;

import com.mobileappbackend.Dto.WebsiteRequest;
import com.mobileappbackend.Entities.website;
import com.mobileappbackend.Service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/website")
@RequiredArgsConstructor
public class websiteController {

    private final ClientService client_Service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public websiteResponse add_Website_To_scrape_it(@RequestBody WebsiteRequest website_Request) {
        return client_Service.saveWebsite(website_Request);
    }



}
