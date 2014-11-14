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
	
	public static void main(String[]args){
		ArrayList<Integer> L = new ArrayList<Integer>();
		for(int i =0;i<99999; i++){
			L.add(i);
		}
		//System.out.println(L);
		//L.add(0);
		//System.
	}
}
			
