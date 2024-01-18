package ch06_class.sec01_member;

import java.time.LocalDate;

public class MemberMain {

	public static void main(String[] args) {
		// 객체 생성 - 초기 파라메터 없이 생성 
		Member james = new Member();
		// 객체 생성 - 초기 파마메터 값을 주고 생성 
		Member maria = new Member("마리아", LocalDate.of(2003, 1, 17), "maria@gmail.com");
		
		// 필드 접근
	//	james.name = "제임스"; 		// 접근제한자가 퍼블릭이라 가능 
//		james.email = "james@gmail.com";		// 접근제한자가 private 이라 불가능 
		james.setName("제임스");
		james.setEmail("james@naver.com") ;
		james.setBirthday(LocalDate.of(2001, 11, 19));
		
		// 메소드 사용
		System.out.println(james);		// james.toString()
		System.out.println(maria.toString());
		
		System.out.println(james.name + ":" + james.getBirthday() + "," + james.getAge());
		System.out.println(maria.name + ":" + maria.getBirthday() + "," + maria.getAge());
	}

}