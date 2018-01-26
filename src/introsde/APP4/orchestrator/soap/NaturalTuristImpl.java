package introsde.APP4.orchestrator.soap;

import java.util.List;

import javax.jws.WebService;

import introsde.APP4.orchestrator.ApplicationLogic;
import introsde.APP4.orchestrator.entities.Suggestion;
import introsde.APP4.orchestrator.wsdl.app1parks.Park;
import introsde.APP4.orchestrator.wsdl.app2shed.Shed;
import introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited;
import introsde.APP4.orchestrator.wsdl.app3user.Review;
import introsde.APP4.orchestrator.wsdl.app3user.User;


//Service Implementation
@WebService(endpointInterface = "introsde.APP4.orchestrator.soap.NaturalTuristWebService")
public class NaturalTuristImpl implements NaturalTuristWebService{

	private ApplicationLogic al = new ApplicationLogic();
	
	@Override
	public List<Park> getAllParks() {
		return al.getAllParks();
	}

	@Override
	public List<Park> searchParks(String name) {
		return al.getParkBySearch(name);
	}

	@Override
	public Park searchPark(Integer id) {
		return al.getParkByID(id);
	}

	@Override
	public List<Shed> getAllSheds() {
		return al.getAllSheds();
	}

	@Override
	public List<Shed> searchSheds(String name) {
		return al.getShedBySearch(name);
	}

	@Override
	public Shed searchShed(Integer id) {
		return al.getShedByID(id);
	}

	@Override
	public Integer registerUser(User user) {
		return al.registerUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return al.getAllUsers();
	}

	@Override
	public User searchUser(Integer userId) {
		return al.getUser(userId);
	}

	@Override
	public List<User> searchUsers(String name) {
		return al.getUserByName(name);
	}

	@Override
	public void setUserPreference(Integer userId, boolean parks, boolean sheds) {
		al.setUserPreference(userId, parks, sheds);
		
	}

	@Override
	public void postReview(Integer userId, Review review) {
		al.postReview(userId, review);
	}

	@Override
	public List<Review> getParkReviews(Integer parkId) {
		return al.getParkReviews(parkId);
	}

	@Override
	public List<Review> getShedReviews(Integer shedId) {
		return al.getShedReviews(shedId);
	}

	@Override
	public List<Review> getUserReviews(Integer userId) {
		return al.getUserReviews(userId);
	}

	@Override
	public void addVote(Integer userId, PlaceVisited visited) {
		al.addVisitedPlace(userId, visited);
	}

	@Override
	public Double getParkVote(Integer parkId) {
		return al.getParkLikePercent(parkId);
	}

	@Override
	public Double getShedVote(Integer shedId) {
		return al.getShedLikePercent(shedId);
	}

	@Override
	public Suggestion getSuggestion(Integer userId) {
		return al.getUserSuggestions(userId);
	}
	
}