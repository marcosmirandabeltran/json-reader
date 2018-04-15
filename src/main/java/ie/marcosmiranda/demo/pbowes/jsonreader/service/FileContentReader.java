package ie.marcosmiranda.demo.pbowes.jsonreader.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import ie.marcosmiranda.demo.pbowes.jsonreader.bean.Event;
import ie.marcosmiranda.demo.pbowes.jsonreader.bean.FileContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileContentReader {

    @Value("${json.file.location}")
    private String fileLocation;
    @Value("${json.file.encoding}")
    private String encodingStr;

    @Autowired
    private ObjectMapper objectMapper;

    public FileContent processFile() throws IOException {
        List<String> content = new ArrayList();
        List<Event> listEvents = new ArrayList();
        int countErrors = 0;
        FileContent fileContent = new FileContent();
        Charset encoding;

        if (encodingStr.equalsIgnoreCase(StandardCharsets.ISO_8859_1.toString())) {
            encoding = StandardCharsets.ISO_8859_1;
        } else if(encodingStr.equalsIgnoreCase(StandardCharsets.UTF_8.toString())) {
            encoding = StandardCharsets.UTF_8;
        } else {
            encoding = Charset.defaultCharset();
            System.out.println("Unsupported encoding, using the default(at this point UTF-8)");
        }

        content = Files.readAllLines(Paths.get(fileLocation) , encoding);
        for (String line : content) {
            try {
                listEvents.add(processLine(line));
            } catch (IOException e) {
                countErrors++;
            }
        }
        fileContent.setListEvents(listEvents);
        fileContent.setCounterErrors(countErrors);
        return fileContent;
    }
    private Event processLine(String line) throws IOException {
        Event event = objectMapper.readValue(line, Event.class);
        return event;
    }
}
