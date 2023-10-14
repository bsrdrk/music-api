package com.trendyol.musicapi.application.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/song")
public class SongController {

    @PatchMapping("/play/{id}")
    public void playSong() {

    }

   @PatchMapping("/pause/{id}")
    public void pauseSong() {

    }

}



/*
Şarkı çalma
Şarkı duraklatma




 */
