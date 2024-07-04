package com.example.social.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialNetworkPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private LocalDate date;
    private String postCategory;
    private String author;
    private String content;
    private Long viewCount;

}

