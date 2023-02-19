package com.example.ehealthanalytics.processors;

import ca.uhn.hl7v2.model.Message;
import com.example.ehealthanalytics.services.JsonService;
import com.example.ehealthanalytics.services.PdfService;
import org.springframework.stereotype.Component;


@Component
public class Hl7MessageProcessor {

    private final PdfService pdfService;
    private final JsonService jsonService;

    public Hl7MessageProcessor(PdfService pdfService, JsonService jsonService) {
        this.pdfService = pdfService;
        this.jsonService = jsonService;
    }

    public void processMessage(Message message) {

        pdfService.processAsPDF(message);
        jsonService.processMessageAsJson(message);
        // TODO - repetir a chamada para os outros servicos
        // TODO - logs
    }
}
