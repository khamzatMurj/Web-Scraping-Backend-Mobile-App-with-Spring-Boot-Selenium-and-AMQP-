package com.mobileappbackend.Auditing;

import com.mobileappbackend.Entities.website;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;

import java.time.LocalDateTime;
import java.util.Optional;

@Configuration
@EnableMongoAuditing
public class MongoAuditConfig implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.empty();
    }

//    @Override
//    public Optional<String> getCurrentAuditor() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication == null || !authentication.isAuthenticated()) {
//            return Optional.of("SYSTEM");
//        }
//
//        return Optional.ofNullable(authentication.getName());
//    }
    @Bean
    public BeforeConvertCallback<website> beforeConvertCallback() {
        return (siteWeb, collection) -> {
            if (siteWeb.getCreateDate() == null) {
                siteWeb.setCreateDate(LocalDateTime.now());
            }
            return siteWeb;
        };
    }
}