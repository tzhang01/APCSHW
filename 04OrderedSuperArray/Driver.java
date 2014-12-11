public class Driver{
	public static void main(String[]args){
	OrderedSuperArray L = new OrderedSuperArray();
	SuperArray g = new SuperArray(10);
	
	g.add("a");
	g.add("banana");
	g.add("caramel");
	g.add("airplane");
	System.out.println(g);

	g.insertionSort();
	g.add("hold");
	System.out.println(g);

	
	}
}
		
