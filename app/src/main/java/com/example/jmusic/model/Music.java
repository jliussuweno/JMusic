package com.example.jmusic.model;

import androidx.room.Entity;

@Entity (tableName = "music_table")
public class Music {

    String id;
    String title;
    String preview;
    String artistName;


}
