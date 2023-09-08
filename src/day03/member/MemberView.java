package day03.member;

import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {

    Scanner sc;
    MemberRepository mr;

    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
        viewProcess();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        System.out.println("=============================");
    }
    void mainView(boolean hide) {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 현재 인원을 등록할 수 없습니다");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        System.out.println("=============================");
    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {
        while (true) {
//            mainView();
            hideMembers();

            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    signUp();
                    break;
                case "2":
                    individualMember();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changePassword();
                    break;
                case "5":
                    withdrawal();
//                    atmosphere();
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }

    /*1. 2번 메뉴를 선택하면, 이메일을 입력받아서 일치하는 회원이 발견되면 회원의 패스워드를 포함한 모든 정보를 세로로 출력
      이름: ㅌㅌㅌ
      이메일: ㅌㅌㅌ
      패스워드 : ㅇㅇㅇㅇ*/
    private void individualMember() {
        String email = input("# 이메일을 입력해주세요: ");
        Member member = mr.findMemberByEmail(email);
        if(email.equals(member.email)){
            System.out.println("아이디: "+member.memberId);
            System.out.println("이름: "+member.memberName);
            System.out.println("이메일: "+member.email);
            System.out.println("패스워드: "+member.password);
        }
        stop();
    }

  /*2. 가입된 회원이 10명이 넘으면 1번 메뉴를 숨김처리하세요.*/
  private void hideMembers() {
      if(mr.memberList.length==10) {
          mainView(true);
      }else mainView();
  }

  private void withdrawal() {
    /*3-1. 회원 탈퇴기능을 구현하시고.  5번을 누르면 이메일과 패스워드를 입력받으신 후 일치하면 회원배열에서 제거하세요.*/
      String email = input("# 이메일을 입력해주세요: ");
      String password = input("# 패스워드를 입력해주세요: ");
      Member memberOfEmail = mr.findMemberByEmail(email);

      for (int i = 0; i < mr.memberList.length; i++) {
          if (email.equals(memberOfEmail.email) && password.equals(memberOfEmail.password)) {
              System.out.println(mr.memberList[i].inform());
              int index=i;

              Member[] updateMember = new Member[mr.memberList.length-1];
              for (int j = index; j < mr.memberList.length-1; j++) {
                  mr.memberList[j]=mr.memberList[j+1];
              }

              for (int j = 0; j < updateMember.length; j++) {
                  updateMember[j]=mr.memberList[j];
              }
              mr.memberList=updateMember;

              /*3-2. 탈퇴처리를 한 후 탈퇴대기 배열에 추가하세요.*/
              Member[] deletMember=new Member[mr.removeMembers.length+1];
              for (int k = mr.removeMembers.length; k < deletMember.length; k++) {
                  deletMember[k]=mr.memberList[index];
                  System.out.println("#"+mr.memberList[index].inform());
              }
              mr.removeMembers=deletMember;
              for (Member member : mr.removeMembers) {
                  System.out.println("removeMember"+member.inform());
              }
              break;
          }
      }
      mr.showMembers();
      stop();
  }

  /*4. 추가 메뉴번호를 활성화하여 예를들어 7. 회원 복구하기 회원의 이메일과 패스워를 입력받아 복구시켜주시고,
        만약 10명이 가입된 상태면 복구를 할 수 없다라는 로그를 띄워주세요.*/

    private void changePassword() {
        //이메일을 입력받음
        String email = input("# 수정 대상의 이메일: ");

        //수정 대상 탐색
        Member member = mr.findMemberByEmail(email);

        //회원이 탐색됨
        //member가 null아닐 경우 탐색해
        if(member!=null){
            System.out.printf("# %s님의 비밀번호를 변경합니다 \n", member.memberName);
            String newPassword = input("# 새로운 비밀번호: ");

            //만약 새 비번이 기존 비번과 같은 경우 pass
            if(member.password.equals(newPassword)){
                System.out.println("# 기존 비밀번호와 동일합니다. 변경 취소합니다 ");
                stop();
                return;
            }
            mr.updatePassword(newPassword, email);
            System.out.println("# 비밀번호 변경이 완료되었습니다");

        }else{
            System.out.println("/n # 조회 결과가 없습니다");
        }

        stop();
    }

    // 회원가입 입출력을 처리하는 메서드
    void signUp() {

        String email=  checkDuplicateEmailInput();
        String name = input("# 이름: ");
        String pw = input("# 패스워드: ");
        Gender gender = checkCorrectGenderInput();
        String age = input("# 나이: ");

        // 실제 배열에 저장 명령
        // 랜덤 아이디 생성 (1 ~ 999999)
        int randomId = (int) (Math.random() * 999999) + 1;
        Member newMember = new Member(randomId, email, pw, name,gender, Integer.parseInt(age));
        mr.addMember(newMember);

        System.out.println("# 회원 가입 성공!!");
        stop();
    }

    private Gender checkCorrectGenderInput() {
        while (true){
            String inputGender = input("# 성별[M/F]: ");
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

    //checkDuplicateEmailInput();
    private String checkDuplicateEmailInput() {
        while (true){
            String email = input("# 이메일: ");
            if(!mr.isDuplicatedEmail(email)){
                break;
            }
            System.out.println("# 이메일이 중복 되었습니다.");
        }
        return null;
    }

    // 입력처리를 간편하게 해주는 메서드
    public String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    // 엔터를 누르기전까지 멈추는 기능
    void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속…======");
        sc.nextLine();
    }
}
