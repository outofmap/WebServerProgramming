package net.slipp.db;

import java.util.HashMap;
import java.util.Map;

import net.slipp.user.User;

public class Database {
	//key는 userId이지만, value가 password,name,e-mail로 3가지나 된다.그래서 class안에 3개의 value를 넣어주자. 
	private static Map<String, User> users = new HashMap<String, User>() {{
		put("user1", new User("user1", "password", "name", "email@gmail.com"));
	}};
	
	public static void addUser(User user){
		System.out.println("user:"+user );
		users.put(user.getUserId(), user);
	}

	public static User findByUserId(String userId) {
		return users.get(userId);
	}
}
