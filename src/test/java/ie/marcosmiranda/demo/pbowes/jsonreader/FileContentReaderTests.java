package ie.marcosmiranda.demo.pbowes.jsonreader;

import ie.marcosmiranda.demo.pbowes.jsonreader.service.FileContentReader;
import org.junit.Test;
import org.junit.runner.RunWith;
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
public class FileContentReaderTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testWorkHappyPath() {

        //Mock Files , return SampleData when readAllLines are called

        FileContentReader fileContentReader = new FileContentReader();

        List<String> sampleData = new ArrayList<>();
        sampleData.add("{ \"event_type\": \"baz\", \"data\": \"ipsum\", \"timestamp\": 1487756527 }");
        sampleData.add("{ \"event_type\": \"foo\", \"data\": \"ipsum\", \"timestamp\": 1487756530 }");


    try {
        //when(MockFile.readAllLines(any(), any())).thenReturn(sampleData);
        //fileContentReader.processFile();
        //Assert numberOfErrors == 0 && bazEvents == 1 and fooEvents == 1

    } catch (Exception e) {
        assert(false);
    }

    }

    @Test
    public void testWrongData() {

        //Mock Files , return SampleData when readAllLines are called

        List<String> sampleData = new ArrayList<>();
        sampleData.add("asdasdasd");
        sampleData.add("asdasd");

        try {
            //when(MockFile.readAllLines(any(), any())).thenReturn(sampleData);
            //fileContentReader.processFile();
            //Assert numberOfErrors == 0 && bazEvents == 0 and fooEvents == 0

        } catch (Exception e) {
            assert(false);
        }


    }

    @Test
    public void testFileNotExisting() {

        //Mock Files , return SampleData when readAllLines are called

        List<String> sampleData = new ArrayList<>();
        sampleData.add("asdasdasd");
        sampleData.add("asdasd");


        //try {
           // No Mock,
            //fileContentReader.processFile();
            //Assert numberOfErrors == 0 && bazEvents == 0 and fooEvents == 0
       // } catch (IOException e) {
            assert(true);
        //}

        //Assert numberOfErrors == 0 && bazEvents == 0 and fooEvents == 0

    }

}
