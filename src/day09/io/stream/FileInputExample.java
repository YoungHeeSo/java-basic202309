package day09.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputExample {
    public static void main(String[] args) {
        String path = "/Users/youngheeso/Develop/java-basic202309/src/day03/member/MemberRepository.java";

        try (FileInputStream fis = new FileInputStream(path)){

            int data = 0;

            while (data != -1){
                data=fis.read();

                // 아스키 출력 담당, write
                System.out.write((char) data);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
