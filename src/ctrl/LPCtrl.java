package ctrl;

import model.*;

public class LPCtrl {

	public LPCtrl() {

	}

	public static LP findLPByTitle(String title) {
		LPCont lpc = LPCont.getInstance();
		LP lp = lpc.findLPByTitle(title);
		return lp;
	}

}
