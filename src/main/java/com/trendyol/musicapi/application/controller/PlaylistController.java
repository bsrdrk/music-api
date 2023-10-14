package com.trendyol.musicapi.application.controller;

import com.trendyol.musicapi.domain.Playlist;
import com.trendyol.musicapi.interfaces.response.PlaylistResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/playlist")
public class PlaylistController {

    @PostMapping
    public void createPlaylist() {

    }

    @PutMapping("/{id}")
    public void editPlaylist() {

    }

    @DeleteMapping("/{id}")
    public void deletePlaylist() {

    }

    @PostMapping("/{id}/songs/{songId}")
    public void addSongToPlaylist() {

    }

    @DeleteMapping("/{id}/songs/{songId}")
    public void removeSongFromPlaylist() {

    }

    @PatchMapping("/{id}/play")
    public PlaylistResponse playPlaylist() {
        return null;
    }

    @PatchMapping("/next")
    public void playNextSong(){

    }

    @PatchMapping("/previous")
    public void playPreviousSong(){

    }
}
/*
todo: Player yapısı oluşturma
Şarkı listesi oluşturma
Şarkı listesi düzenleme
Şarkı listesi silme
Şarkı listesine şarkı ekleme
Şarkı listesinden şarkı silme
Şarkı listesi çalma

Listedeki bir sonraki şarkıya geçme
Listedeki bir önceki şarkıya geçme
 */
