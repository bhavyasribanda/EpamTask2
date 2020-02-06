package EpamAss1.MavenProjectCreation;

import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class Chocolates extends Gifts {
	String name;
	public static TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	public Chocolates(int w, int p, String n){
		weight = w;
		cost = p;
		name = n;
		weigh.add(w);
		if(!tm.containsKey(p)) {
			tm.put(p, n);
		} else {
			tm.put(p,  tm.get(p));
		}
	}
	public Chocolates() {
		
	}
	public void sortChocolates() {
		for(int i : tm.keySet()){
			System.out.println(tm.get(i)+ " "+i);
		}
	}
	public void getChocolatesInRange(int low, int high){
		System.out.println("Candies in range Rs."+low+" Rs."+high+" are as follows:");
		for(int i : tm.keySet()){
			if(i >= low && i <= high){
				System.out.print(tm.get(i)+"--");
			}
		}
		System.out.println();
	}
}

