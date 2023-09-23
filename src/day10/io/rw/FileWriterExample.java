package day10.io.rw;

import util.Utility;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {

//        텍스트 파일 출력을 위한
//        문자 기반 스트림
        try (FileWriter fw = new FileWriter(FilePath.path + "/hobby.txt")){ // 텍스트 전용 스트림

            String hobby = Utility.input("취미를 입력하시오: ");
            String message = String.format("내 취미는 %s 입니다", hobby);

            fw.write(message);

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
