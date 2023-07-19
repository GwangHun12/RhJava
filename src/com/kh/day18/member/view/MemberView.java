package com.kh.day18.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.model.vo.Member;

public class MemberView {

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 관리 프로그램 ======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(이름)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원 정보 입력 =====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		Member member = new Member(memberId, memberPw, memberName
				, memberEmail, memberPhone);
		return member;
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String memberName = sc.next();
		return memberName;
	}
	
	public void printOneMember(Member member) {
		System.out.println("===== 회원 정보 출력(이름) =======");
		System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s"
				, member.getMemberId()
				, member.getMemberName()
				, member.getMemberEmail()
				, member.getMemberPhone());
	}
	
	public void printAllMembers(List<Member> mList) {
		System.out.println("====== 회원 전체 정보 출력 =======");
		for(Member member : mList) {
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n"
					, member.getMemberId()
					, member.getMemberName()
					, member.getMemberEmail()
					, member.getMemberPhone());
		}
	}

	public Member modifyMember(Member member) {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
//		Member member = new Member(memberPw, memberEmail, memberPhone);
		member.setMemberPw(memberPw);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		return member;
	}
}
