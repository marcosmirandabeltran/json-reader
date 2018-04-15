package ie.marcosmiranda.demo.pbowes.jsonreader.controller;

import ie.marcosmiranda.demo.pbowes.jsonreader.bean.FileContent;
import ie.marcosmiranda.demo.pbowes.jsonreader.bean.Stats;
import ie.marcosmiranda.demo.pbowes.jsonreader.service.JSONProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class StatsVisorController {

   @Autowired
   private JSONProcessorService serv;

    @GetMapping("stats")
    public Stats getStats() throws IOException {

        return serv.getStats();
    }
}