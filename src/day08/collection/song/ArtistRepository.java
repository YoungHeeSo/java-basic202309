package day08.collection.song;

import java.util.*;

public class ArtistRepository {

    // ket : 가수이름, value: 가수 객체
    private static Map<String, Artist> artistList;

    static {
        artistList=new HashMap<>();
    }

    // 신규 가수를 map에 추가하는 기능
    public void addNewArtist(String artistName, String songName){

        // 신규 가수 정보 생성
        Artist artist = new Artist(artistName, new HashSet<>());

        // 생성된 노래 목록에 전달 받은 노래를 추가
        artist.getSongList().add(songName);

        // 가수 정보를 Map에 저장
        artistList.put(artistName, artist);

    }

    //등록된 가수의 수 반환
    public int count(){
        return artistList.size();
    }

    // 가수명을 전달받아 현재 등록된 가수 인지 확인하는 기능
    public boolean isRegistered(String artistName){
        return artistList.containsKey(artistName);
    }

    // 기존 가수 정보에 노래만 추가하는 기능
    /**
     * @param artistName - 사용자의 입력 가수 이름
     *                   @param songName - 사용자의 입력 노래이름
     *                                   @return - 곡명이 중복되었으면 false
     */

    public boolean addNewSong(String artistName, String songName){
        // Map에서 기존 가수 객체를 가져와야 함
        Artist artist = findArtistByName(artistName);
        boolean flag = artist.getSongList().add(songName);
        return flag;
    }

    // 리펙토링
    private static Artist findArtistByName(String artistName) {
        return artistList.get(artistName);
    }

    public static Map<String, Artist> getArtistList() {
        return artistList;
    }

    // 노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) {
        Artist artist = findArtistByName(artistName);
        Set<String> songList = artist.getSongList();

        List<String> songs = new ArrayList<>(songList);

        for (int i = 0; i < songList.size(); i++) {
            System.out.printf("* %d. %s\n", i+1, songs.get(i));
        }
    }
}
