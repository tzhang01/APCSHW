public class OrderedSuperArray extends SuperArray{
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

}
	
    
    