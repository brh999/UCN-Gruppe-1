package model;

import java.util.ArrayList;

public class LPCont {

	private static LPCont instance;
	private ArrayList<LP> LPs;

	public static LPCont getInstamce() {
		if (instance == null) {
			instance = new LPCont();
		}
		return instance;
	}

	private LPCont() {
		LPs = new ArrayList<>();
	}

	public LP findLPByTitle(String title) {
		LP res = null;

		for (int i = 0; i < LPs.size(); i++) {
			if (LPs.get(i).getTitle().equalsIgnoreCase(title)) {
				res = LPs.get(i);
			}
		}
		return res;
	}

}