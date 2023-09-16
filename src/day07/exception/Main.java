package day07.exception;

import util.Utility;

public class Main {
    public static void main(String[] args) {
        LoginUser user = new LoginUser("abc123", "1234");
        String id = Utility.input("ID: ");
        String pw = Utility.input("PW: ");

        String result = null;
        try {
            result = user.validate(id, pw);
        } catch (Exception e) {
//            e.printStackTrace(); //에러 로그 출력
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){

        }
//        System.out.println("result = " + result);

    }
}
