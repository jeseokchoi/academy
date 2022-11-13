package day05;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		String id = "itbank";
		String pw = "it";
		
		String userid, userpw;
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 userid, userpw를 입력받고,
		// ID/PW 모두 일치하면 [로그인 성공]
		// ID는 일치하지만 PW가 일치하지 않으면 [비밀번호 오류]
		// ID가 일치하지 않으면 [계정을 찾을 수 없습니다] 라고 출력하세요
		
		
		System.out.println("아이디 입력 : ");
		userid = sc.nextLine();
		System.out.println("비밀번호 입력 : ");
		userpw = sc.nextLine();
		
		// ==, != 쓰지말자
		// if문
		if(id.equals(userid)) {					// ID가 일치하면
			if(pw.equals(userpw)) {				// PW도 일치하면
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호 오류");
			}
		}
		else {
			System.out.println("계정을 찾을 수 없습니다.");
		}
		sc.close();
			
		
	}

}
