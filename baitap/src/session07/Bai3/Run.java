package session07.Bai3;

public class Run {
    public static void main(String[] args) {
        Playeble audioPlayer = new AudioPlayer();
        Playeble videoPlayer = new VideoPlayer();
        audioPlayer.play();
        videoPlayer.play();
    }
}
