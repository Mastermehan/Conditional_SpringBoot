package ru.netology.conditional_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.conditional_springboot.profiles.SystemProfile;

@RestController
@RequestMapping(value = "/")
public class ProfileController {

    private SystemProfile profile;

    @GetMapping(value = "profile")
    String getProfile() {
        return profile.getProfile();
    }

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    public void setProfile(SystemProfile profile) {
        this.profile = profile;
    }
}
