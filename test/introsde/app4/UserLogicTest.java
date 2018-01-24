package introsde.app4;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.runners.MethodSorters;

import introsde.APP4.orchestrator.ApplicationLogic;
import introsde.APP4.orchestrator.wsdl.app3user.Review;
import introsde.APP4.orchestrator.wsdl.app3user.User;

import org.junit.Test;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserLogicTest {

	private static Integer givenId;
	private static User generatedUser;
	private static ApplicationLogic al;
	@BeforeClass
	public static void setup() {
		al = new ApplicationLogic();
	}
	
	@Test
	public void test01CanCreateUser() {
		generatedUser = new User();
		generatedUser.setFirstName("TEST USER");
		generatedUser.setUsername("TEST USERNAME");
		
		givenId = al.registerUser(generatedUser);
		assertNotEquals((int)0, (int)givenId);
	}
	
	@Test
	public void test02CanGetUser() {
		User retrievedUser = al.getUser(givenId);
		assertEquals(generatedUser.getFirstName(), retrievedUser.getFirstName());
		assertEquals(generatedUser.getUsername(), retrievedUser.getUsername());
	}
	
	@Test
	public void test03UpdateUserPreferences() {
		al.setUserPreference(givenId, true, false);
		
		assertTrue(al.doesUserPreferParks(givenId));
		assertFalse(al.doesUserPreferSheds(givenId));
	}
	
	@Test
	public void test04SubmitReview() {
		Review review = new Review();
		review.setReview("Test Review");
		review.setVote(4);
		Integer parkReviewed = new Random().nextInt(10) + 1;
		review.setIdPark(parkReviewed);
		
		int n = al.getParkReviews(parkReviewed).size();
		al.postReview(givenId,review);
		
		int m = al.getParkReviews(parkReviewed).size();
		assertTrue( (m == n+1) ); 
		
		int z = al.getUserReviews(givenId).size();
		assertEquals((int)1, z);
	}
	
	@Test(expected = com.sun.xml.ws.fault.ServerSOAPFaultException.class)
	public void test09DeleteUser() {
		al.deleteUser(givenId);
		al.getUser(givenId);
	}

}
