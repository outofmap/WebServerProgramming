package net.slipp.db;

import static org.junit.Assert.*;

import org.junit.Test;

import net.slipp.user.User;
import net.slipp.user.UserTest;

public class DatabaseTest {

	@Test
	public void addAndFindWhenExisted() {
		User user = UserTest.TEST_USER;
		Database.addUser(user);
		
		User dbUser = Database.findByUserId(user.getUserId());
		assertEquals(user,dbUser);
		
	}
	
	public void addAndFindWhenNotExisted() {
		User dbuser = Database.findByUserId("userId2");
		assertNull(dbuser);
		
	}
}
