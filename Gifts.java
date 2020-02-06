package EpamAss1.MavenProjectCreation;

import java.util.ArrayList;

public class Gifts {
	public int weight;
	public int cost;
	public static ArrayList<Integer> weigh = new ArrayList<Integer>();
	public int getWeight(){
		int totalWeight = 0;
		for(int i = 0; i < weigh.size();i++){
			totalWeight += weigh.get(i);
		}
		return totalWeight;
	}
}
