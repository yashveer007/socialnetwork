package com.example.socialNetwork.controller;

import com.example.socialNetwork.entities.SocialNetworkPost;
import com.example.socialNetwork.service.SocialNetworkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin("*")
public class SocialNetworkController {

    @Autowired
    private SocialNetworkService service;

    @GetMapping("/getTop10")
    public ResponseEntity<List<SocialNetworkPost>> findTop10ByViewCount(){
        log.info("Inside getTop10() ");
        List<SocialNetworkPost> top10ByViewCount = service.findTop10ByViewCount();
        log.info("Top 10 list : " + top10ByViewCount);
        return new ResponseEntity<>(top10ByViewCount, HttpStatus.OK);
    }

    @GetMapping("/search/{author}")
    public  ResponseEntity<List<SocialNetworkPost>> findAll(@PathVariable("author") String author){
        log.info( "Inside findAll() ");
        List<SocialNetworkPost> authors = service.findByAuthor(author);
        log.info("List of post : " + authors );
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }
}
