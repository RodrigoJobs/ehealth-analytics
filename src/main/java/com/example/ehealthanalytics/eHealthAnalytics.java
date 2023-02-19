package com.example.ehealthanalytics;

import ca.uhn.hl7v2.model.Message;
import com.example.ehealthanalytics.consumers.Hl7MessageConsumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class eHealthAnalytics implements CommandLineRunner {

    private final Hl7MessageConsumer hl7MessageConsumer;

    public eHealthAnalytics(Hl7MessageConsumer hl7MessageConsumer) {
        this.hl7MessageConsumer = hl7MessageConsumer;
    }

        public static void main(String[] args) {
        SpringApplication.run(eHealthAnalytics.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Message> messages = new ArrayList<>();
//        messages.add()
//        messages.add()
//        messages.add()


        messages.forEach(hl7MessageConsumer::consume);
        messages.forEach( m -> hl7MessageConsumer.consume(m));
    }
}
