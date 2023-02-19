package com.example.ehealthanalytics.services;

import ca.uhn.hl7v2.model.Message;

import com.example.ehealthanalytics.mappers.JsonMapper;
import com.example.ehealthanalytics.repositories.JsonRepository;
import org.springframework.stereotype.Service;

@Service
public class JsonService {

    private final JsonRepository jsonRepository;

    public JsonService(JsonRepository jsonRepository) {
        this.jsonRepository = jsonRepository;
    }

    public void processMessageAsJson(Message message) {

        String jsonMessage = JsonMapper.map(message);
        jsonRepository.saveAsJson(jsonMessage);

        // TODO - implementar logica e aadicionar logs
    }
}
