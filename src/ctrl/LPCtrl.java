package ctrl;

import model.*;

/**
 * 
 * @author Rasmus, Alex, Kasper, Danny (Gruppe 1)
 *
 */

public class LPCtrl {

	public LPCtrl() {

	}

	/**
	 * Returns LP by title
	 * 
	 * @param title Title of the LP
	 * @return LP
	 */

	public static LP findLPByTitle(String title) {
		LPCont lpc = LPCont.getInstance();
		LP lp = lpc.findLPByTitle(title);
		return lp;
	}

}
