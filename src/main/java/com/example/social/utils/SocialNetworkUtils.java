package com.example.social.utils;

import com.example.social.dto.SocialNetworkPostDto;
import com.example.social.entities.SocialNetworkPost;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkUtils {

    /**
     * preparing DTO from Post
     * @param posts
     * @return
     */
    public static List<SocialNetworkPostDto> covertToDto(List<SocialNetworkPost> posts){
        List<SocialNetworkPostDto> dtoList = new ArrayList<>();
        for(SocialNetworkPost post : posts){
            SocialNetworkPostDto postDto = SocialNetworkPostDto.builder()
                    .date(post.getDate())
                    .postCategory(post.getPostCategory())
                    .content(post.getContent())
                    .viewCount(post.getViewCount())
                    .author(post.getAuthor())
                    .build();
            dtoList.add(postDto);
        }
        return dtoList;
    }
    private SocialNetworkUtils(){}
}
