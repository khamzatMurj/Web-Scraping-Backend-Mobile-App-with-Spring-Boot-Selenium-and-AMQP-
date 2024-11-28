package com.mobileappbackend.Web;

import com.mobileappbackend.Dto.websiteResponse;
import com.mobileappbackend.Service.websiteService;

import com.mobileappbackend.Dto.WebsiteRequest;
import com.mobileappbackend.Entities.website;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/website")
@RequiredArgsConstructor
public class websiteController {

    private final websiteService website_Service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public websiteResponse getWebsite(@RequestBody WebsiteRequest website_Request) {
        return website_Service.saveWebsite(website_Request);
    }
}
