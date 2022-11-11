package ctrl;

import model.*;

/**
 * 
 * @author Rasmus, Alex, Kasper, Danny (Gruppe 1)
 *
 */

public class LPCtrl {

	/**
	 * Returns LP by title
	 * 
	 * @param title Title of the LP
	 * @return LP
	 */

	public LP findLPByTitle(String title) {
		return LPCont.getInstance().findLPByTitle(title);
	}

}
