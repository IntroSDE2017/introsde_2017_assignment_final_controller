package introsde.app4;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.runners.MethodSorters;

import introsde.APP4.orchestrator.ApplicationLogic;
import introsde.APP4.orchestrator.entities.SuggestedItem;
import introsde.APP4.orchestrator.entities.Suggestion;
import introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited;
import introsde.APP4.orchestrator.wsdl.app3user.Review;
import introsde.APP4.orchestrator.wsdl.app3user.User;

import org.junit.Test;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserLogicTest {

	private static Integer userID;
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
		
		userID = al.registerUser(generatedUser);
		assertNotEquals((int)0, (int)userID);
	}
	
	@Test
	public void test02CanGetUser() {
		User retrievedUser = al.getUser(userID);
		assertEquals(generatedUser.getFirstName(), retrievedUser.getFirstName());
		assertEquals(generatedUser.getUsername(), retrievedUser.getUsername());
	}
	
	@Test
	public void test03UpdateUserPreferences() {
		al.setUserPreference(userID, true, false);
		
		assertTrue(al.doesUserPreferParks(userID));
		assertFalse(al.doesUserPreferSheds(userID));
	}
	
	@Test
	public void test04SubmitReview() {
		Review review = new Review();
		review.setReview("Test Review");
		review.setVote(4);
		Integer parkReviewed = new Random().nextInt(470) + 1;
		review.setIdPark(parkReviewed);
		
		int n = al.getParkReviews(parkReviewed).size();
		al.postReview(userID,review);
		
		int m = al.getParkReviews(parkReviewed).size();
		assertTrue( (m == n+1) ); 
		
		int z = al.getUserReviews(userID).size();
		assertEquals((int)1, z);
	}
	
	@Test
	public void test05SubmitVisits() {
		PlaceVisited visit = new PlaceVisited();
		Integer parkVisited = new Random().nextInt(100) + 1;
		visit.setIdPark(parkVisited);
		visit.setVote(1);
		
		int n = al.getParkVisits(parkVisited).size();
		double nn = al.getParkLikePercent(parkVisited);
		al.addVisitedPlace(userID, visit);
		
		int m = al.getParkVisits(parkVisited).size();
		double mm = al.getParkLikePercent(parkVisited);
		assertTrue( (m == n+1) ); 
		assertTrue( (mm >= nn) ); 
	}
	
	@Test
	public void test06GetSuggestion() {
		Suggestion suggestion = al.getUserSuggestions(userID);
		assertNotNull(suggestion);
		System.out.println(suggestion.getMessage());
		
		for (SuggestedItem item : suggestion.getSuggestedItems()) {
			if(item.getPark() != null) {
				assertNotNull(item.getPark());
				System.out.println("Suggested PARK "+item.getPark().getParco());
			}
			else {
				assertNotNull(item.getShed());
				System.out.println("Suggested SHED "+item.getShed().getNome());
			}
		}
	}
	
	@Test
	public void test07GetKnownUserByName() {
		java.util.List<User> result = al.getUserByName("TEST");
		assertTrue(result.size()>0);
	}
	
	@Test(expected = com.sun.xml.ws.fault.ServerSOAPFaultException.class)
	public void test09DeleteUser() {
		al.deleteUser(userID);
		al.getUser(userID);
	}
	

}
