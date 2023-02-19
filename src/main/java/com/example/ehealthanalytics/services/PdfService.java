package com.example.ehealthanalytics.services;

import ca.uhn.hl7v2.model.Message;
import com.example.ehealthanalytics.models.PdfFile;
import com.example.ehealthanalytics.repositories.PdfRepository;
import com.example.ehealthanalytics.utils.PdfConverter;
import org.springframework.stereotype.Service;


@Service
public class PdfService {

    private final PdfRepository pdfRepository;

    public PdfService(PdfRepository pdfRepository) {
        this.pdfRepository = pdfRepository;
    }

    public void processAsPDF(Message message) {

        // TODO - chamar lib de criacao de PDF
        PdfFile pdfFile = PdfConverter.convert(message);
        pdfRepository.savePDF(pdfFile);

    }
}
