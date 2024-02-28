package polymorphism.interface0.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Playable CDPlayer = new CDPlayer();
        CDPlayer.play();
        CDPlayer.pause();
        CDPlayer.stop();

        Playable MP3Player = new MP3Player();
        MP3Player.play();
        MP3Player.pause();
        MP3Player.stop();

        // 배열 사용한 경우
        Playable[] players = {new MP3Player(), new CDPlayer()};
            for (Playable player : players) {
                player.play();
                player.pause();
                player.stop();
            }
    }
}
