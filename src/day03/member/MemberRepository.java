package day03.member;

// 책임(역활): 회원을 여러 명 저장관리 하는 클래스
public class MemberRepository {

    //필드: 회원 배열
    Member[] memberList; // 가입된 회원 배열
    Member[] removeMembers; //삭제된 회원 배열

    public MemberRepository() {
        this.memberList= new Member[]{
                new Member(1,"abc@def.com","1234","콩벌레", Gender.MALE, 15),
                new Member(2,"fff@def.com","4567","팥죽이", Gender.FEMALE, 20),
                new Member(3,"dfevr@def.com","8901","카레맨", Gender.MALE, 18),

                /*new Member(4,"abc@def.com","1234","콩벌레", Gender.MALE, 15),
                new Member(5,"fff@def.com","4567","팥죽이", Gender.FEMALE, 20),
                new Member(6,"dfevr@def.com","8901","카레맨", Gender.MALE, 18),
                new Member(7,"abc@def.com","1234","콩벌레", Gender.MALE, 15),
                new Member(8,"fff@def.com","4567","팥죽이", Gender.FEMALE, 20),
                new Member(9,"dfevr@def.com","8901","카레맨", Gender.MALE, 18),
                new Member(10,"dfevr@def.com","8901","카레맨", Gender.MALE, 18),*/

        };
        this.removeMembers=new Member[]{};
    }

    /*
    * 모든 회원정보를 출력하는 메서드
    * */
    void showMembers(){
        System.out.printf("================ 현재 회원 정보 (총 %d 명) ==================\n", memberList.length);
        for (Member member:memberList) {
            System.out.println(member.inform());
        }
    }

    /*
    * 새로운 회원정보를 추가하는 메서드
    * */
    boolean addMember(Member newMember){

        // push 알고리즘
        Member[] temp = new Member[memberList.length+1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i]=memberList[i];
        }

        temp[temp.length-1]=newMember;
        memberList=temp;

        return true;
    };

    /*
    * 이메일의 중복여부를 확인하는 메서드
    * @param1 email - 중복검사 대상 이메일
    * @return - 중복되었다면 true, 아니라면 false
    * */
    boolean isDuplicatedEmail(String email){
        for (Member member : memberList) {
            if(email.equals(member.email)){
                return true;
            }
        }// end for
        return false;
    }

    /**
    * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 메서드
    * @param1 email - 탐색할 맴버객체의 이메일
    * @return - 해당 이메일과 일치하는 회원의 모든 객체 정보
    *          이메일이 일치하지 않으면 null 리턴
    */
    Member findMemberByEmail(String email){
        for (Member member : memberList) {
            if(email.equals(member.email)){
                return member;
            }
        }
        return null;
    }

    /**
    * 비밀번호를 수정하는 메서드
    */
    void updatePassword(String newPassword, String email){
        Member member=findMemberByEmail(email);
        member.password=newPassword;
    }

    /*
    * 회원탈퇴를 처리하는 메서드
    *  */

}
