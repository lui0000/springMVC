package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comperison = firstmusicPlayer == secondmusicPlayer;

        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);

        
        System.out.println(comperison);

        // System.out.println("Name: " + musicPlayer.getName());
        // System.out.println("Volume: " + musicPlayer.getVolume());
        
        context.close();
    }
}