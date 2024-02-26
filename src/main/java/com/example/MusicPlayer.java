package com.example;

import java.util.ArrayList;
import java.util.List;

class MusicPlayer {
    private List<IMusic> musicList = new ArrayList<>();
    private IMusic music;
    private String name;
    private String volume;



    public MusicPlayer(IMusic music) {
        this.music = music;
    }
    public MusicPlayer(){}


    public void setMusic(IMusic music){
        this.music = music;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setVolume(String volume){
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }
    public void removeMusic(IMusic music) {
        musicList.remove(music);
    }

    public void setMusicList(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public List<IMusic> getMusicList() {
        return musicList;
    }
    
    public void playMusic() {
        musicList.forEach(song -> System.out.println("playing music: " + song.getSong()));

    }
    
}
