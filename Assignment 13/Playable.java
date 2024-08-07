package musicplayer;

public interface Playable {
    void play();
    void pause();
    void stop();
}


public class MP3Player implements Playable {
  
    public void play() {
        System.out.println("MP3 Player is playing.");
    }

  
    public void pause() {
        System.out.println("MP3 Player is paused.");
    }

   
    public void stop() {
        System.out.println("MP3 Player is stopped.");
    }
}


public class CDPlayer implements Playable {
    
    public void play() {
        System.out.println("CD Player is playing.");
    }

    
    public void pause() {
        System.out.println("CD Player is paused.");
    }

  
    public void stop() {
        System.out.println("CD Player is stopped.");
    }
}


public class StreamingPlayer implements Playable {
  
    public void play() {
        System.out.println("Streaming Player is playing.");
    }

   
    public void pause() {
        System.out.println("Streaming Player is paused.");
    }

   
    public void stop() {
        System.out.println("Streaming Player is stopped.");
    }
}


