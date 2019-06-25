package com.java.patterns.java_patterns.adapterpattern.impl;

import com.java.patterns.java_patterns.adapterpattern.model.AdvancedMediaPlayer;
import com.java.patterns.java_patterns.adapterpattern.model.MediaPlayer;
import com.java.patterns.java_patterns.adapterpattern.model.Mp4Player;
import com.java.patterns.java_patterns.adapterpattern.model.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

   private AdvancedMediaPlayer advancedMediaPlayer;

   public MediaAdapter(String audioType) {
       if(audioType.equalsIgnoreCase("vlc")) {
           this.advancedMediaPlayer = new VlcPlayer();
       } else if(audioType.equalsIgnoreCase("mp4")) {
           this.advancedMediaPlayer = new Mp4Player();
       }
   }

   @Override
   public void play(String audioType, String fileName) {

      if(audioType.equalsIgnoreCase("vlc")) {
          advancedMediaPlayer.playVlc(fileName);
      } else if(audioType.equalsIgnoreCase("mp4")) {
          advancedMediaPlayer.playMp4(fileName);
      }

   }
}
