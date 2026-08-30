package com.apexstrength.activityservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.http.HttpStatus;

@Service
@RequiredArgsConstructor
public class UserValidationService {

    private final WebClient userServiceWebClient;

    public boolean validateUser(String userId) {

        try {
            return Boolean.TRUE.equals(userServiceWebClient.get()
                    .uri("api/users/validate/{userId}")
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block());
        }

        catch(WebClientResponseException e){
            if(e.getStatusCode() == HttpStatus.NOT_FOUND)
                throw new RuntimeException("User Not Found: "+userId);
            else if(e.getStatusCode() == HttpStatus.BAD_REQUEST)
                throw new RuntimeException("Invalid Request: "+ userId);

        }

        return false;
    }

}
