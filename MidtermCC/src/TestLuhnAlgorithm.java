import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestLuhnAlgorithm {

	//sets up and tears down as very first and very last thing
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//sets up and tears down between each test case
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//testing the algorithm with valid and invalid cards
	@Test
	public void testRunLuhnAlgorithm() {
		assertTrue("This should be correct", LuhnAlgorithm.runLuhnAlgorithm("4480521106387232"));
		assertTrue("This should be correct", LuhnAlgorithm.runLuhnAlgorithm("5456320070149794"));
		assertTrue("This should be incorrect", LuhnAlgorithm.runLuhnAlgorithm("4926304739274649"));
		assertTrue("This should be incorrect", LuhnAlgorithm.runLuhnAlgorithm("1029473810283754"));

		
	}

}
