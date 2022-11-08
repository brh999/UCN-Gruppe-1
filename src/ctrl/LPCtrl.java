package ctrl;

import model.*;

public class LPCtrl {

	
	public LPCtrl(){
		
	}
	
	public LP findLPByTitle(String title) {
		LPCont lpc = LPCont.getInstamce();
		LP lp = lpc.findLPByTitle(title);
		return lp;
	}
	
}
