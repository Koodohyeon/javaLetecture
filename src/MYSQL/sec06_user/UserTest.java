package MYSQL.sec06_user;

import java.util.List;

public class UserTest {

	public static void main(String[] args) {
		UserService userSvc = new UserServiceMySQLimpl();
		User user = null;
		
	//	 user = new User("admin", "1234", "제임스", "admin@naver.com");
//		 userSvc.registerUser(user);
//		 user = new User("maria", "1234", "마리아", "maria@naver.com");
//		 userSvc.registerUser(user);
//		 user = new User("brian", "1234", "브라이언", "brian@naver.com");
	//	 userSvc.registerUser(user);
//		 user = new User("sarah", "1234", "사라", "sarah@naver.com");
//		 userSvc.registerUser(user);
		
//		user = userSvc.getUserBuUid("admin");
	//	System.out.println(user);
		
//		user = userSvc.getUserBuUid("james");
//		System.out.println(user);

//		System.out.println(userSvc.login("admin", "1234"));
	//	System.out.println(userSvc.login("maria", "1234"));
//		System.out.println(userSvc.login("bria", "1234"));
		
		List<User> list = userSvc.getUserList(1);
		list.forEach(x -> System.out.println(x));
		
		userSvc.close();
		

	}

}
