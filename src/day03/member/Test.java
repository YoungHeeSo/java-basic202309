package day03.member;

public class Test {
    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();

        Member thief=new Member(4, "ttt@yyy.com", "9999", "밥도둑", Gender.MALE, 20);
        mr.addMember(thief);

        mr.showMembers();

        System.out.println("===========================");

        // 이메일 중복 테스트
        /*String email = "abc@def.ko";
        boolean flag1=mr.isDuplicatedEmail(email);
        System.out.println("flag1 = " + flag1);*/
    }
}
