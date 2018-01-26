package introsde.APP4.orchestrator.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import introsde.APP4.orchestrator.entities.Suggestion;
import introsde.APP4.orchestrator.wsdl.app1parks.Park;
import introsde.APP4.orchestrator.wsdl.app2shed.Shed;
import introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited;
import introsde.APP4.orchestrator.wsdl.app3user.Review;
import introsde.APP4.orchestrator.wsdl.app3user.User;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface NaturalTuristWebService{
    
	@WebMethod List<Park> getAllParks();
	@WebMethod List<Park> searchParks(String name);
	@WebMethod Park searchPark(Integer id);
	@WebMethod List<Shed> getAllSheds();
	@WebMethod List<Shed> searchSheds(String name);
	@WebMethod Shed searchShed(Integer id);
	
	@WebMethod Integer registerUser(User user);
	@WebMethod List<User> getAllUsers();
	@WebMethod User searchUser(Integer userId);
	@WebMethod List<User> searchUsers(String name);
	@WebMethod void setUserPreference(Integer userId, boolean parks, boolean sheds);
	
	@WebMethod void postReview(Integer userId, Review review);
	@WebMethod List<Review> getParkReviews(Integer parkId);
	@WebMethod List<Review> getShedReviews(Integer shedId);
	@WebMethod List<Review> getUserReviews(Integer userId);
	@WebMethod void addVote(Integer userId, PlaceVisited visited);
	@WebMethod Double getParkVote(Integer parkId);
	@WebMethod Double getShedVote(Integer shedId);
	
	@WebMethod Suggestion getSuggestion(Integer userId);
	
}