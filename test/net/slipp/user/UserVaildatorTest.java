package net.slipp.user;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserVaildatorTest {

	private static Validator validator;

//	@BeforeClass
//	public static void setUp() {
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		validator = factory.getValidator();
//	}
//
//	@Test
//	public void manufacturerIsNull() {
//		User user = new User(null,"password","name","email@email.com");
//		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
//		assertEquals(1, constraintViolations.size()); 
//		System.out.println(constraintViolations.iterator().next().getMessage());
//	}
	
//	@Test
//	public void userId의_길이가_적절하지_않을_때() throws Exception {
//		User user = new User("dfd","password","name","email@email.com");
//		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
//		assertEquals(0, constraintViolations.size());
//		System.out.println(constraintViolations.iterator().next().getMessage());
//		
//		user = new User("9serId","password","name","email@email.com");
//		constraintViolations = validator.validate(user);
//		assertEquals(0, constraintViolations.size());
//		System.out.println(constraintViolations.iterator().next().getMessage());
//	}
//	
//	@Test
//	public void email() throws Exception {
//		User user = new User("user","password","name","email@email.com");
//		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
//		assertEquals(0, constraintViolations.size());
//		System.out.println(constraintViolations.iterator().next().getMessage());
//	}
//	
//	@Test
//	public void invaildUser () throws Exception {
//		User user = new User("user","password","name","email@email.com");
//		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
//		assertEquals(0, constraintViolations.size());
//		Iterator<ConstraintViolation<User>> violations = constraintViolations.iterator();
//		while(violations.hasNext()) {
//			ConstraintViolation<User> each = violations.next();
//			System.out.println(each.getPropertyPath()+":"+  each.getMessage());
//		}
//	}
}
