package com.mobileappbackend.amqp;

import com.mobileappbackend.Config.RabbitMQConfig;
import com.mobileappbackend.Dao.ScrappedDataRepository;
import com.mobileappbackend.Entities.ScrapedData;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataScrappedConsumer {


    private final ScrappedDataRepository scrappedDat;



    private final ObjectMapper objectMapper;



//    @RabbitListener(queues = RabbitMQConfig.DATASCRAPPED_QUEUE)
//    public void consumeMessage1(String message) throws InterruptedException {
//        System.out.println("Message reçu de la queue dataScrapped: " + message);
//        // Traitez les données scrappées ici
//        Thread.sleep(1000);
//    }
    @RabbitListener(queues = RabbitMQConfig.DATASCRAPPED_QUEUE)
    public void consumeMessage(String message) throws InterruptedException {
        System.out.println("Message reçu de la queue dataScrapped: " + message);
        try {
            // Désérialiser le message JSON en une liste d'objets
            List<ScrapedData> scrapedDataList = objectMapper.readValue(message, new TypeReference<List<ScrapedData>>() {});
            System.out.println("Liste des données reçues: " + scrapedDataList);
            scrappedDat.saveAll(scrapedDataList);




        } catch (Exception e) {
            System.err.println("Erreur lors du traitement du message: " + e.getMessage());
        }
    }
}
