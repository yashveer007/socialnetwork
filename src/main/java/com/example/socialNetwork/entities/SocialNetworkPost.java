package com.example.socialNetwork.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class SocialNetworkPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private LocalDate postDate;
    private String postCategory;
    private String author;
    private String content;
    private Long viewCount;
}
