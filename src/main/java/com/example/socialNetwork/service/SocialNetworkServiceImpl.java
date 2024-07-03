package com.example.socialNetwork.service;

import com.example.socialNetwork.dao.SocialNetworkDao;
import com.example.socialNetwork.entities.SocialNetworkPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialNetworkServiceImpl implements SocialNetworkService{

    @Autowired
    private SocialNetworkDao dao;

    @Override
    public List<SocialNetworkPost> findTop10ByViewCount() {
        List<SocialNetworkPost> top10ByOrderByViewCountDesc = dao.findTop10ByOrderByViewCountDesc();
        return top10ByOrderByViewCountDesc;
    }

    @Override
    public List<SocialNetworkPost> findByAuthor(String author) {
        return dao.findByAuthor(author);
    }
}
