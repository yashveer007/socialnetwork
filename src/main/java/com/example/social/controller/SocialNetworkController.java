package com.example.social.controller;

import com.example.social.dto.SocialNetworkPostDto;
import com.example.social.service.SocialNetworkService;
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

    /**
     * fetching top 10 post from the DB
     * @return
     */
    @GetMapping("/getTop10")
    public ResponseEntity<List<SocialNetworkPostDto>> findTop10ByViewCount(){
        log.info("Inside getTop10() ");
        List<SocialNetworkPostDto> top10ByViewCount = service.findTop10ByViewCount();
        log.info("Top 10 list : " + top10ByViewCount);
        return new ResponseEntity<>(top10ByViewCount, HttpStatus.OK);
    }

    /**
     * fetching all post by an author
     * @param author
     * @return
     */
    @GetMapping("/search/{author}")
    public  ResponseEntity<List<SocialNetworkPostDto>> findAll(@PathVariable("author") String author){
        log.info( "Inside findAll() ");
        List<SocialNetworkPostDto> authors = service.findByAuthor(author);
        log.info("List of post : " + authors );
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }
}
