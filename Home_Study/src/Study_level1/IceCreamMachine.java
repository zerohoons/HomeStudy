package Study_level1;

import java.util.ArrayList;

public class IceCreamMachine {
	
	public void scoops(String[] a, String[] b){
		ArrayList<String[]> ice = new ArrayList<String[]>();
		String[] cream = new String[2];
		if(a.length == 0 ) {
			
		}else if(a.length > b.length){
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					cream[0] = a[i];
					cream[1] = b[j];
					ice.add(cream);
				}
			}
		}else if(a.length<= b.length) {
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < a.length; j++) {
					cream[0] = a[j];
					cream[1] = b[i];
					ice.add(cream);
				}
			}
		}
		
		for (int i = 0; ice.isEmpty(); i++) {
			System.out.println(ice.get(i));	
		}
	}
	public static void main(String[] args) {
		IceCreamMachine ice = new IceCreamMachine();
		String[] a = {"vanilla", "chocolate"};
		String[] b = {"chocolate sauce"};
		
		ice.scoops(a,b);
	}	                                                
}
