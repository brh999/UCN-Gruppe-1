package test;
import ctrl.*;
import model.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFriendCtrl {

	private FriendCtrl fCtrl;
	private FriendCont fCont;
	private Friend f1;
	@BeforeEach
	void setUp() throws Exception {
		fCtrl = new FriendCtrl();
		fCont = FriendCont.getInstance();
		f1 = new Friend("James", "Jamesroad 33", "9283", "Aalborg", "4321");
		
		fCont.addFriend(f1);
		
	}

	@Test // Test findFriendByPhone() with an instanced Friend object, with his/her phone number, to find them within FriendCont.
	void test1() {
		assertEquals(f1, fCtrl.findFriendByPhone("4321"));
	}
	
	@Test // Test findFrindByPhone to return null, if friend does not exist with x phone number 
	void test2() {
		assertEquals(null, fCtrl.findFriendByPhone(""));
	}
	
	

}
