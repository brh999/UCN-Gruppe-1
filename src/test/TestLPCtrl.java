package test;
import model.*;
import ctrl.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLPCtrl {

	private LPCtrl lCtrl;
	private LPCont lCont;
	private LP lp1;
	
	@BeforeEach
	void setUp() throws Exception {
		lCtrl = new LPCtrl();
		lCont = LPCont.getInstance();
		lp1 = new LP(9876, "TestLP", "Mr.Artist", "1998");
		lCont.addLP(lp1);
	}


	@Test // Test findLPByTitle() to find an instanced LP object by it's title.
	void test1() {
		assertEquals(lp1, lCtrl.findLPByTitle("TestLP"));
	}
	
	@Test // Test findLPByTitle() to return null, if a title given doesn't exist among LP objects.
	void test2() {
		assertEquals(null, lCtrl.findLPByTitle(""));
	}
	
}
