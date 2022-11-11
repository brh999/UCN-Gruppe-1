package model;

import java.util.ArrayList;

/**
 * This class is the container for LP objects.
 * 
 * @author Alex
 * @author Rasmus
 * @author Kasper
 * @author Danny
 *
 * @date 10/11/2022
 */
public class LPCont {

	private static LPCont instance;
	private ArrayList<LP> LPs;

	/**
	 * This method creates a ArrayList of LP objects as a singleton.
	 * 
	 * @return instance of LPCont
	 */
	public static LPCont getInstance() {
		if (instance == null) {
			instance = new LPCont();
		}
		return instance;
	}

	/**
	 * This is the constructor for the LPCont and creates an instance of LPs
	 */
	private LPCont() {
		LPs = new ArrayList<>();
	}

	/**
	 * This method finds LP by title in the ArrayList LPs
	 * 
	 * @param title of the LP
	 * @return LP with the specific title
	 */
	public LP findLPByTitle(String title) {
		LP res = null;
		boolean found = false;
		for (int i = 0; i < LPs.size() && !found; i++) {
			if (LPs.get(i).getTitle().equalsIgnoreCase(title)) {
				res = LPs.get(i);
				found = true;
			}
		}
		return res;
	}

	/**
	 * This method adds an specific LP to the ArrayList LPs
	 * 
	 * @param lp object of LP
	 */
	public void addLP(LP lp) {
		LPs.add(lp);
	}


}
