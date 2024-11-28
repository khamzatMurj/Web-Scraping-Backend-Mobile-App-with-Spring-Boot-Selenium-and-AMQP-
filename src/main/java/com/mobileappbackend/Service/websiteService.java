package com.mobileappbackend.Service;

import com.mobileappbackend.Dao.IwebsiteRepository;
import com.mobileappbackend.Dto.WebsiteRequest;
import com.mobileappbackend.Dto.websiteResponse;
import com.mobileappbackend.Entities.website;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class websiteService {

    private final IwebsiteRepository iwebsiteRepository;

    public websiteResponse saveWebsite(WebsiteRequest websiteRequest){

        website SiteWeb = website.builder()
                .name(websiteRequest.name())
                .url(websiteRequest.url())
                .description(websiteRequest.description())
                .image(websiteRequest.image())
                .build();

        iwebsiteRepository.save(SiteWeb);
        return new websiteResponse(
                SiteWeb.getName(),
                SiteWeb.getUrl(),
                SiteWeb.getCreateDate(),
                SiteWeb.getDescription(),
                SiteWeb.getImage()
        );

    }


}
