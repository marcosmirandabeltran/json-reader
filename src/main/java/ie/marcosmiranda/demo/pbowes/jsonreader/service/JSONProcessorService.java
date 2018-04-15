package ie.marcosmiranda.demo.pbowes.jsonreader.service;

import ie.marcosmiranda.demo.pbowes.jsonreader.bean.Stats;

import java.io.IOException;

public interface JSONProcessorService  {
    public Stats getStats() throws IOException;
}
