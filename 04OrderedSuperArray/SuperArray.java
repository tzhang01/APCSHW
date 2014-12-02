public class SuperArray{
    private String[] a;
    private int current;

    public SuperArray(){
       	a = new String[10];
    }
    public SuperArray(int size){
       	a = new String[size];
    }
    public String toString(){
       	String str = "[";
       	for(int i = 0; i<a.length; i++){
	    str += " " + a[i];
	}
	str += "]";
	return str;
    }

    public void add(){
       	resize(a.length +1);
    }
    public void add(String e){
	if(a[a.length-1] ==  null){
	    String[] list = new String[a.length + 1];
	       	list = a;
	       	list[current] = e;
	       	current ++;
	       	a = list;
       	}else{
	    add();
	    add(e);
	}
    }
    public void add(int index, String o){
	if(a[a.length-1] == null){
	    String[] list = new String[a.length + 1];
	    for(int i = 0; i <index; i++){
		list[i] = a[i];
	    }
	    list[index] = o;
	    for(int i=index +1; i<list.length; i++){
		list[i] = a[i];
	    }
	    a = list;
	}else{
	    add();
	    add(index,o); 
	}
    }
    public int size(){
	int s = 0;
	if(a.length <=10){
	    for(int i =0; i <a.length; i++){
		if(a[i] == null){
		    break;
		}
		s++;
	    }
	}else{
	    return a.length;
	}
	return s;
    }
    public void resize(int newCapacity){
	String[] newArray = new String[newCapacity];
	if(a.length <= newCapacity){
	    for(int i = 0; i < a.length; i++){
		newArray[i] = a[i];
	    }
	}else{
	    for(int i =0; i<newCapacity; i++){
		newArray[i] = a[i];
	    }
	}
	a = newArray;
    }
    public void clear(){
	String[] newArray;
	if(a.length <=10){
	    newArray = new String[a.length];
	}else{
	    newArray = new String[10];
	}
	a = newArray;
	current = 0;
    }
    public String get(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}else{
	    return a[index];
	}
    }
    public String set(int index, String e){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException(); 
	}else{
	    String replaced = a[index];
	    a[index] = e;
	    return replaced;
	}
    }    	
    public void remove(int index){
	String hold = a[index];
	if(index < a.length){
	    if(a.length <= 10){
		a[index] = null;
			}else{
		String[] newArray = new String[a.length -1];
		for(int i=0; i<index;i++){
		    newArray[i] = a[i];
		}
		for(int i=index; i <newArray.length; i++){
		    newArray[i] = a[i+1];
		}
		a = newArray;
			}
	}else{
	    throw new IndexOutOfBoundsException();
	}	
    }
}