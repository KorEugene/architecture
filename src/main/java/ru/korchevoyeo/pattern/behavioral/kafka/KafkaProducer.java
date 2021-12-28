package ru.korchevoyeo.pattern.behavioral.kafka;


import ru.korchevoyeo.pattern.behavioral.dto.EmailDto;
import ru.korchevoyeo.pattern.behavioral.dto.SmsDto;

import java.util.Properties;

public class KafkaProducer {
    private static final Properties properties = new Properties();
    private static final String smsTopic = "smsTopic";
    private static final String emailTopic = "emailTopic";

    public static void produceSms(SmsDto dto) {
        System.out.printf("SMS: '%s' - sent to Kafka topic: " + smsTopic + "\n", dto.toString());
    }

    public static void produceEmail(EmailDto dto) {
        System.out.printf("Email: '%s' - sent to Kafka topic: " + emailTopic + "\n", dto.toString());
    }
}
