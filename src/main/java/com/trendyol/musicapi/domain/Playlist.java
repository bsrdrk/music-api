package com.trendyol.musicapi.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Playlist {
    UUID id;
    String name;
    List<Song> songs;
    Status status;
}
