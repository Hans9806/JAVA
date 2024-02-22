package inheritance.ex;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    // 트랙 리스트
    private List<MusicTrack> tracks;

    // 생성자
    public MusicPlayer() {
        this.tracks = new ArrayList<>();
    }

    // 트랙 추가 메소드
    public void addTrack(MusicTrack track) {
        this.tracks.add(track);
    }

    // 모든 트랙 재생 메소드
    public void platAll() {
        for (MusicTrack track : tracks) {
            track.play();
        }
    }
}
