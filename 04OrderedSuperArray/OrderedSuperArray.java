public class OrderedSuperArray extends SuperArray{
	//constructors
	public OrderedSuperArray(){
		super();
	}
	public OrderedSuperArray(int size){
		super(size);
	}
	
	//add methods
    public void add(int index, String o){
		add(o);
    }
    public void add(String o){
		if(size() == 0){
		    super.add(o);
		}else{
	    	for(int i=0;i<size();i++){
				if(get(i).compareTo(o) > 0 && get(i+1).compareTo(o) <0){
		    		super.add(i,o);
				}
	    	}
		}
	}
	public String set(int index, String o){
		String s = get(index);
		remove(index);
		add(o);
		return s;
	}		
}
	
    
    
