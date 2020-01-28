package com.hsReutlingen.IoTHackathon.core.entities.inbound;

import com.hsReutlingen.IoTHackathon.core.entities.HackathonDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class HackathonDbApiService {

    RestTemplate restTemplate = new RestTemplate();

    public HackathonDbApiService( ){

    }



    @RequestMapping("/api/rooms/{rommId}")
    public String getNumberOfPersons(@PathVariable String rommId){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        String url = "https://sheetdb.io/api/v1/2ux28959042dd/search/?raum=" + rommId;
        ResponseEntity<List<HackathonDb>> getNumberOfTeilnehmer = restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<List<HackathonDb>>() {});
        String teilnehmerAnzahl = getNumberOfTeilnehmer.getBody().get(0).getTeilnehmeranzahl();
        return teilnehmerAnzahl;
    }

    }


