package introsde.APP4.orchestrator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import introsde.APP4.orchestrator.entities.SuggestedItem;
import introsde.APP4.orchestrator.entities.Suggestion;
import introsde.APP4.orchestrator.openweather.OpenWeatherMap;
import introsde.APP4.orchestrator.wsdl.app1parks.Park;
import introsde.APP4.orchestrator.wsdl.app1parks.ParkImplService;
import introsde.APP4.orchestrator.wsdl.app1parks.ParkWebService;
import introsde.APP4.orchestrator.wsdl.app2shed.Shed;
import introsde.APP4.orchestrator.wsdl.app2shed.ShedImplService;
import introsde.APP4.orchestrator.wsdl.app2shed.ShedWebService;
import introsde.APP4.orchestrator.wsdl.app3user.PlaceVisited;
import introsde.APP4.orchestrator.wsdl.app3user.RankedVisit;
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
		OpenWeatherMap map = new OpenWeatherMap();
		review.setWeather(map.getWeatherNow());
		ws3.addReview(review, userId);
	}
	
	public void addVisitedPlace(Integer userId, PlaceVisited place) {
		place.setDate(getCurrentDateAsXMLCalendar());
		ws3.addPlaceVisited(place, userId);
	}

	public List<Review> getParkReviews(Integer parkID) {
		return ws3.getReviewsOfPark(parkID);
	}
	
	public List<PlaceVisited> getParkVisits(Integer parkID) {
		return ws3.getPlacesVisitedOfPark(parkID);
	}

	public Double getParkLikePercent(Integer parkID) {
		List<PlaceVisited> visits = getParkVisits(parkID);
		if( visits.size() == 0 ) {
			return 0.0;
		}
		Double rating = 0.0;
		for(PlaceVisited visit : visits) {
			rating += visit.getVote();
		}
		rating = rating/visits.size();
		return rating;
	}
	
	public List<Review> getShedReviews(Integer shedID) {
		return ws3.getReviewsOfShed(shedID);
	}
	
	public List<PlaceVisited> getShedVisits(Integer shedID) {
		return ws3.getPlacesVisitedOfShed(shedID);
	}
	
	public Double getShedLikePercent(Integer shedID) {
		List<PlaceVisited> visits = getShedVisits(shedID);
		if( visits.size() == 0 ) {
			return 0.0;
		}
		Double rating = 0.0;
		for(PlaceVisited visit : visits) {
			rating += visit.getVote();
		}
		rating = rating/visits.size();
		return rating;
	}
	
	public List<Review> getUserReviews(Integer userID) {
		return ws3.getReviewsOfUser(userID);
	}
	
	public Suggestion getUserSuggestions(Integer userID) {
		User user = getUser(userID);															//Select the current user
		Suggestion suggestion = new Suggestion();
		suggestion.setMessage(getWeatherBasedMessage());												//Setting the weather message
		suggestion.setSuggestedItems(new ArrayList<SuggestedItem>());
		int randomChanceToSelectParks = (user.getPreference().isPreferenceParks()) ? 50 : 20;			//Load his preferences
		int randomChanceToSelectSheds = (user.getPreference().isPreferenceSheds()) ? 50 : 20;			//More chance to select it's preferred type
		int random = new Random().nextInt(randomChanceToSelectParks+randomChanceToSelectSheds) + 1;		//Get the random number
		List<Park> parks = ws1.getParkList();
		List<Shed> sheds = ws2.getShedList();
		
		SuggestedItem suggestion1 = new SuggestedItem();
		if (random<=(randomChanceToSelectParks)) {														//Wins Parks
			Park selectedPark = parks.get( new Random().nextInt(parks.size()) );
			suggestion1.setPark(selectedPark);			
		}
		else {																							//Wins Sheds
			Shed selectedShed = sheds.get( new Random().nextInt(sheds.size()) );
			suggestion1.setShed(selectedShed);
		}
		suggestion1.setReason("You might like");
		suggestion.getSuggestedItems().add(suggestion1);
		
		SuggestedItem suggestion2 = new SuggestedItem();
		SuggestedItem suggestion3 = new SuggestedItem();
		List<RankedVisit> rankedVisits = ws3.getMostRankedVisits();
		int secondRank = rankedVisits.get(1).getSum();
		for (RankedVisit visit : rankedVisits) {
			if (visit.getSum() < secondRank/2) {
				rankedVisits.remove(visit);
			}
		}
		RankedVisit visit1 = rankedVisits.get( new Random().nextInt(rankedVisits.size()) );
		rankedVisits.remove(visit1);
		RankedVisit visit2 = rankedVisits.get( new Random().nextInt(rankedVisits.size()) );
		if(visit1.getIdPark()!=null) {
			suggestion2.setPark( ws1.getParkById(visit1.getIdPark()));
		}
		else {
			suggestion2.setShed( ws2.getShedById(visit1.getIdShed())); 
		}
		if(visit2.getIdPark()!=null) {
			suggestion3.setPark( ws1.getParkById(visit2.getIdPark()));
		}
		else {
			suggestion3.setShed( ws2.getShedById(visit2.getIdShed())); 
		}
		suggestion2.setReason("Popular locations");
		suggestion3.setReason("Popular locations");
		suggestion.getSuggestedItems().add(suggestion2);
		suggestion.getSuggestedItems().add(suggestion3);
		
		SuggestedItem suggestion4 = new SuggestedItem();
		SuggestedItem suggestion5 = new SuggestedItem();
		List<Review> reviews = ws3.getReviewsOfUser(userID);
		List<Park> selectedParks = new ArrayList<Park>();
		List<Shed> selectedSheds = new ArrayList<Shed>();
		while (reviews.size()>0) {
			Review review = reviews.get(reviews.size()-1);
			if(review.getIdPark() != null) {
				Park reviewedPark = ws1.getParkById(review.getIdPark());
				List<String> placesList = Arrays.asList(reviewedPark.getComuni().split(",[ ]*"));
				for (Park park : parks) {
					for (String source : placesList) {
						if(park.getComuni().toLowerCase().contains(source.toLowerCase())) {
							selectedParks.add(park);
						}
					}
				}
			}
			else if(review.getIdShed() != null) {
				Shed reviewedShed = ws2.getShedById(review.getIdShed());
				String sector = reviewedShed.getSettoreAlpino();
				Float quota = reviewedShed.getQuota();
				for (Shed shed : sheds) {
					if(shed.getSettoreAlpino().toLowerCase().contains(sector.toLowerCase())) {
						if( Math.abs(shed.getQuota()-quota) <300 ) {
							selectedSheds.add(shed);
						}
					}
				}
			}
			reviews.remove(review);
		}
		suggestion4.setReason("Based on your reviews");
		suggestion5.setReason("Based on your reviews");
		if (selectedParks.size()>0) {
			Park randomPark = selectedParks.get(new Random().nextInt(selectedParks.size()));
			suggestion4.setPark( randomPark );
			selectedParks.remove(randomPark);
			suggestion.getSuggestedItems().add(suggestion4);
		}
		else if (selectedSheds.size()>0) {
			Shed randomShed = selectedSheds.get(new Random().nextInt(selectedSheds.size()));
			suggestion4.setShed( randomShed );
			selectedSheds.remove( randomShed );
			suggestion.getSuggestedItems().add(suggestion4);
		}
		
		if (selectedSheds.size()>0) {
			Shed randomShed = selectedSheds.get(new Random().nextInt(selectedSheds.size()));
			suggestion5.setShed( randomShed );
			suggestion.getSuggestedItems().add(suggestion5);
		}
		else if (selectedParks.size()>0) {
			Park randomPark = selectedParks.get(new Random().nextInt(selectedParks.size()));
			suggestion5.setPark( randomPark );
			suggestion.getSuggestedItems().add(suggestion5);
		}
		
		return suggestion;
	}

	private String getWeatherBasedMessage() {
		OpenWeatherMap map = new OpenWeatherMap();
		String result = "";
		if(map.getOkWeatherTomorrow()) {
			result += "Tomorrow the weather is perfect! You might be interested in visiting these places!\n"
					+ "Cloud coverage is expected to be " + map.getCloudCoverageTomorrow();
		}
		else {
			result += "Tomorrow the weather is " + map.getWeatherTomorrow() + " you might still be interested in planning a visit to these locations./n";
			if(map.isRainTomorrow()) {
				result += "Tomorrow morning it is expected to rain " + map.getRainTomorrow() + "mm... Dress UP!";
			}
			else if (map.isSnowTomorrow()) {
				result += "Tomorrow morning it is expected to snow " + map.getSnowTomorrow() + "mm... Better Stay safe for few days.";
			}
			else {
				result += "There is no rain expected tomorrow, but the clouds will cover " + map.getCloudCoverageTomorrow() + "% of the sky and the wind will blow " + map.getWindTomorrow() + " m/s";
			}
		}
		return result;
	}
}
