import java.util.*;

public class Sorts{
	private int[] c;
	public static void bubble(int[] c){
		int holder;
		for(int i=0;i<c.length;i++){
			if(c[i] > c[i+1]){
				holder = c[i];
				c[i] = c[i+1];
				c[i+1] = holder;
			}
		}
	}


	public static void main(String[]args){
		int[] a = new int[10];
		Random rand = new Random();
		for(int i=0;i<a.length;i++){
			a[i] = rand.nextInt(a.length);
		}
		System.out.println(a.toString());
	}
}
