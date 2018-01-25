package introsde.APP4.orchestrator.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suggestion")
public class Suggestion {
	List<SuggestedItem> suggestedItems;
	String message;
	
	public List<SuggestedItem> getSuggestedItems() {
		return suggestedItems;
	}
	public void setSuggestedItems(List<SuggestedItem> suggestedItems) {
		this.suggestedItems = suggestedItems;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}