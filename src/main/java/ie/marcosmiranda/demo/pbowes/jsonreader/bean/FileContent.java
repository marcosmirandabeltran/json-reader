package ie.marcosmiranda.demo.pbowes.jsonreader.bean;

import java.util.ArrayList;
import java.util.List;

public class FileContent {

    private List<Event> listEvents = new ArrayList();
    private int counterErrors;

    public List<Event> getListEvents() {
        return listEvents;
    }

    public void setListEvents(List<Event> listEvents) {
        this.listEvents = listEvents;
    }

    public int getCounterErrors() {
        return counterErrors;
    }

    public void setCounterErrors(int counterErrors) {
        this.counterErrors = counterErrors;
    }
}
