package introsde.APP4.orchestrator.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import introsde.APP4.orchestrator.wsdl.app1parks.Park;
import introsde.APP4.orchestrator.wsdl.app2shed.Shed;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suggestedItem")
public class SuggestedItem {
	Park park;
	Shed shed;
	String reason;
	
	
	public Park getPark() {
		return park;
	}
	public void setPark(Park park) {
		this.park = park;
	}
	public Shed getShed() {
		return shed;
	}
	public void setShed(Shed shed) {
		this.shed = shed;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
