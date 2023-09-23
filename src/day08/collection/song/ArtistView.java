package day08.collection.song;

import day04.modi.pac1.A;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import day08.collection.song.Artist;
import util.Utility;

import static util.Utility.*;
import static util.Utility.input;

public class ArtistView {
    private static ArtistRepository ar;
    static {
        ar = new ArtistRepository();
    }

    // 메인 실행 기능
    public static void start() {

        // 세이브파일 로드
        ar.loadFile();

        while (true){
            System.out.println("******** 음악 관리 프로그램 ********");
            System.out.println("# 현재 등록된 가수: "+ar.count()+" 명");
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료하기");

            makeLine();

            String menuNum = input(">> ");

            switch (menuNum){
                case "1":
                    insertProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    System.out.println(" # 프로그램 종료합니다");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 존재하지 않은 메뉴 입니비");

        }
    }

    }

    private static void searchProcess() {
        System.out.println("\n # 검색할 가수명을 입력하세요");
        String artistName = input(" -  가수명: ");

        if(ar.isRegistered(artistName)){
            System.out.printf("%s님의 노래목록 \n",artistName);

            makeLine();

            ar.showSongList(artistName);

        }else{
            System.out.println("\n # 해당 가수는 등록되지 않았습니다");
        }
    }

    // 1번 메뉴에 대한 입출력 실행 내용
    private static void insertProcess() { //외부에서 처리할 일이 없어 private
        System.out.println("# 노래 등록을 합니다");
        String artistName = input(" -  가수명: ");
        String songName = input(" - 노래명: ");

//        ar.addNewArtist(artistName, songName);

        // 기존에 등록된 가수인가?
        if (!ar.isRegistered(artistName)) { // 기존에 등록되지 않은 신규 가수라면
            ar.addNewArtist(artistName, songName);
            System.out.printf("\n# %s 님이 신규 등록되었습니다\n", artistName);
        } else { // 기존 등록된 가수에 노래만 추가
            //새로운 가수 정보를 생성하는게 아니라
            // 기존 가수 정보에서 노래 정보만 추가하면 됨
            boolean flag = ar.addNewSong(artistName, songName);
            if (flag) {
                System.out.printf("\n# %s님의 노래목록에 %s곡이 추가되었습니다.\n", artistName, songName);
            } else {
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);

            }
        }
        ar.autoSave();
    }
}
