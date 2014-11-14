import java.util.*;

public class arrayListMethods{
	public static void collapseDuplicates(ArrayList<Integer> L){
		for(int i=0; i < L.size()-1; i++){
			if(L.get(i).equals(L.get(i+1))){
				L.remove(i);
				i--;
			}
		}
	}
	public static void randomize(ArrayList<Integer> L){
		Random rand = new Random();
		for(int i=0; i<L.size(); i++){
			int holder = rand.nextInt(L.size());
			L.set(i,holder);
			L.set(holder, L.get(i));
		}
	}
	
	public static void main(String[]args){
		ArrayList<Integer> L = new ArrayList<Integer>();
		for(int i =0;i<10; i++){
			L.add(i);
		}
		System.out.println(L);
		L.add(9);
		L.add(0,0);
		L.add(4,4); 
		System.out.println(L);
		collapseDuplicates(L);
		System.out.println(L);
		
		
	}
}
			
