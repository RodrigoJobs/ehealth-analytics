package com.example.ehealthanalytics.consumers;

import ca.uhn.hl7v2.model.Message;
import com.example.ehealthanalytics.processors.Hl7MessageProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Hl7MessageConsumer {

    private final Hl7MessageProcessor hl7MessageProcessor;

    public Hl7MessageConsumer(Hl7MessageProcessor hl7MessageProcessor) {
        this.hl7MessageProcessor = hl7MessageProcessor;
    }

    public void consume(Message message) {

        // TODO - adicionar logs, ex: processando mensagem xpto...

        log.info("Procesando mensage: {}", message);

        hl7MessageProcessor.processMessage(message);

        log.info("Mensagem consumida com sucesso");

        // TODO - mensagem consumida com sucesso
    }
}
