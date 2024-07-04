package com.example.social.dao;

import com.example.social.entities.SocialNetworkPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocialNetworkDao extends JpaRepository<SocialNetworkPost, Long> {

    List<SocialNetworkPost> findTop10ByOrderByViewCountDesc();
    List<SocialNetworkPost> findByAuthor(String author);
}
