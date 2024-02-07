package MYSQL.sec06_user;

import java.util.List;

public interface UserService {
	
	void registerUser(User user);
	
	User getUserBuUid(String uid);
	
	List<User> getUserList();
	
	void updateUser(User user);
	
	void deleteUser(String uid);
	
	int login(String uid, String pwd);
	
	void close();

}
