public class driver{
    public static void main(String[]args){
	Integer x = new Integer(0);
	superArray L = new superArray();
	L.add(x);
       	L.add(new Integer(1));
	L.add(new Integer(2));
	L.add(new Integer(3));
	L.add(new Integer(4));
	L.add(new Integer(5));
	System.out.println(L);
	System.out.println(L.size());
	L.resize(15);
	System.out.println(L);
	System.out.println(L.size());
	//L.clear();
	System.out.println(L);
	System.out.println(L.get(0));
	System.out.println(L.get(1));
	L.set(5, x);
	System.out.println(L);
	System.out.println(L.get(3)); 
	System.out.println(L.get(0));
	System.out.println(L.get(15));
	System.out.println(L.get(30));
	//L.add(3, 7);
	//System.out.println(L);
	System.out.println(L.remove(3));
	System.out.println(L.remove(15));			   
    }
}
