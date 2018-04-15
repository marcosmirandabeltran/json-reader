package ie.marcosmiranda.demo.pbowes.jsonreader.service;

import ie.marcosmiranda.demo.pbowes.jsonreader.bean.Event;
import ie.marcosmiranda.demo.pbowes.jsonreader.bean.FileContent;
import ie.marcosmiranda.demo.pbowes.jsonreader.bean.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class JSONProcessorServiceImpl implements JSONProcessorService {

    @Autowired
    private FileContentReader fileContentReader;

    public Stats getStats() throws IOException {
        FileContent fileContent = fileContentReader.processFile();
        Stats stats = new Stats();
        stats.setCountFoo(fileContent.getListEvents().stream().filter(t -> t.getEventType().equals("foo")).count());
        stats.setCountBar(fileContent.getListEvents().stream().filter(t -> t.getEventType().equals("bar")).count());
        stats.setCountBaz(fileContent.getListEvents().stream().filter(t -> t.getEventType().equals("baz")).count());
        Map<String, Integer> words = stats.getWords();

        for (Event e : fileContent.getListEvents()) {
            String word = e.getData();
            words.put(word, (words.getOrDefault(word,0) + 1));
        }
        stats.setWords(words);
        stats.setNumberErrors(fileContent.getCounterErrors());


        return stats;
    }


}
