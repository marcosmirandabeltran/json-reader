package ie.marcosmiranda.demo.pbowes.jsonreader.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.security.Timestamp;

public class Event {
    @JsonProperty("event_type")
    private String eventType;
    private String data;
    private String timestamp;



    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
