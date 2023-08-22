package net.mic.springboot.service;

import net.mic.springboot.entity.WikimediaData;
import net.mic.springboot.repo.WikimediaRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    private WikimediaRepo wikimediaRepo;
    @Autowired
    public KafkaDatabaseConsumer(WikimediaRepo wikimediaRepo) {
        this.wikimediaRepo = wikimediaRepo;
    }

    @KafkaListener(
            topics = "wikimedia_Topic",
            groupId = "myGroup")
    public void consume(String eventMessage){
        LOGGER.info(String.format("Event message recived -> %s",eventMessage));
        WikimediaData wikimediaData = new WikimediaData();
        Random random = new Random();
        long minId = 1L;
        long maxId = Long.MAX_VALUE;
        long randomId = minId + (long) (random.nextDouble() * (maxId - minId));

        wikimediaData.setId(randomId);
        wikimediaData.setWikiEventData(eventMessage);

        wikimediaRepo.save(wikimediaData);
    }
}
