package com.example;

class MusicPlayer {
    private IMusic music;

    

    public MusicPlayer(IMusic music) {
        this.music = music;
    }
    public MusicPlayer(){}
    public void setMusic(IMusic music){
        this.music = music;
    }

    public void playMusic() {
        System.out.println("plaing music: " + music.getSong());
    }
    
}
