package introsde.app4;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import introsde.APP4.orchestrator.ApplicationLogic;
import introsde.APP4.orchestrator.wsdl.app2shed.Shed;

public class ShedLogicTest {

	private static ApplicationLogic al;
	@BeforeClass
	public static void setup() {
		al = new ApplicationLogic();
	}
	@Test
	public void testGetAllSheds() {
		List<Shed> result = al.getAllSheds();
		assertTrue(result.size()>0);
	}
	@Test
	public void testGetSingleKnownShed() {
		Shed result = al.getShedByID(1);
		assertEquals("SERRISTORI ALFREDO", result.getNome());
	}
	@Test
	public void testGetKnownShedByName() {
		List<Shed> result = al.getShedBySearch("BOLZANO");
		assertTrue(result.size()>0);
	}

}
