package com.trendyol.musicapi.domain;

import java.math.BigDecimal;
import java.util.UUID;

public class Song {
    UUID id;
    String name;
    String artist;
    String album;
    BigDecimal duration;
    Status status;
}
