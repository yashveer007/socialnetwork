package com.example.social.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SocialNetworkPostDto implements Serializable {

    private LocalDate date;
    private String postCategory;
    private String author;
    private String content;
    private Long viewCount;
}
