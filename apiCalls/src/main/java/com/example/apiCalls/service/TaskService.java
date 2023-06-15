package com.example.apiCalls.service;
import com.example.apiCalls.configuration.RestTemplateConfig;
import com.example.apiCalls.dto.TaskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class TaskService {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    RestTemplateConfig config;

    public String updateUserByExchangeMethod(TaskDTO task) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<TaskDTO> entity = new HttpEntity<>(task,headers);
        ResponseEntity<String> response = restTemplate.exchange(config.getName(), HttpMethod.PUT, entity, String.class);

        return response.getBody();
    }


}
