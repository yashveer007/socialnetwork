package com.example.social.service;

import com.example.social.constants.ApplicationConstants;
import com.example.social.dao.SocialNetworkDao;
import com.example.social.dto.SocialNetworkPostDto;
import com.example.social.entities.SocialNetworkPost;
import com.example.social.exceptions.SomethingWentWrongException;
import com.example.social.utils.SocialNetworkUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SocialNetworkServiceImpl implements SocialNetworkService{

    @Autowired
    private SocialNetworkDao dao;

    /**
     * fetching top 10 post from the DB on the basis of view count of the post
     * @return
     */
    @Override
    public List<SocialNetworkPostDto> findTop10ByViewCount() {
        log.info("Inside --> SocialNetworkServiceImpl --> findTop10ByViewCount()");
        try{
            List<SocialNetworkPost> top10ByOrderByViewCountDesc = dao.findTop10ByOrderByViewCountDesc();
            log.info("Execution end --> SocialNetworkServiceImpl --> findTop10ByViewCount()");
            return SocialNetworkUtils.covertToDto(top10ByOrderByViewCountDesc);
        }catch(Exception ex){
            log.error(ApplicationConstants.EXCEPTION_OCCURRED + ex.getMessage());
            throw new SomethingWentWrongException(ApplicationConstants.SOMETHING_WENT_WRONG);
        }
    }

    /**
     * fetching posts from the DB on the basis of author name
     * @param author
     * @return
     */
    @Override
    public List<SocialNetworkPostDto> findByAuthor(String author) {
        try{
            List<SocialNetworkPost> posts = dao.findByAuthor(author);
            return SocialNetworkUtils.covertToDto(posts);
        }catch (Exception ex){
            log.error(ApplicationConstants.EXCEPTION_OCCURRED + ex.getMessage());
            throw new SomethingWentWrongException(ApplicationConstants.SOMETHING_WENT_WRONG);
        }
    }
}
