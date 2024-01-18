package ch06_class.sec01_member;

import java.time.LocalDate;

public class Member {				// public 접근 제한자
	//필드, 멤버, 속
	public String name;
	private LocalDate birthday;
	private String email;
	
	// 생성자(Constructor)
	public Member() {}
		
	public Member(String name, LocalDate birthday, String email) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.email = email;
	}


	// 메소드(Method)
	public int getAge() {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		int age = ( month < birthday.getMonthValue() || 
					(month == birthday.getMonthValue() && day < birthday.getMonthValue())) ?
					year - birthday.getYear() - 1 : year - birthday.getYear();
		return age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", birthday=" + birthday + ", email=" + email + "]";
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	// 내부 클래
	class InnerClass {
		
	}
	
// 외부 클래스 
class A {
	
}
	}

