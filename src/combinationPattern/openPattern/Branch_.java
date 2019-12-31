package combinationPattern.openPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ≤ø√≈
 * @author BillGL
 *
 */
public class Branch_ extends Corp {
	private ArrayList<Corp> ordinateList=new ArrayList<Corp>();
	
	
	public Branch_(String name, String description) {
		super(name, description);
		
	}

	@Override
	public void addSubordinate(Corp corp) {
		// TODO Auto-generated method stub
		ordinateList.add(corp);
	}

	@Override
	public void remove(Corp corp) {
		// TODO Auto-generated method stub
		ordinateList.remove(corp);
	}

	@Override
	public ArrayList<Corp> getSubordinate() {
		// TODO Auto-generated method stub
		return ordinateList;
	}

}
