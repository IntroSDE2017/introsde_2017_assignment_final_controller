package introsde.app4;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import introsde.APP4.orchestrator.ApplicationLogic;
import introsde.APP4.orchestrator.wsdl.app1parks.Park;

public class ParkLogicTest {
	private static ApplicationLogic al;
	@BeforeClass
	public static void setup() {
		al = new ApplicationLogic();
	}
	@Test
	public void testGetAllParks() {
		List<Park> result = al.getAllParks();
		assertTrue(result.size()>0);
	}
	@Test
	public void testGetSingleKnownPark() {
		Park result = al.getParkByID(1);
		assertEquals("Dolomiti di Brenta (IT3120177)", result.getParco());
	}
	@Test
	public void testGetKnownParkByName() {
		List<Park> result = al.getParkBySearch("Stelvio");
		assertTrue(result.size()>0);
	}

}
