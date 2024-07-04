package com.example.social.service;

import com.example.social.dto.SocialNetworkPostDto;

import java.util.List;

public interface SocialNetworkService {

    List<SocialNetworkPostDto> findTop10ByViewCount();
    List<SocialNetworkPostDto> findByAuthor(String author);
}
