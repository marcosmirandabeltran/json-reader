package ie.marcosmiranda.demo.pbowes.jsonreader;

import ie.marcosmiranda.demo.pbowes.jsonreader.bean.Event;
import ie.marcosmiranda.demo.pbowes.jsonreader.bean.FileContent;
import ie.marcosmiranda.demo.pbowes.jsonreader.bean.Stats;
import ie.marcosmiranda.demo.pbowes.jsonreader.service.FileContentReader;
import ie.marcosmiranda.demo.pbowes.jsonreader.service.JSONProcessorService;
import ie.marcosmiranda.demo.pbowes.jsonreader.service.JSONProcessorServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)

@SpringBootTest
public class JSONProcessorServiceImplTest {

    @InjectMocks
    private FileContentReader mockFileContentReader;

    private JSONProcessorService jsonProcessorService;

    @Before
    public void setup() throws Exception {
        jsonProcessorService = new JSONProcessorServiceImpl();
    }

    @Test
    public void testGetStats() throws Exception{
        FileContent fileContent = new FileContent();
        List<Event> listEvents = new ArrayList<>();
        Event event = new Event();
        event.setData("test");
        event.setEventType("foo");
        event.setTimestamp("123123123");
        listEvents.add(event);
        event.setEventType("bar");
        listEvents.add(event);

        fileContent.setCounterErrors(2);
        fileContent.setListEvents(listEvents);

        //when(mockFileContentReader.processFile()).thenReturn(fileContent);
       // Stats stats =  jsonProcessorService.getStats();
        //assert (stats.getWords() == 2 && stats.getCountBar() == 1);
    }



}
