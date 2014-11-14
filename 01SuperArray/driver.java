public class driver{
	public static void main(String[]args){
	superArray L = new superArray();
	for(int i=0; i < L.size(); i++){
		L.add(i);
	}
	System.out.println(L);		
	L.add("Hi");
	System.out.println(L.size());
	L.add(1);
	System.out.println(L.size());
	L.add(2);
	System.out.println(L.size());
	L.add("sup");
	System.out.println(L.size());
	System.out.println(L.toString());
	L.add(9);
	System.out.println(L.size());
	System.out.println(L.toString());
	}
}
	
	
