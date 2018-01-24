package introsde.APP4.orchestrator;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import introsde.APP4.orchestrator.wsdl.app1parks.Park;
import introsde.APP4.orchestrator.wsdl.app1parks.ParkImplService;
import introsde.APP4.orchestrator.wsdl.app1parks.ParkWebService;
import introsde.APP4.orchestrator.wsdl.app2shed.Shed;
import introsde.APP4.orchestrator.wsdl.app2shed.ShedImplService;
import introsde.APP4.orchestrator.wsdl.app2shed.ShedWebService;
import introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited;
import introsde.APP4.orchestrator.wsdl.app3user.Review;
import introsde.APP4.orchestrator.wsdl.app3user.User;
import introsde.APP4.orchestrator.wsdl.app3user.UserImplService;
import introsde.APP4.orchestrator.wsdl.app3user.UserWebService;

public class ApplicationLogic {

	private ParkWebService ws1;
	private ShedWebService ws2;
	private UserWebService ws3;
	
	
	public ApplicationLogic() {
		UserImplService service3 = new UserImplService();
        ws3 = service3.getUserImplPort();
        ParkImplService service1 = new ParkImplService();
        ws1 = service1.getParkImplPort();
        ShedImplService service2 = new ShedImplService();
        ws2 = service2.getShedImplPort();
	}
	
	private XMLGregorianCalendar getCurrentDateAsXMLCalendar() {
		GregorianCalendar c = new GregorianCalendar();
        XMLGregorianCalendar xmlCalendar;
		try {
			c.setTime(new Date());
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			return xmlCalendar;
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	public Integer registerUser(User user) {
        if (user.getId() != null) {
        	throw new IllegalArgumentException("User ID cannot be pre-assigned");
        }
        XMLGregorianCalendar xmlCalendar = getCurrentDateAsXMLCalendar();
        user.setRegisterDate(xmlCalendar);
		
        User addedUser = ws3.addUser(user);
        if(addedUser == null) {
        	throw new IllegalStateException("User not created succesfully");
        }
        return addedUser.getId();
	}
	
	public User getUser(Integer id) {
		return ws3.getUserById(id);
	}

	public void deleteUser(Integer givenId) {
		ws3.deleteUserById(givenId);
	}
	
	public void setUserPreference(Integer userID, boolean parks, boolean sheds) {
		ws3.setUserPreference(userID, parks, sheds);
	}
	
	public boolean doesUserPreferParks(Integer userID) {
		return ws3.userPreferParks(userID);
	}
	
	public boolean doesUserPreferSheds(Integer userID) {
		return ws3.userPreferSheds(userID);
	}
	
	public List<Park> getAllParks() {
		return ws1.getParkList();
	}

	public Park getParkByID(Integer parkID) {
		return ws1.getParkById(parkID);
	}
	
	public List<Shed> getAllSheds() {
		return ws2.getShedList();
	}

	public Shed getShedByID(Integer parkID) {
		return ws2.getShedById(parkID);
	}

	public void postReview(Integer userId, Review review) {
		review.setDate(getCurrentDateAsXMLCalendar());
		ws3.addReview(review, userId);
	}
	
	public void assVisitedPlace(Integer userId, PlaceVisited place) {
		place.setDate(getCurrentDateAsXMLCalendar());
		ws3.addPlaceVisited(place, userId);
	}

	public List<Review> getParkReviews(Integer parkID) {
		return ws3.getReviewsOfPark(parkID);
	}
	
	public List<PlaceVisited> getParkVisits(Integer parkID) {
		return ws3.getPlacesVisitedOfPark(parkID);
	}
	
	public List<Review> getShedReviews(Integer shedID) {
		return ws3.getReviewsOfShed(shedID);
	}
	
	public List<Review> getUserReviews(Integer userID) {
		return ws3.getReviewsOfUser(userID);
	}
}
