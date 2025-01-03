package com.social.media.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy="user")
    //@JoinColumn(name="soical_profile_id")
    private SocialProfile socialProfile;

    @OneToMany
    private List<Post> posts = new ArrayList<>();
}
