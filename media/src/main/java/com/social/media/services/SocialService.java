package com.social.media.services;

import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {
    SocialUserRepository socialUserRepository;

    public SocialService(SocialUserRepository socialUserRepository) {
        this.socialUserRepository = socialUserRepository;
    }

    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }

    public SocialUser deleteUser(Long id) {
        SocialUser user = socialUserRepository
                .findById(id)
                .orElseThrow(()->new RuntimeException("User not found"));
        socialUserRepository.delete(user);
        return user;
    }
}
