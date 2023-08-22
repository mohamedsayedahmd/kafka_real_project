package net.mic.springboot.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Document
public class WikimediaData {
    @Id
    private Long id;
    @Field
    private String wikiEventData;

    public WikimediaData() {
    }

    public WikimediaData(Long id, String wikiEventData) {
        this.id = id;
        this.wikiEventData = wikiEventData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }
}
