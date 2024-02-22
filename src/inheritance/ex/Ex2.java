package inheritance.ex;

public class Ex2 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        ClassicalMusicTrack classicalMusicTrack = new ClassicalMusicTrack("Symphony No. 9", "Beethoven",50,"Beethoven");
        PopMusicTrack popMusicTrack = new PopMusicTrack("Shape of You", "Ed Sheeran", 23,"Divide");

        classicalMusicTrack.play();
        popMusicTrack.play();

        musicPlayer.platAll();
    }
}
