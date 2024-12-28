package com.mobileappbackend.Service;

import com.mobileappbackend.Dao.IuserRepository;
import com.mobileappbackend.Dao.IwebsiteRepository;
import com.mobileappbackend.Dao.IScrappedDataRepository;
import com.mobileappbackend.Dto.ScrapedDataResponse;
import com.mobileappbackend.Dto.WebsiteRequest;
import com.mobileappbackend.Dto.websiteResponse;
import com.mobileappbackend.Entities.ScrapedData;
import com.mobileappbackend.Entities.website;
import com.mobileappbackend.Exceptions.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final IwebsiteRepository iwebsiteRepository;
    private final IuserRepository iuserRepository;
    private final IScrappedDataRepository iscrappedDataRepository;

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


    public List<ScrapedDataResponse> findByname(String name) {

//        List<ScrapedData> scrapedData = iscrappedDataRepository.findByname("\'.*"+name+".*\'");
        List<ScrapedData> scrapedData = iscrappedDataRepository.search(name);



        if (scrapedData != null) {

            List<ScrapedDataResponse> scrapedDataResponses = scrapedData.stream().map(
                    scrapedData1 ->
                            new ScrapedDataResponse(
                                    scrapedData1.getId(),
                                        scrapedData1.getImage(),
                                        scrapedData1.getUrl(),
                                        scrapedData1.getName(),
                                        scrapedData1.getCurrentPrice(),
                                        scrapedData1.getOldPrice(),
                                        scrapedData1.getWebsite()
                    )

            ).toList();
            if (scrapedDataResponses.isEmpty()){
                throw new ProductNotFoundException("Product not found");
            }
            return scrapedDataResponses;
        }

        throw new RuntimeException("Product not found");

    }
}
