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

	public static void insertion(int[] c){
		int temp;
		for(int i=1;i<c.length;i++){
			temp = c[i];
			for(int j =i-1;j>=0;j--){
				if(c[j] > c[i]){
					c[j+1] = c[j];
					c[j] = temp;
				}
			}
		}
	}
	
	public static void selection(int[] c){
		for(int i=0;i<c.length;i++){
			int small = c[i];
			int target = i;
			for(int j=i;j<c.length;j++){
				if(small >=c[j]){
					small = c[j];
					target = j;
				}
			}
			int temp = c[i];
			c[i] = small;
			c[target] = temp;
		}
	}

	public String toString(){
		String l = "";
		for(int i=0; i<c.length;i++){
			l += c[i] + " ";
		}
		return l;
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
