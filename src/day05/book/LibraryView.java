package day05.book;

import day03.member.Gender;

import java.util.Scanner;

public class LibraryView {
    private static LibraryRepository repository;
    static Scanner sc = new Scanner(System.in);
    static BookUser bu;

    public static String Input(String input){
        System.out.print(input);
        return sc.nextLine();
    }
    public static void start(){
        System.out.println("# 회원 정보를 입력해 주세요");
        String usrName= Input("# 이름: ");
        String usrAge= Input("# 나이: ");
        Gender usrGender= checkCorrectGenderInput();

        bu = new BookUser(usrName, Integer.parseInt(usrAge), usrGender, 0);
        new BookUser();
    }

    public void viewMain() {
        System.out.println();
        System.out.println("========== 도서 메뉴 ==========");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 5. 도서 저자이름으로 검색");
        System.out.println("# 9. 프로그램 종료하기");
    }

    public void viewProcess(){
        while (true){
            viewMain();
            int menuNumber = Integer.parseInt(Input("- 메뉴 번호 : "));

            switch (menuNumber){
                case 1:
                    new BookUser();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }

        }
    }

    private static Gender checkCorrectGenderInput() {
        while (true){
            String inputGender = Input("# 성별[M/F]: ");
            switch (inputGender.toUpperCase()){
                case "M":
                    return Gender.MALE;
                case "F":
                    return Gender.FEMALE;
                default:
                    System.out.println("# 성별을 M 또는 F로 입력하세요");
            }
        }
    }

}
