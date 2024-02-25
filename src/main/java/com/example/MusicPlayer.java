package com.example;

class MusicPlayer {
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

    public void playMusic() {
        System.out.println("plaing music: " + music.getSong());
    }
    
}
