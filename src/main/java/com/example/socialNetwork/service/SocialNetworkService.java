package com.example.socialNetwork.service;

import com.example.socialNetwork.entities.SocialNetworkPost;

import java.util.List;

public interface SocialNetworkService {

    List<SocialNetworkPost> findTop10ByViewCount();
    List<SocialNetworkPost> findByAuthor(String author);
}
